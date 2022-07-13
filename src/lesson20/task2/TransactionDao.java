package lesson20.task2;

import lesson20.task2.exception.BadRequestException;
import lesson20.task2.exception.LimitExceededException;

import java.util.Calendar;
import java.util.Date;

public class TransactionDao {

    public Transaction[] transactions;

    public TransactionDao(Transaction[] transactions) {
        this.transactions = transactions;
    }

    private final Utils utils = new Utils();


    public Transaction save(Transaction transaction) throws BadRequestException {
        validate(transaction);
        return transaction;
    }

    private void validate(Transaction transaction) throws BadRequestException {
        if (transaction == null) {
            throw new NullPointerException("Please, choose your transaction");
        }
        if (transaction.getAmount() > utils.getLimitSimpleTransactionAmount())
            throw new LimitExceededException("Transaction limit exceeded " + transaction.getId() + " . Cant be saved");

        int sum = 0;
        int count = 0;
        for (Transaction tr : getTransactionsPerDay(transaction.getDateCreated())) {
            sum += tr.getAmount();
            count++;
        }
        if (sum > utils.getLimitTransactionPerDayAmount()) {
            throw new LimitExceededException("Transaction limit per day amount exceed " + transaction.getId() + " . Cant be saved");
        }
        if (count > utils.getLimitTransactionPerDayCount()) {
            throw new LimitExceededException("Transaction limit per day count exceed " + transaction.getId() + " . Cant be saved");
        }
        if (!isCityNoAccess(transaction)) {
            throw new BadRequestException("Your city not available " + transaction.getId() + " . Please, choose other city");
        }
        if (transactions.length > 10) {
            throw new BadRequestException("You have enough memory. Cant be saved");
        }


    }

    public Transaction[] transactionList() {
        Transaction[] result = new Transaction[resultCount()];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                result[index] = transaction;
                index++;
            }
        }
        return result;
    }

    public Transaction[] transactionList(String city) {
        Transaction[] result = new Transaction[resultCountCity(city)];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getCity().equals(city)) {
                result[index] = transaction;
                index++;
            }
        }
        return result;
    }

    public Transaction[] transactionList(int amount) {
        Transaction[] result = new Transaction[resultCountAmount(amount)];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getAmount() == amount) {
                result[index] = transaction;
                index++;
            }
        }
        return result;
    }

    private Transaction[] getTransactionsPerDay(Date dateOfCurTransaction) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOfCurTransaction);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        Transaction[] result = new Transaction[countTransactionsPerDay(dateOfCurTransaction)];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);

                if (trMonth == month
                        && trDay == day) {
                    result[index] = transaction;
                    index++;
                }
            }
        }
        return result;
    }

    private boolean isCityNoAccess(Transaction transaction) {
        String[] cities = utils.getCities();
        boolean isCityAvailable = false;
        for (String city : cities) {
            if (city.equals(transaction.getCity())) {
                isCityAvailable = true;
                break;
            }
        }
        return isCityAvailable;
    }

    private int resultCount() {
        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                count++;
            }
        }
        return count;
    }

    private int resultCountCity(String city) {
        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getCity().equals(city)) {
                count++;
            }
        }
        return count;
    }

    private int resultCountAmount(int amount) {
        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getAmount() == amount) {
                count++;
            }
        }
        return count;
    }

    private int countTransactionsPerDay(Date dateOfCurTransaction) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOfCurTransaction);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);

                if (trMonth == month
                        && trDay == day) {
                    count++;
                }
            }
        }
        return count;
    }
}

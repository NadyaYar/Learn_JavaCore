package lesson20.task2;

import lesson20.task2.exception.BadRequestEx;
import lesson20.task2.exception.InternalServerException;
import lesson20.task2.exception.LimitExceeded;

import java.util.Calendar;
import java.util.Date;

public class TransactionDao {

    public Transaction[] transactions;

    public TransactionDao(Transaction[] transactions) {
        this.transactions = transactions;
    }

    private final Utils utils = new Utils();


    Transaction save(Transaction transaction) throws BadRequestEx, InternalServerException {
        validate(transaction);
        return transaction;
    }

    private void validate(Transaction transaction) throws BadRequestEx, InternalServerException {
        if (transaction == null) {
            throw new NullPointerException("Please, choose your transaction");
        }
        if (transaction.getAmount() > utils.getLimitSimpleTransactionAmount())
            throw new LimitExceeded("Transaction limit exceeded " + transaction.getId() + " . Cant be saved");

        int sum = 0;
        int count = 0;
        for (Transaction tr : getTransactionsPerDay(transaction.getDateCreated())) {
            sum += tr.getAmount();
            count++;
        }

        if (sum > utils.getLimitTransactionPerDayAmount()) {
            throw new LimitExceeded("Transaction limit per day amount exceed " + transaction.getId() + " . Cant be saved");
        }

        if (count > utils.getLimitTransactionPerDayCount()) {
            throw new LimitExceeded("Transaction limit per day count exceed " + transaction.getId() + " . Cant be saved");
        }

        if (!isCityNoAccess(transaction)) {
            throw new BadRequestEx("Your city not available " + transaction.getId() + " . Please, choose other city");
        }

        if (transactions.length > 10) {
            throw new InternalServerException("You have enough memory. Cant be saved");
        }



    }

    Transaction[] transactionList() throws InternalServerException, BadRequestEx {
        Transaction[] result = new Transaction[resultCount()];
        int index = 0;
        for (Transaction transaction : transactions) {
            validate(transaction);
            if (transaction != null) {
                result[index] = transaction;
                index++;
            }
        }
        return result;
    }

    Transaction[] transactionList(String city) throws InternalServerException, BadRequestEx {
        Transaction[] result = new Transaction[resultCountCity(city)];
        int index = 0;
        for (Transaction transaction : transactions) {
            validate(transaction);
            if (transaction.getCity().equals(city)) {
                result[index] = transaction;
                index++;
            }
        }
        return result;
    }

    Transaction[] transactionList(int amount) throws InternalServerException, BadRequestEx {
        Transaction[] result = new Transaction[resultCountAmount(amount)];
        int index = 0;
        for (Transaction transaction : transactions) {
            validate(transaction);
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
        Transaction[] result = new Transaction[count];
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

    private int resultCount() throws InternalServerException, BadRequestEx {
        int count = 0;
        for (Transaction transaction : transactions) {
            validate(transaction);
            if (transaction != null) {
                count++;
            }
        }
        return count;
    }

    private int resultCountCity(String city) throws InternalServerException, BadRequestEx {
        int count = 0;
        for (Transaction transaction : transactions) {
            validate(transaction);
            if (transaction.getCity().equals(city)) {
                count++;
            }
        }
        return count;
    }

    private int resultCountAmount(int amount) throws InternalServerException, BadRequestEx {
        int count = 0;
        for (Transaction transaction : transactions) {
            validate(transaction);
            if (transaction.getAmount() == amount) {
                count++;
            }
        }
        return count;
    }
}

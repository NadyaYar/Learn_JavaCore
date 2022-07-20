package lesson20.task2;

import lesson20.task2.exception.BadRequestException;
import lesson20.task2.exception.LimitExceededException;

import java.util.Calendar;
import java.util.Date;

public class TransactionDao {

    public static Transaction[] transactions = new Transaction[10];

    private static final Utils utils = new Utils();

    public static Transaction save(Transaction transaction) throws BadRequestException {
        validate(transaction);
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] == null) {
                transactions[i] = transaction;
                break;
            }
        }
        return transaction;
    }

    private static void validate(Transaction transaction) throws BadRequestException {
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

    public static Transaction[] transactionList() {
       int  resultLength = resultCount();
        if (resultLength == 0) {
            return new Transaction[]{};
        }
        Transaction[] result = new Transaction[resultLength];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                result[index] = transaction;
                index++;
            }
        }
        return result;
    }

    public static Transaction[] transactionList(String city) {
        int resultLengthCity = resultCountCity(city);
        if (resultLengthCity == 0) {
            return new Transaction[]{};
        }
        Transaction[] result = new Transaction[resultLengthCity];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null
                    && transaction.getCity().equals(city)) {
                result[index] = transaction;
                index++;
            }
        }
        return result;
    }

    public static Transaction[] transactionList(int amount) {
        int resultLengthAmount = resultCountAmount(amount);
        if (resultLengthAmount == 0) {
            return new Transaction[]{};
        }
        Transaction[] result = new Transaction[resultLengthAmount];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null
                    && transaction.getAmount() == amount) {
                result[index] = transaction;
                index++;
            }
        }
        return result;
    }

    private static Transaction[] getTransactionsPerDay(Date dateOfCurTransaction) {
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

    private static boolean isCityNoAccess(Transaction transaction) {
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

    private static int resultCount() {
        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                count++;
            }
        }
        return count;
    }

    private static int resultCountCity(String city) {
        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getCity().equals(city)) {
                count++;
            }
        }
        return count;
    }

    private static int resultCountAmount(int amount) {
        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getAmount() == amount) {
                count++;
            }
        }
        return count;
    }

    private static int countTransactionsPerDay(Date dateOfCurTransaction) {
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

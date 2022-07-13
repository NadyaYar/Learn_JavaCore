package lesson20.task2;

import lesson20.task2.exception.BadRequestException;
import lesson20.task2.exception.InternalServerException;

public class Controller {

    private TransactionDao transactionDao;

    public Controller(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }

    public Transaction save(Transaction transaction) throws BadRequestException, InternalServerException {

        return transactionDao.save(transaction);
    }

    public Transaction[] transactionList() throws InternalServerException, BadRequestException {

        return transactionDao.transactionList();
    }

    public Transaction[] transactionList(String city) throws InternalServerException, BadRequestException {

        return transactionDao.transactionList(city);
    }

    public Transaction[] transactionList(int amount) throws InternalServerException, BadRequestException {

        return transactionDao.transactionList(amount);
    }
}

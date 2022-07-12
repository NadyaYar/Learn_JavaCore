package lesson20.task2;

import lesson20.task2.exception.BadRequestEx;
import lesson20.task2.exception.InternalServerException;

public class Controller {

    private TransactionDao transactionDao;

    public Controller(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }

    public Transaction save(Transaction transaction) throws BadRequestEx, InternalServerException {

        return transactionDao.save(transaction);
    }

    Transaction[] transactionList() throws InternalServerException, BadRequestEx {

        return transactionDao.transactionList();
    }

    Transaction[] transactionList(String city) throws InternalServerException, BadRequestEx {

        return transactionDao.transactionList(city);
    }

    Transaction[] transactionList(int amount) throws InternalServerException, BadRequestEx {

        return transactionDao.transactionList(amount);
    }
}

package lesson20.task2;

import lesson20.task2.exception.BadRequestException;

public class Controller {

    public static Transaction save(Transaction transaction) throws BadRequestException{

        return TransactionDao.save(transaction);
    }

    public static Transaction[] transactionList() {

        return TransactionDao.transactionList();
    }

    public static Transaction[] transactionList(String city) {

        return TransactionDao.transactionList(city);
    }

    public static Transaction[] transactionList(int amount)  {

        return TransactionDao.transactionList(amount);
    }
}

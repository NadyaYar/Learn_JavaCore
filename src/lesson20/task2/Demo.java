package lesson20.task2;

import lesson20.task2.exception.BadRequestException;
import lesson20.task2.exception.InternalServerException;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws BadRequestException, InternalServerException {

        Transaction transaction = new Transaction(1, "Paris", 5, "amount", TransactionType.OutCame, new Date());
        Transaction transaction1 = new Transaction(2, "Paris", 1, "amount", TransactionType.InCame, new Date());
        Transaction transaction2 = new Transaction(3, "London", 33, "amount", TransactionType.InCame, new Date());
        Transaction transaction3 = new Transaction(4, "London", 7, "amount", TransactionType.InCame, new Date());
        Transaction transaction4 = new Transaction(4, "London", 7, "amount", TransactionType.InCame, new Date());

        System.out.println(Controller.save(transaction));

        System.out.println(Arrays.toString(Controller.transactionList()));

        System.out.println(Arrays.toString(Controller.transactionList("London")));

        System.out.println(Arrays.toString(Controller.transactionList(7)));
    }
}
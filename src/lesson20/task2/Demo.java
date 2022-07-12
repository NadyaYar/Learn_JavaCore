package lesson20.task2;

import lesson20.task2.exception.BadRequestEx;
import lesson20.task2.exception.InternalServerException;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws BadRequestEx, InternalServerException {

        Transaction transaction = new Transaction(1, "Paris", 5, "amount", TransactionType.outCame, new Date());
        Transaction transaction1 = new Transaction(2, "Paris", 1, "amount", TransactionType.inCame, new Date());
        Transaction transaction2 = new Transaction(3, "London", 33, "amount", TransactionType.inCame, new Date());
        Transaction transaction3 = new Transaction(4, "London", 7, "amount", TransactionType.inCame, new Date());
        Transaction transaction4 = new Transaction(4, "London", 7, "amount", TransactionType.inCame, new Date());
        Transaction transaction5 = new Transaction(4, "London", 7, "amount", TransactionType.inCame, new Date());
        Transaction transaction6 = new Transaction(4, "London", 8, "amount", TransactionType.inCame, new Date());
        Transaction transaction7 = new Transaction(4, "London", 7, "amount", TransactionType.inCame, new Date());
        Transaction transaction8 = new Transaction(4, "London", 5, "amount", TransactionType.inCame, new Date());
        Transaction transaction9 = new Transaction(4, "London", 9, "amount", TransactionType.inCame, new Date());



        Transaction[] transactions = {transaction1, transaction2, transaction3,transaction4,
                transaction5,transaction6,transaction7,transaction8,transaction9};

        TransactionDao transactionDao = new TransactionDao(transactions);

        Controller controller = new Controller(transactionDao);

        System.out.println(controller.save(transaction));

        System.out.println(Arrays.toString(controller.transactionList()));

        System.out.println(Arrays.toString(controller.transactionList("London")));

        System.out.println(Arrays.toString(controller.transactionList(7)));
    }
}

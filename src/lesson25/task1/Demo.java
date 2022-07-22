package lesson25.task1;

public class Demo {
    public static void main(String[] args) throws Exception {
        GeneralDao abstractDao = new GeneralDao();

        Order order = new Order(1);
        abstractDao.validate(order);

        TestClass<String, Order, Long> testClass = new TestClass<>();
        System.out.println(testClass.doSomethingT("rrr"));


        // long - Long
        // int - Integer
        //short - Short

        long variable = 11;

//        Long variable1 = new Long(22);

//        abstractDao.validate(variable1);
//
//        abstractDao.validate(variable);
    }

}

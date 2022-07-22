package lesson25.task1;

public class GeneralDao {

    private void print(Order order) {
        System.out.println("order is : " + order.toString());
    }

    public <T extends Id> void validate(T t) throws Exception {
        if (t.getId() <= 0) {
            throw new Exception("Id can not be negative");
        }
    }

    public <K> void validate(K k) {
        if (k.equals(100)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}

package lesson24.firstEx;

public class Demo<T> {

//    private printUser(User user){
//        print
//    }

//    private printSolution(Solution solution){
//        print
//    }

    public void print(T t) {
        System.out.println(t);
    }

    private static void countPrice(AbstractOrder abstractOrder) {
        System.out.println(abstractOrder.getPrice());
    }

//    private  static void countPriceTwo(SecondOrder secondOrder){
//        System.out.println(secondOrder.getPrice());
//    }

    public static void main(String[] args) {
        countPrice(new FirstOrder());
        countPrice(new SecondOrder());
    }
}

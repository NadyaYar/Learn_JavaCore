package Lesson18;

public class ArrayEx {
    public static void main(String[] args) {
        int [] array = {1,5,0};
        try {
            System.out.println(array[2]);
        } catch (Exception e) {
            System.err.println("element was not found");
        } finally {

        }
//        } catch (type2 e){
//
//        }


        System.out.println("cool...");
        System.out.println("cool2...");
    }
}

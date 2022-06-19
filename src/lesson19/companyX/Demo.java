package lesson19.companyX;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {


        File file = new File(4, "he", "ipg", 1223);

        File file1 = new File(5, "hew", "ipg", 12213);

        File file2 = new File(6, "hes", "ipg", 12213);

        File file3 = new File(6, "hes1", "ipg", 12213);

        File[] files = {file, file1, file2};
        File[] files1 = {file1, file2,null};
        Controller controller = new Controller();


        Storage storage = new Storage(123, files, "something");

        Storage storage1 = new Storage(123, files1, "something");



        controller.transferFile(storage,storage1,4);
        System.out.println(Arrays.toString(storage.getFiles()));


    }
}

package lesson19.companyX;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws Exception {


        File file = new File(1, "he", "jpg", 11111111);

        File file1 = new File(2, "hew", "jpg", 44444444);

        File file2 = new File(3, "grt", "jpg", 4);

        File file3 = new File(7, "hes1", "qwey", 55);

        File[] files = {file, file1,  null, file3};
        File[] files1 = {null, null, file};
        String[] format = {"jpg", "png", "img"};
        Controller controller = new Controller();


        Storage storage = new Storage(123, files, format, "Uk", 45);

        Storage storage1 = new Storage(125, files1, format, "Uk", 489);


//        controller.transferFile(storage,storage1,4);
//        System.out.println(Arrays.toString(storage.getFiles()));
//        System.out.println(Arrays.toString(storage1.getFiles()));

//        controller.transferAll(storage,storage1);
//        System.out.println(Arrays.toString(storage.getFiles()));
//        System.out.println(Arrays.toString(storage1.getFiles()));

        controller.put(storage, file2);

        System.out.println(Arrays.toString(storage.getFiles()));

    }
}

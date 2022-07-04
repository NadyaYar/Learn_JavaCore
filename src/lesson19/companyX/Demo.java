package lesson19.companyX;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws Exception {


        File file = new File(7, "fd", "jpg", 48);

        File file1 = new File(2, "h", "jpg", 2);

        File file2 = new File(3, "g", "jpg", 3);

        File file3 = new File(7, "hes", "jpg", 5);

        File[] files = {file, null, file3};
        File[] files1 = {null, file2};
        String[] format = {"jpg", "png", "img"};
        Controller controller = new Controller();


        Storage storage = new Storage(123, files, format, "Uk", 45);

        Storage storage1 = new Storage(125, files1, format, "Uk", 489);

//        controller.put(storage,file1);
//
//
//        controller.transferFile(storage,storage1,4);
//        System.out.println(Arrays.toString(storage.getFiles()));
//        System.out.println(Arrays.toString(storage1.getFiles()));
//
//        controller.transferAll(storage,storage1);
//        System.out.println(Arrays.toString(storage.getFiles()));
//        System.out.println(Arrays.toString(storage1.getFiles()));
//
//     controller.transferFile(storage,storage1,7);
//        System.out.println(Arrays.toString(storage1.getFiles()));
        controller.put(storage, file1);
        System.out.println(Arrays.toString(storage.getFiles()));
    }
}

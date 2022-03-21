package lesson11.BigInterfaceEx;

public class Demo {
    public static void main(String[] args) {
        File file1 = new File("test","C:/user/home","txt",11);
        File file2 = new File("test","C:/user/home","txt",11);
        File file3 = new File("video","C:/user/home","txt",11);
        File file4 = new File("test","C:/user/home","txt",11);
        File file5 = new File("myhome","C:/user/home","jpg",110);
       File[] files = new File[]{file1,file2,file3,file4,null};
        Storage storage = new Storage(files);
        FileReader fileReader = new FileReader();
        SimpleReader simpleReader = new SimpleReader();
        read(storage,fileReader);
        read(storage,simpleReader);
    }
    private  static void read(Storage storage ,Readable readable){
        System.out.println("max file will be printed now...");
        readable.readFilesFromStorage(storage);
        System.out.println();
    }
}

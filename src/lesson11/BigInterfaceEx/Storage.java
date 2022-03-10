package lesson11.BigInterfaceEx;

public class Storage {
   private File [] files = new File[5];

    public File[] getFiles() {
        return files;
    }

    public Storage(File[] files) {
        this.files = files;

    }
}

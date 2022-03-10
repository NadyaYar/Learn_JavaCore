package lesson11.BigInterfaceEx;

public class FileReader implements Readable {
    @Override
    public void readFilesFromStorage(Storage storage) {
        // найти файл макс размера
        // вивід всієї інформ
        printFile(findMaxSizeFile(storage.getFiles()));
    }

    private File findMaxSizeFile(File[] files) {
        File maxSizeFile = files[0];
        for (File file : files) {
            if (file != null && file.getSize() > maxSizeFile.getSize()) {
                maxSizeFile = file;
            }
        }
        return maxSizeFile;
    }

    private void printFile(File file) {
        System.out.println(file.getName());
        System.out.println(file.getSize());
        System.out.println(file.getExtention());
        System.out.println(file.getPath());
    }

}

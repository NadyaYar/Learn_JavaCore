package lesson19.companyX;

public class Controller {
    public Controller() {
    }

    public static void put(Storage storage, File file) {
        File[] files = storage.getFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i] == null) {
                files[i] = file;
                storage.setFiles(files);
                break;
            }
        }
    }

    private static void delete(Storage storage, File file) {

    }

    private static void transferFile(Storage storageFrom, Storage storageTo, long id) {

    }

    private static void transferAll(Storage storageFrom, Storage storageTo) {

    }
}

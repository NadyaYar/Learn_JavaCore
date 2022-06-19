package lesson19.companyX;

public class Controller {

    public void put(Storage storage, File file) {
        File[] files = storage.getFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i] == null) {
                files[i] = file;
                storage.setFiles(files);
                break;
            }
        }
    }

    public void delete(Storage storage, File file) {
        File[] files = storage.getFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i] == file) {
                files[i] = null;
                break;
            }
        }
    }

    public void transferFile(Storage storageFrom, Storage storageTo, long id) {
        File [] files = storageFrom.getFiles();
        storageFrom.setFiles(files);
        for (int i = 0; i < files.length; i++){
            if (files[i].getId() == id){
                delete(storageFrom,files[i]);
                put(storageTo,files[i]);
            }
        }
    }

    public void transferAll(Storage storageFrom, Storage storageTo) {

    }
}

package lesson19.companyX;

import java.util.Arrays;
import java.util.Objects;

public class Controller {

    public void put(Storage storage, File file) throws Exception {
        File[] files = storage.getFiles();
        if (!isFormatSupport(storage, file.getFormat())) {
            throw new Exception("Your format don`t support");
        }
        for (int i = 0; i < files.length; i++) {
            if (files[i] == null) {
                files[i] = file;
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

    public void transferFile(Storage storageFrom, Storage storageTo, long id) throws Exception {
        File[] files = storageFrom.getFiles();
        for (File value : files) {
            if (value.getId() == id) {
                delete(storageFrom, value);
                put(storageTo, value);
            }
        }
    }

    public void transferAll(Storage storageFrom, Storage storageTo) throws Exception {
        File[] files = storageFrom.getFiles();
        for (File file : files) {
            delete(storageFrom, file);
            put(storageTo, file);
        }
    }

    private boolean isFormatSupport(Storage storage, String fileFormat) {
        boolean isFormatInStorage = false;
        for (String formatSupport : storage.getFormatSupports()) {
            if (formatSupport.equals(fileFormat)) {
                isFormatInStorage = true;
                break;
            }
        }
        return isFormatInStorage;
    }
//    private  boolean size(Storage storage, long fileSize){
//
//    }
}


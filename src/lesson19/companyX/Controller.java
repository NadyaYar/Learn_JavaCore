package lesson19.companyX;

import java.util.Objects;

public class Controller {

    public void put(Storage storage, File file) {
        File[] files = storage.getFiles();

        for (int i = 0; i < files.length; i++) {
            IsFormatSupport(storage,file);
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

    public void transferFile(Storage storageFrom, Storage storageTo, long id) {
        File[] files = storageFrom.getFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].getId() == id) {
                File file = files[i];
                delete(storageFrom, file);
                put(storageTo, file);
            }
        }
    }

    public void transferAll(Storage storageFrom, Storage storageTo) {
        File[] files = storageFrom.getFiles();
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            delete(storageFrom, file);
            put(storageTo, file);
        }
    }

    private  void IsFormatSupport(Storage storage, File file) {
        for (int i = 0; i < storage.getFormatSupports().length; i++) {
            try {
                Objects.equals(storage.getFormatSupports()[i], file.getFormat());
            } catch (Exception e) {
                System.out.println("Your file don`t support");
            }
        }
    }

//    private static void countSymbol(File file) {
//        String name = file.getName();
//        try {
//            for (char symbol : name.toCharArray()) {
//                        for (symbol = 0; symbol < name.toCharArray().length; symbol++){
//                            boolean b = symbol > 10;
//                        }
//            }
//        } catch () {
//
//                }

    }


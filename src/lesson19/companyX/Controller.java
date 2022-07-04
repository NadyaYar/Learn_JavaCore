package lesson19.companyX;

public class Controller {

    public void put(Storage storage, File file) throws Exception {
        File[] files = storage.getFiles();
        if (checkNull(storage, file)) {
            throw new NullPointerException("You have null. Please, enter your data. Id of file with error: " + file.getId());
        }
        if (isFormatSupport(storage, file.getFormat())) {
            throw new Exception("Your format don`t support. Please, choose other format. Id of file with error: " + file.getId());
        }
        if (hasStorageMemory(storage, file)) {
            throw new Exception("Check size of your file. You have not enough memory. Id of file with error: " + file.getId());
        }
        if (!hasSameId(storage, file)) {
            throw new Exception("You have file with same id. Please, choose other id. Id of file with error: " + file.getId());
        }
        for (int i = 0; i < files.length; i++) {
            if (files[i] == null) {
                files[i] = file;
                break;
            }
        }
    }

    public void delete(Storage storage, File file) throws NullPointerException {
        File[] files = storage.getFiles();
        if (checkNull(storage, file)) {
            throw new NullPointerException("Please, choose your file");
        }
        for (int i = 0; i < files.length; i++) {
            if (files[i] == file) {
                files[i] = null;
                break;
            }
        }
    }

    public void transferFile(Storage storageFrom, Storage storageTo, long id) throws Exception {
        File[] files = storageFrom.getFiles();
        for (File file : files) {
            if (checkNull(storageFrom, file)) {
                throw new NullPointerException("You have null. Please, enter your data" + file.getId());
            }
            if (isFormatSupport(storageTo, file.getFormat())) {
                throw new Exception("Your format do not support" + file.getId());
            }
            if (hasStorageMemory(storageTo, file)) {
                throw new Exception("You have not enough memory" + file.getId());
            }
            if (hasSameId(storageTo, file)) {
                throw new Exception("You have file with same id" + file.getId());
            }
            if (file.getId() == id) {
                delete(storageFrom, file);
                put(storageTo, file);
            }
        }
    }

    public void transferAll(Storage storageFrom, Storage storageTo) throws Exception {
        File[] files = storageFrom.getFiles();
        for (File file : files) {
            if (checkNull(storageFrom, file)) {
                throw new NullPointerException("You have null. Please, enter your data" + file.getId());
            }
            if (isFormatSupport(storageTo, file.getFormat())) {
                throw new Exception("Your format do not support" + file.getId());
            }
            if (hasStorageMemory(storageTo, file)) {
                throw new Exception("You have not enough memory" + file.getId());
            }
            if (hasSameId(storageTo, file)) {
                throw new Exception("You have file with same id" + file.getId());
            }
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
        return !isFormatInStorage;
    }

    private boolean hasStorageMemory(Storage storage, File file) {
        File[] files = storage.getFiles();
        long sizeFiles = 0;
        for (File file1 : files) {
            if (file1 != null) {
                sizeFiles += file1.getSize();
            }
        }
        return storage.getStorageSize() > sizeFiles + file.getSize();
    }


    private boolean hasSameId(Storage storage, File file) {
        File[] files = storage.getFiles();
        for (File file1 : files) {
            if (file1 != null
                    && file1.getId() != file.getId()) {
                return true;
            }
        }
        return false;
    }

    private boolean checkNull(Storage storage, File file) {
        boolean isNull = false;
        File[] files = storage.getFiles();
        String[] formatArray = storage.getFormatSupports();
        if (files != null
                && file != null
                && formatArray != null) {
            isNull = true;
        }
        return !isNull;
    }
}


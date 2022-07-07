package lesson19.companyX;

public class Controller {

    public void put(Storage storage, File file) throws Exception {
        File[] files = storage.getFiles();
        validate(storage, file);
        for (int i = 0; i < files.length; i++) {
            if (files[i] == null) {
                files[i] = file;
                break;
            }
        }
    }

    public void delete(Storage storage, File file) throws NullPointerException {
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
        for (File file : files) {
            if (file.getId() == id) {
                delete(storageFrom, file);
                put(storageTo, file);
            }
            validate(storageTo, file);
        }
    }

    public void transferAll(Storage storageFrom, Storage storageTo) throws Exception {
        File[] files = storageFrom.getFiles();
        for (File file : files) {
            validate(storageTo, file);
        }
        for (File file : files) {
            delete(storageFrom, file);
            put(storageTo, file);
        }
    }


    private boolean isFormatNotSupport(Storage storage, String fileFormat) {
        boolean isFormatInStorage = false;
        for (String formatSupport : storage.getFormatSupports()) {
            if (formatSupport.equals(fileFormat)) {
                isFormatInStorage = true;
                break;
            }
        }
        return !isFormatInStorage;
    }

    private boolean isStorageFull(Storage storage, File file) {
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

    private boolean isNull(Storage storage, File file) {
        File[] files = storage.getFiles();
        String[] formatArray = storage.getFormatSupports();
        return storage != null
                && files != null
                && file != null
                && formatArray != null;
    }

    private void validate(Storage storage, File file) throws Exception {
        if (!isNull(storage, file)) {
            throw new NullPointerException("You have null. Please, enter your data. Id of file with error: " + file.getId());
        }
        if (isFormatNotSupport(storage, file.getFormat())) {
            throw new Exception("Your format don`t support. Please, choose other format. Id of file with error: " + file.getId());
        }
        if (!isStorageFull(storage, file)) {
            throw new Exception("Check size of your file. You have not enough memory. Id of file with error: " + file.getId());
        }
        if (!hasSameId(storage, file)) {
            throw new Exception("You have file with same id. Please, choose other id. Id of file with error: " + file.getId());
        }
    }
}


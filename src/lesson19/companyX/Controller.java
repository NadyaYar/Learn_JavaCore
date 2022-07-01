package lesson19.companyX;

public class Controller {

    public void put(Storage storage, File file) throws Exception {
        File[] files = storage.getFiles();
        if (!checkNull(storage, file)) {
            throw new NullPointerException("Please, enter your data");
        }
        if (!isFormatSupport(storage, file.getFormat())) {
            throw new Exception("Your format don`t support");
        }
        if (!size(storage, file)) {
            throw new Exception("You have not memory");
        }
        if (!sameId(storage, file)) {
            throw new Exception("You have file with same id");
        }
        if (!checkName(file)) {
            throw new Exception("Your name is big. Please, enter a name of less than 10 symbols.");
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

    private boolean size(Storage storage, File file) {
        boolean isHasSize = false;
        File[] files = storage.getFiles();
        for (File file1 : files) {
            if (file1 != null) {
                long sizeFiles = file1.getSize() + file.getSize();
                if (storage.getStorageSize() > sizeFiles) {
                    isHasSize = true;
                    break;
                }
            }
        }
        return isHasSize;
    }

    private boolean sameId(Storage storage, File file) {
        boolean isIdSame = false;
        File[] files = storage.getFiles();
        for (File file1 : files) {
            if (file1 != null
                    && file1.getId() != file.getId()) {
                isIdSame = true;
                break;
            }
        }
        return isIdSame;
    }

    private boolean checkName(File file) {
        boolean isNameLarge = false;
        String name = file.getName();
        char[] array = name.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array.length < 10) {
                isNameLarge = true;
                break;
            }
        }
        return isNameLarge;
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
        return isNull;
    }
}


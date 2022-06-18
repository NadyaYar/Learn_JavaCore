package lesson19.companyX;

public class Storage {
    long id;
    File[] files;
    String[] formatSupports;
    String storageCountry;
    long storageSize;


    public Storage(long id, File[] files, String[] formatSupports, String storageCountry, long storageSize) {
        this.id = id;
        this.files = files;
        this.formatSupports = formatSupports;
        this.storageCountry = storageCountry;
        this.storageSize = storageSize;
    }

    public Storage(int id, File[] files, String something) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public File[] getFiles() {
        return files;
    }

    public File[] setFiles(File[] files) {
        this.files = files;
        return files;
    }

    public String[] getFormatSupports() {
        return formatSupports;
    }

    public void setFormatSupports(String[] formatSupports) {
        this.formatSupports = formatSupports;
    }

    public String getStorageCountry() {
        return storageCountry;
    }

    public void setStorageCountry(String storageCountry) {
        this.storageCountry = storageCountry;
    }

    public long getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(long storageSize) {
        this.storageSize = storageSize;
    }
}




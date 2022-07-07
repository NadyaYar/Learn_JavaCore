package lesson19.companyX;

import java.util.Arrays;

public class Storage {
  private   long id;
  private   File[] files;
  private   String[] formatSupports;
  private   String storageCountry;
  private   long storageSize;

    public Storage(long id, File[] files, String[] formatSupports, String storageCountry, long storageSize) {
        this.id = id;
        this.files = files;
        this.formatSupports = formatSupports;
        this.storageCountry = storageCountry;
        this.storageSize = storageSize;
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

    public void setFiles(File[] files) {
        this.files = files;
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




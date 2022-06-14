package Lesson18.homework;

public class HandleError {
    public static void main(String[] args) {
        MusicStorage musicStorage = new MusicStorage();
        String[] fileNames = {"1name", "2name", "3name", "4name"};
        musicStorage.setFiles(fileNames);

        print5thName(musicStorage);

        PictureStorage pictureStorage = new PictureStorage();
        String[] fileNames1 = {"1name", "2name", "3name", "4name", "5name", "6name", "7name"};
        pictureStorage.setFiles(fileNames1);

        print5thName(pictureStorage);

        VideoStorage videoStorage = new VideoStorage();
        videoStorage.setFiles(null);

        print5thName(videoStorage);

    }

    private static void print5thName(Storage storage) {
        String[] names = storage.getFiles();
        try {
            System.out.println("5TH NAME IS " + names[4]);
        } catch (Exception e) {
            System.err.println("5th name can not be found..");
            System.err.println(e.getMessage());
        }
    }
}

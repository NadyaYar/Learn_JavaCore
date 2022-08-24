package lesson29.files;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorIntro {
    public static void main(String[] args) {

        Set<File> files = new HashSet<>(); // не гарантує порядок

        File file = new File("0ne", 123);
        File file1 = new File("Two", 54);
        File file2 = new File("Two", 54);
        File file3 = new File("Three", 21);

        files.add(file);
        files.add(file1);
        files.add(file2);
        files.add(file3);

        Iterator<File> fileIterator = files.iterator();
        while (fileIterator.hasNext()) {
            System.out.println(fileIterator.next().getFileName());
        }
    }
}

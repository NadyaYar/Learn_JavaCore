package lesson29.files;

import java.util.HashSet;
import java.util.Set;

public class SetIntro {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("testString");
        set.add("1");
        set.add("aa");
        set.add("aa");
        System.out.println(set);

        Set<File> files = new HashSet<>();

        File file = new File("0ne", 123);
        File file1 = new File("Two", 54);
        File file2 = new File("Two", 54);
        File file3 = new File("Three", 21);

        files.add(file);
        files.add(file1);
        files.add(file2);
        files.add(file3);

        System.out.println(files);
    }
}

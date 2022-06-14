package Lesson16.homework;

import java.util.Arrays;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        String test = "some text in this message in this this this";

        System.out.println(maxWords(test));
        System.out.println(minWords(test));
        System.out.println(mostCountedWord(test));
        System.out.println(countWords("       d         f    "));
//        System.out.println(countWords("hello, my dear"));
        System.out.println(Arrays.toString(countDuplicates(test, new String[]{"in", "this"})));

        System.out.println(validate("http://www.w3schools.com"));
        System.out.println(validate("https://www.w3schools.com/ks"));
        System.out.println(validate("hseyettps://www.w3schools.com/"));
    }

    public static int countWords(String input) {
        int count = 0;
        for (String string : input.split(" ")) {
            if (!string.equals("")) {
                count++;
            }
        }
        return count;
    }

    public static String maxWords(String input) {
        String[] stings = input.split(" ");
        String max = "";
        for (String string : stings) {
            if (max.length() < string.length()) {
                max = string;
            }
        }
        return max;
    }

    public static String minWords(String input) {
        String[] stings = input.split(" ");
        String min = stings[0];
        for (String string : stings) {
            if (min.length() > string.length()) {
                min = string;
            }
        }
        return min;
    }

    public static String mostCountedWord(String input) {
        String[] words = input.split(" ");
        int[] result = countDuplicates(input, words);
        int max = 0;
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            if (max < result[i]) {
                max = result[i];
                index = i;
            }
        }
        return words[index];
    }

    public static int[] countDuplicates(String input, String[] words) {
        String[] strings = input.split(" ");
        int[] res = new int[words.length];

        for (String string : strings) {
            for (int i = 0; i < words.length; i++) {
                if (string.equals(words[i]))
                    res[i]++;
            }
        }
        return res;
    }

    public static boolean validate(String address) {
        String addressWithoutProtocol;
        if (address.startsWith("http://")) {
            addressWithoutProtocol = address.replace("http://", "");
        } else if (address.startsWith("https://")) {
            addressWithoutProtocol = address.replace("https://", "");
        } else {
            return false;
        }
        String domen = addressWithoutProtocol.split("/")[0];


        if (!domen.endsWith(".com")
                && !domen.endsWith(".org")
                && !domen.endsWith(".net")) {
            return false;
        }
        String addressAfterDomen = addressWithoutProtocol.replace(domen, "");
        for (char symbol : addressAfterDomen.toCharArray()) {
            if (!Character.isLetter(symbol)
                    && !Character.isDigit(symbol)
                    && symbol != '/') {
                return false;
            }
        }
        return true;
    }

}


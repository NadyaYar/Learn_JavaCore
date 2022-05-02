package Lesson16;

public class StringMethods {
    public static void main(String[] args) {

        String test = "someString";

        test.isEmpty(); // наповненість методу вертає boolean
        System.out.println(test.isEmpty());

        test.length(); // довжина
        System.out.println(test.length());

        test.charAt(0); // знаходить char на певній позиції
        System.out.println(test.charAt(0));

        test.replace("e","T"); // приймає string якій замінюємо і на якій міняємо

        System.out.println(test.replaceAll("te","a"));
        // regex - шаблон string , правило для string

        test.contains("e"); // перевіря чи стрінг має інший стрінг
        System.out.println(test.contains("g"));

        test.getBytes(); // примітивний тип які отримує масив байтів

        test.intern(); // додає стрінг у стрінг pool

        test.equals("ee"); //

        test.split("e"); // ділить стрінг на масив підстрінгов

        test.trim(); // удаляє пробіли на початку чи вкінці стрінга

        test.substring(1); //

        test.toUpperCase(); // у великі букви

        test.toLowerCase(); // у малі букви

    }
}

package Lesson5;

import java.util.Arrays;

public class WithDraw {
    public static void main(String[] args) {
        String[] names = {"kate", "anna", "nadya", "oleh"};
        int[] balances = {100, 500, 92, -19};
        withdraw(names, balances, "anna", 10000);
        System.out.println(Arrays.toString(balances));
    }
    public static int withdraw(String[] clients, int[] balances, String client, int money) {
        int clientindex = 0;
        for (String el : clients) {
            if (el == client) {
                break;
            }
            clientindex++;
        }
        if (balances[clientindex] < money) {
            balances[clientindex] = -1;
        } else {
            balances[clientindex] -= money;
        }
        return balances[clientindex] ;
    }
}

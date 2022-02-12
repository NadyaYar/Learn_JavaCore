package Lesson5;

import java.util.Arrays;
public class Balance {
        public static void main(String[] args) {
            String[] names = {"kate", "anna", "nadya", "oleh"};
            int[] balances = {100, 500, 92, -19};
            System.out.println(Arrays.toString(findbalance(names, balances, 92)));
            depositMoney1(names,balances,"kate",6);
            System.out.println(Arrays.toString(balances));
            System.out.println(Arrays.toString(findbalance(names,balances)));
        }

        static String[] findbalance(String[] clients, int[] balances, int n) {
            int count = 0;
            for (int balance : balances) {
                if (balance >= n) count++;
            }
            String[] results = new String[count];
            int index = 0;
            for (int balance : balances) {
                if (balance >= n) {
                    results[index] = clients[index];
                }
                index++;
            }
            return results;
        }

        static String[] findbalance(String[] clients, int[] balances) {
            int count = 0;
            for (int balance : balances) {
                if (balance < 0) count++;
            }
            String[] results = new String[count];
            int index = 0;
            int reindex = 0;
            for (int balance : balances) {
                if (balance < 0) {
                    results[reindex] = clients[index];
                    reindex++;
                }
                index++;
            }
            return results;
        }

        public static int  depositMoney1(String[] clients, int[] balances, String client, int money) {
            int clientindex = 0;
            for (String el : clients) {
                if (el == client) {
                    break;
                }
                clientindex++;
            }
            balances[clientindex] += money;
            return balances[clientindex];
        }
    }


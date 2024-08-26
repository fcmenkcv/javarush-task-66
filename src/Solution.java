package com.javarush.task.pro.task05.task0509;

/*
Таблица умножения
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        // напишите тут ваш код
        MULTIPLICATION_TABLE = new int[10][10];
        int count = 1;
        int tmp = 0;

        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE[i].length; j++) {
                if (i > 0) {
                    MULTIPLICATION_TABLE[i][j] = count + tmp;
                    tmp = count + tmp;
                } else {
                    MULTIPLICATION_TABLE[i][j] = j + count;
                }
            }
            count++;
            tmp = 0;
        }

        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE[i].length; j++) {
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

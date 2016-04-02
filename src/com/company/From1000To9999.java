package com.company;

public class From1000To9999 {
    public static void main(String[] args) {
        int a, counter;

        counter = 0;
        for (a = 1000; a <= 9999; a = a + 3) {
            System.out.println(a);
            counter++;
        }

    }
}

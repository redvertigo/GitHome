package com.company;

import static java.lang.System.*;

public class AddMassive {
    public static void main(String[] args) {

        int[] a = {1, 3, 5};
        int[] b = {2, 4, 8, 9, 12};

        int[] c = new int[a.length + b.length];

        arraycopy(a, 0, c, 0, a.length);
        arraycopy(b, 0, c, a.length, b.length);

        for (int i = 0; i < c.length; i++) {
            for (int j = i; j > 0; j--) {
                if (c[j - 1] <= c[j])
                    break;

                int temp = c[j - 1];
                c[j - 1] = c[j];
                c[j] = temp;
            }
        }

        for (int value : c) {
            System.out.print(value + " ");
        }
    }


}

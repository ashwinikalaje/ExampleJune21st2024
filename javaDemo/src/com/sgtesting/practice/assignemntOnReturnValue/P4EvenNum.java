package com.sgtesting.practice.assignemntOnReturnValue;

import java.util.Arrays;

class EvenNum10To20 {
    int[] evenNumDisplay() {
        int i[] = {10, 12, 14, 16, 18, 20};
        return i;
    }

}

public class P4EvenNum {
    public static void main(String[] args) {
        EvenNum10To20 o = new EvenNum10To20();
        int x2[] = o.evenNumDisplay();
        System.out.println("even numbers between 10 to 20 are: ");
        for (int x : x2) {
            System.out.println(x);
        }
        // System.out.println(Arrays.toString(x));

    }
}

//sum of square of each number in between  1 to 10

package com.sgtesting.practice.assignmentOnMethods;

class SqureNum {
    void squreFind() {
        int sumOfSqure = 0;
        System.out.println("square num are below :");
        for (int i = 0; i <= 10; i++) {
            int num = i * i;
            System.out.println(num);
            sumOfSqure = sumOfSqure + num;

        }

        System.out.println("sum of square num is: " + sumOfSqure);

    }
}

public class SumOfSquareNum {
    public static void main(String[] args) {
        SqureNum obj = new SqureNum();
        obj.squreFind();

    }
}

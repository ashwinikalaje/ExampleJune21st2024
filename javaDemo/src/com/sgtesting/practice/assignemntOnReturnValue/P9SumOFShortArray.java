package com.sgtesting.practice.assignemntOnReturnValue;
class ShortArraySum {

    short sumOfElements(short[][] matrix) {
        short sum = 0;
        for (short[] x : matrix)
        {
            for (short y : x)
            {
                sum += y;
            }
        }
        return sum;
    }
}


    public class P9SumOFShortArray {
        public static void main(String[] args) {
            ShortArraySum o = new ShortArraySum();
            short[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            short sum = o.sumOfElements(arr);
            System.out.println("Sum of all elements: " + sum);
        }
    }




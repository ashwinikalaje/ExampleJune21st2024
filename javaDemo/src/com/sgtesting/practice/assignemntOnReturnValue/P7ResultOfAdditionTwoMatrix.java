package com.sgtesting.practice.assignemntOnReturnValue;

import java.util.Arrays;

class AddTwomatrixDemo {
    int[][] matrixAddition(int x[][], int y[][]) {
        int rows = x.length;
        int cols = y[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = x[i][j] + y[i][j];
            }

        }
        return result;
    }
}

    public class P7ResultOfAdditionTwoMatrix
    {
        public static void main(String[] args)
        {
            AddTwomatrixDemo o = new AddTwomatrixDemo();

            int[][] x = {{1, 2}, {3, 4}};

            int[][] y = {{5, 6}, {7, 8}};
            int res[][] = o.matrixAddition(x, y);
            System.out.println("The sum of the matrices is: ");
            for (int i = 0; i < res.length; i++)
            {
                for (int j = 0; j < res[i].length; j++)
                {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
           // System.out.println(Arrays.deepToString(res));

        }
    }






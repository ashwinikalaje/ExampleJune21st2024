package com.sgtesting.practice.assignemntOnReturnValue;

import java.util.Arrays;

class AddTwomatrixDemo1 {
    String[][] matrixAddition(String x[][], String y[][]) {
        int rows = x.length;
        int cols = y[0].length;
        String[][] result = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = x[i][j] + y[i][j];
            }

        }
        return result;
    }
}

public class p12DemoConcatination
{
    public static void main(String[] args)
    {
        AddTwomatrixDemo1 o = new AddTwomatrixDemo1();

        String[][] x = {{"aa", "bb"}, {"cc", "dd"}};

        String[][] y = {{"ee", "ff"}, {"gg", "hh"}};
        String res[][] = o.matrixAddition(x, y);
        System.out.println("The sum of the matrices is: ");
            for (int i = 0; i < res.length; i++)
            {
                for (int j = 0; j < res[i].length; j++)
                {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }


    }
}







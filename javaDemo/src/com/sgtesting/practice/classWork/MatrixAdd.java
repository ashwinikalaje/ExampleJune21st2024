package com.sgtesting.practice.classWork;

class MatrixAddition
{
    void matrixAddition(int x[][],int y[][])
    {
        if (x.length == y.length && x[0].length == y[0].length)
        {
            for (int i=0; i<x.length; i++)
            {
                for (int j=0; j<x[i].length; j++)
                {
                    int res=x[i][j] + y[i][j];
                    System.out.print(res+" ");
                }
                System.out.println();
            }
        }
    }
}
public class MatrixAdd {

    public static void main (String [] args)
    {
        MatrixAddition max = new MatrixAddition ();
        int a [] [] = {
                {1,2,3},
                {4,5,6}
        };
        int b [] [] = {
                {4,5,6},
                {7,8,9}
        };
        max.matrixAddition (a, b);
    }
}

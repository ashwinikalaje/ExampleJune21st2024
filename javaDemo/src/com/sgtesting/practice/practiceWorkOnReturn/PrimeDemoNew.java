package com.sgtesting.practice.practiceWorkOnReturn;



class MatrixAddition
{
    int [] [] getMatrixAddition (int x [] [], int y [] [])
    {
        int z[][]=new int [y.length][y[0].length];
        for (int i=0; i<y.length; i++)
        {
            for (int j=0; j<y[i].length; j++)
            {
                z[i][j]=x[i][j]+y[i][j];
            }
        }
        return z;
    }
}
public class PrimeDemoNew {

    public static void main (String [] args)
    {
        MatrixAddition mat=new MatrixAddition();
        int a [] [] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int b [] [] = {
                {10,12,13},
                {14,15,16},
                {17,18,19}
        };
        int res [] [] = mat.getMatrixAddition (a, b);

// display 1st row of the elements
        for (int i=0; i<res.length; i++)
        {
            System.out.println(res[0][i]+" ");
        }
        System.out.println("****************");

// display 2nd row of the elements
        for (int i=0; i<res.length; i++)
        {
            System.out.println(res[1][i]+" ");
        }
        System.out.println("****************");

// display 3rd row of the elements
        for (int i=0; i<res.length; i++)
        {
            System.out.println(res[2][i]+" ");
        }
        System.out.println("****************");
        System.out.println();

// transpose of the result of the return value
        for (int i=0; i<res.length; i++)
        {
            for (int j=0; j<res[i].length; j++)
            {
                System.out.print(res[j][i]+" ");
            }
            System.out.println();
        }
        System.out.println("*******************");
        System.out.println();

// display sum of the elements
        int sum=0;
        for (int i=0; i<res.length; i++)
        {
            for (int j=0; j<res[i].length; j++)
            {
                sum+=res[i][j];
            }
        }
        System.out.println("Sum of all the elements is:"+sum);
        System.out.println();
    }
}


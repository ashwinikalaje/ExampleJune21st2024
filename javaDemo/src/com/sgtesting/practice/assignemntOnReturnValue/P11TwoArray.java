package com.sgtesting.practice.assignemntOnReturnValue;
class ReadTwoDArray
{

    double[][] ReadArry(double arr[][])
    {
        return arr;
    }
}


public class P11TwoArray {
    public static void main(String[] args) {
        ReadTwoDArray o=new ReadTwoDArray();
        double arr1[][]={{1,2,3},{3,4,5}};
        double arr2[][]=o.ReadArry(arr1);
        for(double x[]:arr2)
        {
            System.out.println(arr2);
        }


    }
}

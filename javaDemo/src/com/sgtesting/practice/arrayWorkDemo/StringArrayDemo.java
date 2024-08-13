package com.sgtesting.practice.arrayWorkDemo;


public class StringArrayDemo {
    public static void main(String[] args)
    {
        String array[]={"java","c++","python","c"};

        System.out.println("the reverse of given string array is ");
        for(int i=array.length-1;i>=0;i--)
        {
            System.out.println(array[i]);
        }
        int mid = array.length / 2;

        // Loop through the first half of the array
        System.out.println("first half of the array is ");
        for (int i = 0; i < mid; i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("second half of the array is :");
        for(int i=mid;i<array.length;i++)
        {
            System.out.println(array[i]);
        }

    }
}

package com.sgtesting.practice.arrayWorkDemo;

public class SampleArrayDemo {
    public static void main(String[] args) {
        int arr[]=new int[4];
        arr[0]=10;
        arr[1]=11;
        arr[2]=13;
        arr[3]=15;
        //read the elements
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);

        //read the elements from looping
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("array num are "+arr[i]);
        }
        //reversing order
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println("array num rev are "+arr[i]);
        }
    }
}

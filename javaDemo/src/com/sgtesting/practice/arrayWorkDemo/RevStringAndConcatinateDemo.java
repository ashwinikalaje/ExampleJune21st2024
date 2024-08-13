//there is String array read element in reverse order and concatinate it hi welcom morning
package com.sgtesting.practice.arrayWorkDemo;

public class RevStringAndConcatinateDemo {
    public static void main(String[] args) {


        String arr[] = {"morning", "welcome", "hi"};
        for (int i = arr.length - 1;i>=0;i-- ) {
            System.out.println(arr[i]);
        }
    }
}

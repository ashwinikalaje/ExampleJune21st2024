package com.sgtesting.practice.assignmentOnMethods;

import java.sql.SQLOutput;

class Demo2 {
    Demo2(int num)
    {
        int flag = 0;


        for (int i = 2; i < num; i++)
        {

            if (num % 2 == 0)
            {
                flag++;
                break;

            }

        }

        if (flag == 0) {
            System.out.println(num + "is a prime number ");
        } else {
            System.out.println(num + "is a not prime number ");
        }
    }
}
public class PrimeDemo {
    public static void main(String[] args) {
        Demo2 dem = new Demo2(7);
        Demo2 dem1 = new Demo2(8);
        Demo2 dem2 = new Demo2(13);
        Demo2 dem3 = new Demo2(21);
    }
}


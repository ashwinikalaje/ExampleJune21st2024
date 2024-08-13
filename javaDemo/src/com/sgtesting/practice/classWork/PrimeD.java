package com.sgtesting.practice.classWork;

class PrimeDemo {


    void primeNum (int num)
    {
        int flag=0;
        for (int i=2; i<num; i++)
        {
            if (num%i == 0)
            {
                flag++;
                break;
            }
        }
        if (flag == 0)
        {
            System.out.println(num+" is a prime number");

        }
        else
        {
            System.out.println(num+" is not a prime number");
        }
    }
}
public class PrimeD
{
    public static void main (String [] args)
    {
        PrimeDemo pm = new PrimeDemo();
        pm.primeNum(8);
        pm.primeNum(7);
        pm.primeNum(20);
        pm.primeNum(31);
    }
}

package com.sgtesting.practice.classWork;

class Calclulation
{
    void factorial(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial of " + num + " is " + fact);
    }

}

public class FactorailNum {
    public static void main(String args[])
    {
        Calclulation o=new Calclulation();
        o.factorial(9);
        o.factorial(3);


    }
    }





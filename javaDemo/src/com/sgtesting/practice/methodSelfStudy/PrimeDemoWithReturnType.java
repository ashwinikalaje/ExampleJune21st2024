package com.sgtesting.practice.methodSelfStudy;
class primeDemo
{
    boolean isPrime(int num)
    {
        boolean prime=true;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                prime=false;
                break;
            }
        }
        return prime;
    }
}
public class PrimeDemoWithReturnType {
    public static void main(String[] args) {
        primeDemo obj=new primeDemo();
        boolean b=obj.isPrime(7);
        boolean b1= obj.isPrime(5);
        System.out.println(b);
        System.out.println(b1);
        System.out.println("*******************************");

        for(int i=1;i<=50;i++)
        {
            if(obj.isPrime(i)==true)
            {
               System.out.println(i+"");
            }
        }
        int count=0;
        for(int i=200;i>=100;i--)
        {
            if(obj.isPrime(i)==true)
            {
               count++;
            }
        }
        System.out.println("The count of prime numbers: "+count);
    }
}

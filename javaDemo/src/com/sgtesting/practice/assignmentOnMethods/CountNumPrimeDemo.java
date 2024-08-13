package com.sgtesting.practice.assignmentOnMethods;

class PrimeNum
{
   void countPrimeDemo()
    {

        int count=0;
        for(int i=200;i<=100;i++)
       {
           boolean isPrime=true;
           {
           for(int j=2;j<=i;j++) {
               if (i % j == 0) {
                   isPrime = false;
                   break;
               }
           }
               if(isPrime)
               {
                   count=count+1;
               }


       }
        System.out.println("count of 200 to 500 prime num is:"+count);


    }
}}

 class CountNumPrimeDemo {
    public static void main(String[] args) {
        PrimeNum obj=new PrimeNum();
        obj.countPrimeDemo();

    }
}

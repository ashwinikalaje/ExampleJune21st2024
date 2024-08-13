package com.sgtesting.practice.assignmentOnMethods;
class countDisplay
{
   void dCount()
   {int count=0;
      for (int i=200;i<=400;i++)
       {
           if((i%2==0)&&(i%4==0)&&(i%6==0))
           {
               count++;
           }
       }
       System.out.println("count  "+count);
   }

}


public class DisplayCountNum {
    public static void main(String[] args) {


        countDisplay obj = new countDisplay();
        obj.dCount();
    }
}

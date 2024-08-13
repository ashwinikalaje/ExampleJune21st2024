package com.sgtesting.practice.assignmentOnMethods;

class EvenNum
{
    void even()
    {
        int count=0;
        for(int i=1;i<=500;i++)
        {
            if(i%2==0)
            {

                count++;
            }
        }
        System.out.println("even number  between 1 to 500 is:  "+count);
    }
}
public class CountEvenNum {
    public static void main(String[] args)
    {
        EvenNum obj=new EvenNum();
        obj.even();


    }
}

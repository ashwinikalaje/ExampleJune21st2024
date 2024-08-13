package com.sgtesting.practice.classWork;

class DisplayNum
{
    void div()
    {
        for(int i=100;i>=50;i--)
        {
            if(i%3==0)
            {
                System.out.println(i);
            }
        }
    }
}
public class Display100To50DivsibleBy3 {
    public static void main(String[] args) {


        DisplayNum d = new DisplayNum();
        d.div();
    }


}

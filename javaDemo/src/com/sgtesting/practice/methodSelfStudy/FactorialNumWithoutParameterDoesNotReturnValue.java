package com.sgtesting.practice.methodSelfStudy;

class factrilaDemo
{
    void getFact()
    {
        int num=5;
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("factoial is:"+fact);
    }
}
public class FactorialNumWithoutParameterDoesNotReturnValue {
    public static void main(String[] args) {
        factrilaDemo obj=new factrilaDemo();
        obj.getFact();

    }
}

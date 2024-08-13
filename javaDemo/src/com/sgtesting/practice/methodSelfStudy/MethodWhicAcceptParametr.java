package com.sgtesting.practice.methodSelfStudy;
class MethodWhicAcceptParametrDemo
{
    void add(int x,int y)
    {
        int res=x+y;
        System.out.println(res);
    }
}
public class MethodWhicAcceptParametr {
    public static void main(String[] args) {
        MethodWhicAcceptParametrDemo o=new MethodWhicAcceptParametrDemo();
        o.add(12,3);
    }
}

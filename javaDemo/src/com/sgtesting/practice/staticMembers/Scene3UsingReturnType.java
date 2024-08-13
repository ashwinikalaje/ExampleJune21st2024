package com.sgtesting.practice.staticMembers;


class Demo1NewSampleForReturnType
{
    int add(int  x,int y)
    {
        Demo2NewSampleForReturnType obj=new Demo2NewSampleForReturnType();
        int y2=obj.sub(2,1);
        System.out.println(y2);
       int z=x+y;
       return z;
    }

}
class Demo2NewSampleForReturnType
{
    int sub(int  x,int y)
    {
        int z1=x-y;
        return z1;
    }
}
public class Scene3UsingReturnType {
    public static void main(String[] args) {
        Demo1NewSampleForReturnType obg=new Demo1NewSampleForReturnType();
       int d= obg.add(7,7);
        System.out.println(d);
    }

}


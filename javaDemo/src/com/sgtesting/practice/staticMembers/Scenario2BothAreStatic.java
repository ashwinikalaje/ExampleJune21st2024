// There are 2 classes Demo1 and Demo2, Demo1 contains static method
// and Demo2 also contains static
//method. Can we call Demo1 static method in Demo2 static method
package com.sgtesting.practice.staticMembers;
class Demo1New
{
static int addDispaly(int x,int y)
{
    int z=x+y;
   // System.out.println(z);
    return z;

}
}
class Demo2New
{
    static int subDispaly(int a,int b)
    {
        Demo1New d1=new Demo1New();

        d1.addDispaly(2,4);
        int res=a-b;
        return res;
    }
}
public class Scenario2BothAreStatic {
    public static void main(String[] args) {
        int result=Demo2New.subDispaly(2,5);
        System.out.println(result);
        int res2=Demo1New.addDispaly(23,45);
        System.out.println(res2);

    }
}

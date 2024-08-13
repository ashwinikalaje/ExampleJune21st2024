package com.sgtesting.practice.assignmentOnInhertance;

class MathDemoParent
{
    MathDemoParent(int x,int y)
    {
        System.out.println("addtion 2 input result:"+(x+y));

    }
    MathDemoParent(int x,int y,int z)
    {
        System.out.println("addtion 3 input result:"+(x+y+z));
    }

    MathDemoParent(int x,int y,int z,int p)
    {
        System.out.println("addtion 4input result:"+(x+y+z+p));
    }

}
class MathDemoChild1 extends MathDemoParent
{
    MathDemoChild1(int xOfChild,int yofChild)
    {
        super(xOfChild,yofChild);
    }
    MathDemoChild1(int xOfChild,int yofChild,int zOfChild)
    {
        super(xOfChild,yofChild,zOfChild);
    }
    MathDemoChild1(int xOfChild,int yofChild,int zOfChild,int pOfChild)
    {
        super(xOfChild,yofChild,zOfChild,pOfChild);
    }

}
class MathDemoChild2 extends MathDemoParent
{
    MathDemoChild2(int xOfChild2,int yofChild2)
    {
        super(xOfChild2,yofChild2);
    }
    MathDemoChild2(int xOfChild2,int yofChild2,int zOfChild2)
    {
        super(xOfChild2,yofChild2,zOfChild2);
    }
    MathDemoChild2(int xOfChild2,int yofChild2,int zOfChild2,int pOfChild2)
    {
        super(xOfChild2,yofChild2,zOfChild2,pOfChild2);
    }


}


public class P6MultilevelinheritanceConstOverloading {
    public static void main(String[] args) {
        MathDemoChild2 o=new MathDemoChild2(2,3);
        MathDemoChild2 o1=new MathDemoChild2(2,3,4);
        MathDemoChild2 o2=new MathDemoChild2(2,3,6,7);


    }
}



package com.sgtesting.practice.staticMembers;
class Maths
{
    static String mathType;
    static void multipl(int x,int y)
    {
        System.out.println("mul result:"+(x*y));
    }
}

public class Case3StaticMembersAvalibleInIndependetClass {
    public static void main(String[] args) {
        Maths.mathType = "algebra";
        System.out.println("mathType: "+Maths.mathType);
        Maths.multipl(2,3);
    }



}

package com.sgtesting.practice.assignemntOnReturnValue;

class CollegeNameDisplay
{
    String getCollegeName(String collegeName)
    {
        return collegeName;
    }
}
public class P1CollegeName {
    public static void main(String[] args) {
        CollegeNameDisplay o=new CollegeNameDisplay();
       String s1= o.getCollegeName("Gogte Institute of technology Belgavi");
        System.out.println("college name: "+s1);
    }
}

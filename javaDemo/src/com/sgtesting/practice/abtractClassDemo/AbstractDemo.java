package com.sgtesting.practice.abtractClassDemo;

abstract class College
{
    abstract void clgName(String name);
    abstract void clglocation(String location);
    void  displyCollegeList(String clgList[])
    {
    for (int i=0;i<clgList.length;i++)
    {
        System.out.println(clgList[i]);
    }

    }

}
class EngineeringCollege extends College
{
    void clgName(String name)
    {
        System.out.println("clgname: "+name);
    }
     void clglocation(String location)
     {
         System.out.println("location: "+location);
     }

}
public class AbstractDemo {
    public static void main(String[] args) {
       // EngineeringCollege e = new EngineeringCollege();
        //object Reference
        College e = new EngineeringCollege();
        e.clgName("Git");
        e.clglocation("udyambag");
        String a[] = {"cse", "Ise", "Mech", "automobile", "mechtronics"};
        e.displyCollegeList(a);


    }
}





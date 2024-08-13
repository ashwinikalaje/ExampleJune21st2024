package com.sgtesting.practice.assignmentOnInhertance;


class SchoolParent
{
   String StudentName;
   int age;
   void display()
   {
       System.out.println("StudentName of super class: "+StudentName);
       System.out.println("age super class: "+age);
   }
}
class StudentChild extends SchoolParent
{
    String StudentName;
    int age;
    StudentChild(String StudentNameOfChild, int ageofchild)
    {
        super.StudentName=StudentNameOfChild;
         super.age=ageofchild;
    }
    void show()
    {
        System.out.println("StudentName of sub class: "+StudentName);
        System.out.println("age sub class: "+age);
    }

}
class StudentChild2 extends StudentChild
{

    String StudentName;
    int age;
    StudentChild2(String StudentNameOfChild2, int ageofchild2)
    {
        super(StudentNameOfChild2,ageofchild2);

    }
    void getSdetails()
    {
        System.out.println("StudentName of grand class: "+StudentName);
        System.out.println("age grand class: "+age);
    }
}


public class P8MultilevelSamevarible {
    public static void main(String[] args) {
        StudentChild2 o=new StudentChild2("ashwini",28);
        o.show();
        o.display();
        o.getSdetails();


    }
}


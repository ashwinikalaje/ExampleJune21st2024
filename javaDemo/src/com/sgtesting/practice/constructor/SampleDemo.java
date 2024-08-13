package com.sgtesting.practice.constructor;
class Student
{
    String StudentName;
    String StudentID;
    String Branch;
    String block;
    String StuLocation;

    Student ()
    {
        StudentName="Ashwini";
        StudentID="2GI13IS404";
        Branch="Computer Engineering";
        block="C-Block";
        StuLocation="UdymbAg";
        System.out.println("Student Name:"+StudentName);
        System.out.println("Student ID:"+StudentID);
        System.out.println("Branch Name:"+Branch);
        System.out.println("Block:"+block);
        System.out.println("Stu Location:"+StuLocation);
        System.out.println("*************************");
    }
}
class Library
{
    String StudentID;
    String LibID;
    String BookName;
    String Author;
    String IssueDate;
    Library ()
    {
        StudentID="1GU101617";
        LibID="1GULib001";
        BookName="Turbo Machines";
        Author="Rakshith";
        IssueDate="15/10/2015";
        System.out.println("Student ID:"+StudentID);
        System.out.println("Lib ID:"+LibID);
        System.out.println("Book Name:"+BookName);
        System.out.println("Author Name:"+Author);
        System.out.println("Issue Date:"+IssueDate);
        System.out.println("*************************");
    }
}
class Sports
{
    String StudentID;
    String SportName;
    String Coach;
    String GrondType;
    String SportEquip;
    Sports ()
    {
        StudentID="1GU101617";
        SportName="Cricket";
        Coach="Dhoni";
        GrondType="Outdoor";
        SportEquip="Bat and Ball";
        System.out.println("Student ID:"+StudentID);
        System.out.println("Sport Name:"+SportName);
        System.out.println("Coach Name:"+Coach);
        System.out.println("Ground Type:"+GrondType);
        System.out.println("Sport Equip:"+SportEquip);
        System.out.println("*************************");
    }
}

class CSdept
{
    String StudentID;
    String LabName;
    String LabID;
    String GuideName;
    String LabDay;
    CSdept ()
    {
        StudentID="1GU101617";
        LabName="Java";
        LabID="GUCS01";
        GuideName="Prabhakar";
        LabDay="Friday";
        System.out.println("Student ID:"+StudentID);
        System.out.println("Lab Name:"+LabName);
        System.out.println("Lab ID:"+LabID);
        System.out.println("Guide Name:"+GuideName);
        System.out.println("Lab Day:"+LabDay);
    }
}
public class SampleDemo {
    public static void main(String[] args) {
// create a class for student, library, sports, csdept and execute each member of the class?
        Student stu=new Student();
        Library lib=new Library();
        Sports spo=new Sports();
        CSdept cs=new CSdept();
    }
}

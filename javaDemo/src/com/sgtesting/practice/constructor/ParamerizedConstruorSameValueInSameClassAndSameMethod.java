package com.sgtesting.practice.constructor;
class Employe
{
    String FirstName;
    String BranchName;
    int RollNumber;
    Employe (String fname, String branch, int rollno)
    {
        FirstName=fname;
        BranchName=branch;
        RollNumber=rollno;
        System.out.println("“First Name: " +FirstName);
        System.out.println("“Branch Name: " +BranchName);
        System.out.println("“Roll Number: " +RollNumber);

    }
    void show()
    {
        System.out.println();
        System.out.println("In method body !!!!");
        System.out.println("“First Name: " +FirstName);
        System.out.println("“Branch Name: " +BranchName);
        System.out.println("“Roll Number: " +RollNumber);
    }


    }

public class ParamerizedConstruorSameValueInSameClassAndSameMethod {
    public static void main(String[] args) {

        Employe emp = new Employe("ashu", "vega", 25);
        emp.show();
    }

}

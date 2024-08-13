package com.sgtesting.practice.constructor;


class EmployeN
{
    String FirstName;
    String BranchName;
    int RollNumber;
    EmployeN (String FirstName, String BranchName, int RollNumber)
    {
       this.FirstName=FirstName;
       this.BranchName=BranchName;
       this.RollNumber=RollNumber;
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
public class ThisDemo {
    public static void main(String[] args) {

        EmployeN emp = new EmployeN("ashu", "vega", 25);
        emp.show();
    }

}





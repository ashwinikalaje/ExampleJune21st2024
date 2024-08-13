package com.sgtesting.practice.assignmentOnInhertance;


class ParentEmployee
{
  String firstNameOfInstance;
  String jobNameOfInstance;
    ParentEmployee(String fnameOfConstru,String jnameOfConstr)
    {
        this.firstNameOfInstance=fnameOfConstru;
        this.jobNameOfInstance=jnameOfConstr;
        System.out.println("firstName: "+firstNameOfInstance);
        System.out.println("jobName: "+jobNameOfInstance);

    }


}
class child1Dept extends ParentEmployee
{
    child1Dept(String fnameOfChild1,String jobchild1)
    {
        super(fnameOfChild1,jobchild1);


    }

}
class child2Dept extends child1Dept
{
    child2Dept(String fnameOfChild2,String jobOfChild2)
    {
        super(fnameOfChild2,jobOfChild2);

    }
}


public class p4Demo2MulitlevelInheritance {
    public static void main(String[] args) {
        child2Dept o=new child2Dept("Ashwini","Software engneer");



    }
}

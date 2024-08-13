package com.sgtesting.practice.assignmentOnInhertance;



class ParentEmployeeDemo
{
    String firstNameOfInstance;
    String lastNameOfInstance;
    ParentEmployeeDemo(String fnameOfConstru,String lnameOfConstr)
    {
        this.firstNameOfInstance=fnameOfConstru;
        this.lastNameOfInstance=lnameOfConstr;
        System.out.println("firstName: "+firstNameOfInstance);
        System.out.println("lnameOfConstr: "+lastNameOfInstance);

    }


}
class Child1DepartementDemo extends ParentEmployeeDemo
{
    Child1DepartementDemo(String fnameOfChild1Departement,String jobChild1Departement)
    {
        super(fnameOfChild1Departement,jobChild1Departement);


    }
}
class Child2DepartementDemo extends ParentEmployeeDemo
{
    Child2DepartementDemo(String fnameOfChild2Departement,String lastNmaeChild2Departement)
    {
        super(fnameOfChild2Departement,lastNmaeChild2Departement);


    }

}

class GrandChildDeparrtmentDemo extends Child2DepartementDemo
{
    GrandChildDeparrtmentDemo(String fnameOfGrandChildDepartement,String lastNameGrandChildDepartement)
    {
        super(fnameOfGrandChildDepartement,lastNameGrandChildDepartement);


    }
}


public class P5HybridDemo2 {
    public static void main(String[] args) {
        GrandChildDeparrtmentDemo gh=new GrandChildDeparrtmentDemo("ashwini","kk");


    }
}



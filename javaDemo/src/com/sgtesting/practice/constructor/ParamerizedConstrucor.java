package com.sgtesting.practice.constructor;
class Employee
{
    String emp_name;
    String emp_Job;
    int salary;
    Employee(String ename,String emp_jb,int sal)
    {
        emp_name=ename;
        emp_Job=emp_jb;
        salary=sal;
        System.out.println("emp_name: "+emp_name);
        System.out.println("emp_Job: "+emp_Job);
        System.out.println("salary: "+salary);


    }
}
public class ParamerizedConstrucor {
    public static void main(String[] args) {
        Employee emp=new Employee("ashwini","se",35000);


    }
}

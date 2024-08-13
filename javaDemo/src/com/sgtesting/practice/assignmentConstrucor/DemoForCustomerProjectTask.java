//create class called customer ,project,task,and execute each member of the class
package com.sgtesting.practice.assignmentConstrucor;

class  Customer
{
    String cus_name;
    int Cus_id;
    int cus_phoneNum;
    String address;
}

class Project
{
   String project_name;
   String project_domain;
   String clientNameOfTheProject;


}

class Task
{
    String task_Type;
    String task_status;
    String task_duration;
    String task_proirty;
}

public class DemoForCustomerProjectTask {
    public static void main (String args[])
    {
        Customer obj1=new Customer();
        obj1.cus_name="ashwini";
        obj1.address="4th cross nvnagr hubbli";
        obj1.cus_phoneNum=890765432;
        obj1.Cus_id=1;

        System.out.println("*************customer details **********************");

        System.out.println("cus_name: "+obj1.cus_name);
        System.out.println("Cus_id: "+obj1.Cus_id);
        System.out.println("cus_phoneNum: "+obj1.cus_phoneNum);
        System.out.println("address: "+obj1.address);

        System.out.println("--------------------------------------------");

        Customer obj2=new Customer();
        obj2.cus_name="archna";
        obj2.address="4th cross nvnagr belgavi";
        obj2.cus_phoneNum=980765432;
        obj2.Cus_id=2;

        System.out.println("*************customer details **********************");

        System.out.println("cus_name: "+obj2.cus_name);
        System.out.println("Cus_id: "+obj2.Cus_id);
        System.out.println("cus_phoneNum: "+obj2.cus_phoneNum);
        System.out.println("address: "+obj2.address);




        Project obj3=new Project();
        obj3.project_name="Xybion";
        obj3.project_domain="medical";
        obj3.clientNameOfTheProject="IBM";

        System.out.println("*************project details **********************");

        System.out.println("project_name: "+obj3.project_name);
        System.out.println("project_domain: "+obj3.project_domain);
        System.out.println("clientNameOfTheProject: "+obj3.clientNameOfTheProject);
        System.out.println("------------------------------------------------");

        Project obj4=new Project();
        obj4.project_name="cypress";
        obj4.project_domain="banking";
        obj4.clientNameOfTheProject="INFOSYS";

        System.out.println("*************project details **********************");

        System.out.println("project_name: "+obj4.project_name);
        System.out.println("project_domain: "+obj4.project_domain);
        System.out.println("clientNameOfTheProject: "+obj4.clientNameOfTheProject);

        String task_Type;
        String task_status;
        float task_duration;
        String task_proirty;

        Task obj6=new Task();
        obj6.task_Type="view and edit";
        obj6.task_status="sucess";
        obj6.task_duration="400 days";
        obj6.task_proirty="high prority";


        System.out.println("*************task details **********************");

        System.out.println("task_Type: "+obj6.task_Type);
        System.out.println("task_status: "+obj6.task_status);
        System.out.println("task_duration: "+obj6.task_duration);
        System.out.println("task_proirty: "+obj6.task_proirty);

    }








    }



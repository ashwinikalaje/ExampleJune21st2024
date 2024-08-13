package com.sgtesting.practice.assignmentConstrucorWithNoArgs;



//create class called customer ,project,task,and execute each member of the class


class  Customer
{
    String cus_name;
    int Cus_id;
    int cus_phoneNum;
    String address;

    Customer(){
        cus_name="ashwini";
        address="4th cross nvnagr hubbli";
        cus_phoneNum=890765432;
        Cus_id=1;

        System.out.println("*************customer details **********************");

        System.out.println("cus_name: "+cus_name);
        System.out.println("Cus_id: "+Cus_id);
        System.out.println("cus_phoneNum: "+cus_phoneNum);
        System.out.println("address: "+address);

        System.out.println("--------------------------------------------");


        cus_name="archna";
        address="4th cross nvnagr belgavi";
       cus_phoneNum=980765432;
            Cus_id=2;

        System.out.println("*************customer details **********************");

        System.out.println("cus_name: "+cus_name);
        System.out.println("Cus_id: "+Cus_id);
        System.out.println("cus_phoneNum: "+cus_phoneNum);
        System.out.println("address: "+address);





    }


    }

class Project
{
    String project_name;
    String project_domain;
    String clientNameOfTheProject;
    Project() {

        project_name="Xybion";
        project_domain="medical";
        clientNameOfTheProject="IBM";

        System.out.println("*************project details **********************");

        System.out.println("project_name: "+project_name);
        System.out.println("project_domain: "+project_domain);
        System.out.println("clientNameOfTheProject: "+clientNameOfTheProject);
        System.out.println("------------------------------------------------");


        project_name="cypress";
        project_domain="banking";
        clientNameOfTheProject="INFOSYS";

        System.out.println("*************project details **********************");

        System.out.println("project_name: "+project_name);
        System.out.println("project_domain: "+project_domain);
        System.out.println("clientNameOfTheProject: "+clientNameOfTheProject);
    }

}

class Task
{
    String task_Type;
    String task_status;
    String task_duration;
    String task_proirty;

    Task(){

        task_Type="view and edit";
        task_status="sucess";
      task_duration="400 days";
        task_proirty="high prority";


        System.out.println("*************task details **********************");

        System.out.println("task_Type: "+task_Type);
        System.out.println("task_status: "+task_status);
        System.out.println("task_duration: "+task_duration);
        System.out.println("task_proirty: "+task_proirty);

    }
}

public class Demo5ForCustomerprojectTask
{
    public static void main (String args[])
    {

        Customer obj1=new Customer();
        Project obj2=new Project();
        Task OBJ3=new Task();




    }








}




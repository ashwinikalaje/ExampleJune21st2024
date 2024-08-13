package com.sgtesting.practice.assignmentConstrucorWithNoArgs;

class Employee {
    int emp_id;
    String emp_name;
    int emp_age;
    float emp_salary;

    Employee() {
        System.out.println("*******Employee Deatils ****************");
        emp_id = 1;
        emp_name = "ashwini";
        emp_age = 28;
        emp_salary = 35000;

        System.out.println("emp_id: " + emp_id);
        System.out.println("emp_name: " + emp_name);
        System.out.println("emp_age " + emp_age);
        System.out.println("emp_salary: " + emp_salary);
        System.out.println("-----------------------------");


        emp_id = 2;
        emp_name = "archana";
        emp_age = 29;
        emp_salary = 39000;

        System.out.println("emp_id: " + emp_id);
        System.out.println("emp_name: " + emp_name);
        System.out.println("emp_age " + emp_age);
        System.out.println("emp_salary: " + emp_salary);

    }

}

class Department {
    int dept_id;
    String dept_name;
    int mgr_id;

    Department() {

        dept_id = 10;
        dept_name = "administration";
        mgr_id = 200;

        System.out.println("*******department Deatils ****************");

        System.out.println("dept_id: " + dept_id);
        System.out.println("dept_name: " + dept_name);
        System.out.println("mgr_id: " + mgr_id);

        System.out.println("-----------------------------");

        dept_id = 11;
        dept_name = "marketing";
        mgr_id = 201;

        System.out.println("dept_id: " + dept_id);
        System.out.println("dept_name: " + dept_name);
        System.out.println("mgr_id: " + mgr_id);

    }

}

class Insurance {
    String insurance_type;
    String nameOfTheInsuranceCompany;
    String nameOfInsuranceHolder;
    String InsurancePlan;

    Insurance() {
        System.out.println("*******Insurance Details ****************");

        insurance_type = "health Insurance";
        nameOfTheInsuranceCompany = "star health";
        InsurancePlan = "5years";
        nameOfInsuranceHolder = "ashwini";

        System.out.println("insurance_type: " + insurance_type);
        System.out.println("nameOfTheInsuranceCompany: " + nameOfTheInsuranceCompany);
        System.out.println("InsurancePlan: " + InsurancePlan);
        System.out.println("nameOfInsuranceHolder: " + nameOfInsuranceHolder);


    }
}

public class Demo1ForEmployee {
    public static void main(String args[]) {
        Employee OBJ1 = new Employee();
        Department OBJ2 = new Department();
        Insurance obj3 = new Insurance();
    }

}

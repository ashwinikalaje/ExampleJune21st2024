//create class Employee,deparment,insurance and
// excute each members of the class

package com.sgtesting.practice.assignmentConstrucor;
class Employee
{
    int emp_id;
    String emp_name;
    int emp_age;
    float emp_salary;

}
class Department
{
    int dept_id;
    String dept_name;
    int mgr_id;

}
class Insurance
{
String insurance_type;
String nameOfTheInsuranceCompany;
String nameOfInsuranceHolder;
String InsurancePlan;
}




public class DemoMain {
    public static void main(String args[]) {
        Employee obj1 = new Employee();
        System.out.println("*******Employee Deatils ****************");
        obj1.emp_id = 1;
        obj1.emp_name="ashwini";
        obj1.emp_age=28;
        obj1.emp_salary=35000;

        System.out.println("emp_id: "+obj1.emp_id);
        System.out.println("emp_name: "+obj1.emp_name);
        System.out.println("emp_age "+obj1.emp_age);
        System.out.println("emp_salary: "+obj1.emp_salary);
        System.out.println("-----------------------------");


        Employee obj2 = new Employee();
        obj2.emp_id = 2;
        obj2.emp_name="archana";
        obj2.emp_age=29;
        obj2.emp_salary=39000;

        System.out.println("emp_id: "+obj2.emp_id);
        System.out.println("emp_name: "+obj2.emp_name);
        System.out.println("emp_age "+obj2.emp_age);
        System.out.println("emp_salary: "+obj2.emp_salary);

        System.out.println("*******Department Deatils ****************");
        Department obj3=new Department();
        obj3.dept_id=10;
        obj3.dept_name="administration";
        obj3.mgr_id=200;

        System.out.println("dept_id: "+obj3.dept_id);
        System.out.println("dept_name: "+obj3.dept_name);
        System.out.println("mgr_id: "+obj3.mgr_id);

        System.out.println("-----------------------------");
        Department obj4=new Department();
        obj4.dept_id=20;
        obj4.dept_name="marketing";
        obj4.mgr_id=201;

        System.out.println("dept_id: "+obj4.dept_id);
        System.out.println("dept_name: "+obj4.dept_name);
        System.out.println("mgr_id: "+obj4.mgr_id);

        System.out.println("*******Insurance Details ****************");
        Insurance obj5=new Insurance();
        obj5.insurance_type="health Insurance";
        obj5.nameOfTheInsuranceCompany="star health";
        obj5.InsurancePlan="5years";
        obj5.nameOfInsuranceHolder="ashwini";

        System.out.println("insurance_type: "+obj5.insurance_type);
        System.out.println("nameOfTheInsuranceCompany: "+obj5.nameOfTheInsuranceCompany);
        System.out.println("InsurancePlan: "+obj5.InsurancePlan);
        System.out.println("nameOfInsuranceHolder: "+obj5.nameOfInsuranceHolder);







    }

}

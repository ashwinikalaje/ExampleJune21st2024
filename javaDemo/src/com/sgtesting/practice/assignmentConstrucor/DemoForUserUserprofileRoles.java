//create class called user,user profiles,roles and execute each member

package com.sgtesting.practice.assignmentConstrucor;

class User
{
    String fname;
    String lname;
    String email;

}
class User_profile
{
    String username;
    String password;
}
class Roles
{
    String roles_type;

}


public class DemoForUserUserprofileRoles {
    public static void main(String args[] )
    {
        User obj1=new User();
        obj1.fname="sachin";
        obj1.lname="tendulakr";
        obj1.email="sachin@gmail.com";

        System.out.println("************user details*******************");
        System.out.println("fname: "+obj1.fname);
        System.out.println("lname: "+obj1.lname);
        System.out.println("email: "+obj1.email);

        System.out.println("---------------------------");
        User obj2=new User();
        obj2.fname="virat";
        obj2.lname="kohli";
        obj2.email="virat@gmail.com";

        System.out.println("************ user details *******************");
        System.out.println("fname: "+obj2.fname);
        System.out.println("lname: "+obj2.lname);
        System.out.println("email: "+obj2.email);

        System.out.println("************ user profile details *******************");


        User_profile obj3=new User_profile();
        obj3.username="sachin";
        obj3.password="********";



        System.out.println("username: "+obj3.username);
        System.out.println("password: "+obj3.password);

        System.out.println("--------------------------------------");
        User_profile obj4=new User_profile();
        obj4.username="virat";
        obj4.password="********";



        System.out.println("username: "+obj4.username);
        System.out.println("password: "+obj4.password);

        System.out.println("********** roles_type **********************");

        Roles obj5=new Roles();
        obj5.roles_type="manager";

        System.out.println("roles_type: "+obj5.roles_type);

        Roles obj6=new Roles();
        obj6.roles_type="team lead";

        System.out.println("roles_type: "+obj6.roles_type);











    }
}

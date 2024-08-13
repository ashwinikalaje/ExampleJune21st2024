package com.sgtesting.practice.assignmentConstrucorWithNoArgs;


class User {
    String fname;
    String lname;
    String email;

    User() {
        fname = "sachin";
        lname = "tendulakr";
        email = "sachin@gmail.com";

        System.out.println("************user details*******************");
        System.out.println("fname: " + fname);
        System.out.println("lname: " + lname);
        System.out.println("email: " + email);

        System.out.println("---------------------------");

        fname = "virat";
        lname = "kohli";
        email = "virat@gmail.com";

        System.out.println("************ user details *******************");
        System.out.println("fname: " + fname);
        System.out.println("lname: " + lname);
        System.out.println("email: " + email);
    }

}

class User_profile {
    String username;
    String password;

    User_profile() {
        System.out.println("************ user profile details *******************");

        username = "sachin";
        password = "********";

        System.out.println("username: " + username);
        System.out.println("password: " + password);

        System.out.println("--------------------------------------");

        username = "virat";
        password = "********";


        System.out.println("username: " + username);
        System.out.println("password: " + password);

    }
}

class Roles {
    String roles_type;

    Roles() {

        roles_type = "manager";
        System.out.println("************ roles type ********************");

        System.out.println("roles_type: " + roles_type);

        roles_type = "team lead";

        System.out.println("roles_type: " + roles_type);

    }

}

public class Demo4UserUserProfile {
    public static void main(String[] args) {
        User obj1 = new User();
        User_profile obj2 = new User_profile();
        Roles obj3 = new Roles();
    }
}

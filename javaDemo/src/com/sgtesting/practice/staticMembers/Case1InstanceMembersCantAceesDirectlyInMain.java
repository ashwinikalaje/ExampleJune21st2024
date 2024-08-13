package com.sgtesting.practice.staticMembers;

public class Case1InstanceMembersCantAceesDirectlyInMain {
    //instance method
    String fname;
    int age;

    public static void main(String[] args) {
        Case1InstanceMembersCantAceesDirectlyInMain obj=new Case1InstanceMembersCantAceesDirectlyInMain();
        obj.fname="Ashwini";
        obj.age=28;

        System.out.println("fname is: "+obj.fname);
        System.out.println("age is: "+obj.age);




    }
}

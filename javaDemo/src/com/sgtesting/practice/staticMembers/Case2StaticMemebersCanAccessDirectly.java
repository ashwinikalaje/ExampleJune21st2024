package com.sgtesting.practice.staticMembers;

public class Case2StaticMemebersCanAccessDirectly {
   static String fname;
   static int age;

    public static void main(String[] args) {
        fname="Ashwini";
        age=30;
        System.out.println("fname is: "+fname);
        System.out.println("age is: "+age);
    }
}

package com.sgtesting.practice.classWorkReturnType;


class Demo
{
    String getName()
    {
        String s="ash";
        return s;
    }
    int getAge()
    {
        int age=12;
        return age;
    }
    String[] gethobbies(String hobies[])
    {
        return hobies;
    }
}

public class DemoReturnType {
    public static void main(String[] args) {
        Demo o = new Demo();
        String s1 = o.getName();
        System.out.println("name "+s1);
        int i = o.getAge();
        System.out.println("age "+i);
        String s2[] = {"play", "sing", "cook"};
        String str[] = o.gethobbies(s2);
        for (String kk : str) {
            System.out.println(kk);
        }
    }
}



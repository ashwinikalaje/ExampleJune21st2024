package com.sgtesting.practice.constructor;
class Departmet
{
    Departmet(String dname, int dno)
    {
        System.out.println("dname "+dname);
        System.out.println("dno: "+dno);
    }
}
public class ParametrizesConstWithoutInstansce {
    public static void main(String[] args) {
        Departmet d=new Departmet("Library",3);
    }
}

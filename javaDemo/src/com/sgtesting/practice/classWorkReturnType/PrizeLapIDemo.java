package com.sgtesting.practice.classWorkReturnType;
class DisplayPrizeName
{
    int getPrize(int prizeLaptop)
    {
        return prizeLaptop;
    }
}

public class PrizeLapIDemo {
    public static void main(String[] args) {
        DisplayPrizeName o=new DisplayPrizeName();
        int v1=o.getPrize(355000);
        System.out.println(v1);
    }
}

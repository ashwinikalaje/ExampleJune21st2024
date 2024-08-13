package com.sgtesting.practice.assignemntOnReturnValue;
class ColoursDemo
{
  String[] getColurs(String colour[])
  {
      return colour;
  }
}
public class P2ColoursName {
    public static void main(String[] args) {
        ColoursDemo o=new ColoursDemo();
        String s1[]={"1.pink","2.redWine","3.BottleGreen"};
        String s2[]=o.getColurs(s1);
        System.out.println("favorite colours are like: ");
        for (String kk:s2)
        {
            System.out.println(kk);
        }

    }
}

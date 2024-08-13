package com.sgtesting.practice.assignmentOnMethods;

class DisplayTab
{
    void table()
    {
      int n=1;
      for(int i=1;i<=20;i++)
      {
          for(int j=1;j<=10;j++)
          {
              System.out.println(n+"*"+j+"="+(n*j)+"");
          }
          n++;
          System.out.println("");
      }
    }
}
public class DisplayAllTable {
    public static void main(String[] args)
    {
        DisplayTab tb=new DisplayTab();
        tb.table();

    }

}

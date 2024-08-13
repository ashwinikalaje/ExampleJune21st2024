package com.sgtesting.practice.assignemntOnReturnValue;

import java.util.Arrays;

class DisplayRes
{
    int[][] columnDisplay(int x[][])
    {

        int res[][]=new int[x.length][x[0].length];
        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x[i].length;j++)
            {
              if(j==0)
              {
                  res[i][j]=x[i][j];
              }
            }
        }
        return res;
    }
}

public class P8FistColumDisplay {
    public static void main(String[] args) {
        DisplayRes re=new DisplayRes();
        int x[][]={{1,2,3},{4,5,6},{7,8,9}};
      int[][]z = re.columnDisplay(x);
        for(int i=0;i<z.length;i++)
        {
            for(int j=0;j<z[i].length;j++)
            {
                System.out.print(z[i][j]+" ");
            }
            System.out.println();
        }

    }
}

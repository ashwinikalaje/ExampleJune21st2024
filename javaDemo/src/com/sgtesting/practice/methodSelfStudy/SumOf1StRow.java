package com.sgtesting.practice.methodSelfStudy;

public class SumOf1StRow {
    public static void main(String[] args)
    {
        int[][] arr={
                {1,2,3},
                {2,3,4},
                {6,8,5}

        };
        System.out.println("*************reading the element ******************");
        for(int i=0;i<arr.length;i++)
        {

            for(int j=0;j<arr[i].length;j++)


            System.out.print(" "+arr[i][j]);

        }
        System.out.println();
        System.out.println("*******************************");

        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=0;j<arr[i].length;j++)

                sum+=arr[i][j];
                System.out.println("sum of row "+(i+1)+":"+sum);

        }
        System.out.println("*************************");
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=0;j<arr[i].length;j++)

                sum+=arr[j][i];
            System.out.println("sum of colum "+(i+1)+":"+sum);

        }

        System.out.println("************maximum number in coloumn *************");
        for(int i=0;i<arr.length;i++)
        {
           int max=arr[i][0];
            for(int j=0;j<arr[i].length;j++)

                max=(arr[j][i]>max)?arr[j][i]:max;
            System.out.println("sum of coloumn "+(i+1)+":"+max);

        }




    }
}

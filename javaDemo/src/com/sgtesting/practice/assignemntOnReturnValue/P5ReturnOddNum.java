package com.sgtesting.practice.assignemntOnReturnValue;
class DisplayOddNum
{
    int[] OddNumDisplay()
    {
        int listOffoddNum[]={9,7,5,3,1};
        return listOffoddNum;
    }
}

public class P5ReturnOddNum {
    public static void main(String[] args) {
        DisplayOddNum o=new DisplayOddNum();
        int listOffoddNum2[]=o.OddNumDisplay();
        System.out.println("odd numbers between 10 to 1 are: ");
        for(int x:listOffoddNum2)
        {
            System.out.println(x);
        }

    }
}

package com.sgtesting.practice.assignemntOnReturnValue;

class DisplaySecondHalfOFElement {
    double[] getSecondHalfOfTheEle() {
        double ele[] = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = ele.length - 1; i >= ele.length / 2; i--)
        {
            System.out.print(ele[i] + " ");
        }
        return ele;

    }
}

public class p10DisplaySecondHalf {
    public static void main(String[] args) {
        {
            DisplaySecondHalfOFElement o = new DisplaySecondHalfOFElement();
            double element[] = o.getSecondHalfOfTheEle();




        }
    }
}

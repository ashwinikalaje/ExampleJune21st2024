//Given integer array find sum of the 2nd half of th element
package com.sgtesting.practice.assignmentOnMethods;
class Demointeger
{
    void Array() {
        int sum = 0;
        int a[] = {10, 20, 30, 40, 50};
        for (int i = 0; i <= 2; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum + " ");
    }
        // Calculate the sum of the second half
       void Array1(){
        int sum=0;
        int a[]={1,2,3,4,5,6,7};
        for (int j=2;j<=3;j++){
            sum=sum+a[j];
        }
           System.out.println(sum+" ");
    }
}
public class SumOfGivenIntegerDemo {
    public static void main(String[] args) {
        Demointeger o=new Demointeger();
        o.Array();
        o.Array1();
    }
}

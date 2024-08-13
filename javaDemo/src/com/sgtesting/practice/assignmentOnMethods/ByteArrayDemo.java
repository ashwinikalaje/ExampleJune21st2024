//write method for givenByte array Assign each elements into int array and
// read the element from integer arry

package com.sgtesting.practice.assignmentOnMethods;
class ByteDemo
{
    void castingDemo(byte b[])
    {
       int a[]=new int[b.length];
       int i;
       for(i=0;i<b.length;i++)
       {
           a[i]=b[i];
           System.out.println(a[i]+"");
       }

    }

}

public class ByteArrayDemo {
    public static void main(String[] args) {
        ByteDemo obj=new ByteDemo();
        obj.castingDemo(new byte[] {1,2,3,4});


    }

    }



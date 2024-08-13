/*Case3: There are 2 classes Demo1, Demo2. Demo1 contains instance method,
 Demo2 contains static
method, can we call instance method of Demo1 in static method of Demo2?*/

package com.sgtesting.practice.staticMembers;


class Demo1 {
    int instanceGetMul(int m, int n) {
        return (m * n);
    }
}

class Demo2 {

    static void add(int x, int y) {
        System.out.println("add resu: " + (x + y));

        Demo1 ob = new Demo1();
        int res = ob.instanceGetMul(3, 2);
        System.out.println("multiplication result:" + res);

    }
}

public class Sceanrio1InstanceMethodAndStaticmethod {
    public static void main(String[] args) {
        Demo2.add(3,2);




    }
}

package com.sgtesting.practice.classWorkReturnType;
class Demo1
{
    String[] getDishItems() {
        String s[] = {"Palav", "Idly", "dosa"};
        return s;
    }
}

public class DemoFavrateDish {
    public static void main(String[] args) {
        Demo1 o=new Demo1();
        String dishes[]=o.getDishItems();
        for(String val:dishes)
        {
            System.out.println(val);
        }

    }
}

package com.sgtesting.practice.assignmentOnMethods;

class DeMochar
{
    void printChar()
    {

        for (char ch = 'p'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
    }
}
public class PrintCharPToZ {
    public static void main(String[] args) {
        DeMochar o=new DeMochar();
        o.printChar();
    }
}

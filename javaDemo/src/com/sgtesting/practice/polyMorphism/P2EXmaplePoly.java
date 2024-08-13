package com.sgtesting.practice.polyMorphism;
abstract class Payment
{
    abstract void processPayment();
}
class  CreditCardPayment extends Payment
{
    void processPayment()
    {
        int amount=1000;
        System.out.println("CreditCardPayment: "+amount);
    }
}
class DebitCardPayment extends Payment
{
    void processPayment()
    {
        int amount=2000;
        System.out.println("DebitCardPayment: "+amount);
    }
}
class BankingPayment extends Payment
{
    void processPayment()
    {
        int amount=3000;
        System.out.println("BankingPayment: "+amount);
    }
}
public class P2EXmaplePoly {
    public static void main(String[] args) {


        Payment pt = null;
        DebitCardPayment db = new DebitCardPayment();
        BankingPayment bp=new BankingPayment();

        pt = db;
        pt.processPayment();

        pt=bp;
        pt.processPayment();

    }
}

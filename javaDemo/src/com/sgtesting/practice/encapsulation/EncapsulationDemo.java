package com.sgtesting.practice.encapsulation;
class Bank
{
    private String bankName;
    private long accountNum;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(long accountNum) {
        this.accountNum = accountNum;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
    Bank b=new Bank();

    b.setBankName("Axis bank");
    String b1=b.getBankName();
        System.out.println("bank name is:"+b1);

     b.setAccountNum(123489998L);
    long b2= b.getAccountNum();
        System.out.println("account num:"+b2);
    }
}

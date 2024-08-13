package com.sgtesting.practice.assignemntOnReturnValue;
class DisplayCountryName{
    String[] getCountryName(String countryList[])
    {
        return countryList;

    }
}

public class P6CountryName {
    public static void main(String[] args) {
        DisplayCountryName o=new DisplayCountryName();
        String s1[]={"India","Barma","Chaina","Nepal"};
        String s2[]=o.getCountryName(s1);
        System.out.println("country name are: ");
        for(String x:s2)
        {
            System.out.println(x);
        }


    }
}

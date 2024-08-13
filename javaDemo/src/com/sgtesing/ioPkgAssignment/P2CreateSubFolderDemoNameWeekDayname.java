package com.sgtesing.ioPkgAssignment;

import java.io.File;

public class P2CreateSubFolderDemoNameWeekDayname {
    public static void main(String[] args) {
        createFolder();
    }

    private static void createFolder()
    {
        File f1=new File("D:\\DemoAssignment2\\");
        boolean v1=f1.mkdir();
        System.out.println("Whether it creates a Folder :"+v1);
        String week[]={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        for(int i=0;i<week.length;i++)
        {
            File f2=new File("D:\\DemoAssignment2\\"+week[i]);
            boolean v2=f2.mkdir();
            System.out.println("Whether it creates a Folder :"+v2);
        }
    }


}

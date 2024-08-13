package com.sgtesing.ioPkgAssignment;

import java.io.File;





public class P1DemoCreateFolder {
    public static void main(String[] args) {
        createFolder();
    }

    private static void createFolder()
    {
        File f1=new File("D:\\DemoAssignment\\");
        boolean v1=f1.mkdir();
        System.out.println("Whether it creates a Folder :"+v1);
        String week[]={"folder1","folder2","folder3","folder4","folder5","folder6","folder7"};
        for(int i=0;i<week.length;i++)
        {
            File f2=new File("D:\\DemoAssignment\\"+week[i]);
            boolean v2=f2.mkdir();
            System.out.println("Whether it creates a Folder :"+v2);
        }
    }


}


package com.sgtesting.practiceOnFile;

import java.io.File;

public class CreateFileDemo {
    public static void main(String[] args) {
        creatFile();
    }
    public static void  creatFile()
    {
        try
        {
            File f1= new File("D:\\DemoNew");
            Boolean f2=f1.mkdir();
            System.out.println("Directory is created:"+f2);

            if(f1.isDirectory()==true) {
                File f5 = new File("D:\\DemoNew\\ExampleDe.txt");
                boolean v1 = f5.createNewFile();
                System.out.println("file has created: " + v1);
            }
        }catch(Exception e)
        {
          e.printStackTrace();
        }
    }
}

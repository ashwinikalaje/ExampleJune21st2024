package com.sgtesting.practiceOnFile;

import java.io.File;
//bharat done
public class CreateFile {
    public static void main(String[] args) {

            try {
                File f1 = new File("D:\\Demooo");
                if(f1.mkdir()==true)
                    System.out.println("Directory is created succesfully");
                else
                    System.out.println("Directory is not created");
                if (f1.isDirectory() == true)
                {
                    File f5 = new File("D:\\Demooo\\ashwini.txt");
                    if(f5.createNewFile()==true)
                        System.out.println("file has created successfully");
                    else
                        System.out.println("file not created");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
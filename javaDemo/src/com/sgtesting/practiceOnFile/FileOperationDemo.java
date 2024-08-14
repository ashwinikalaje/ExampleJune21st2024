package com.sgtesting.practiceOnFile;

import java.io.File;

public class FileOperationDemo {
    public static void main(String[] args) {
//        createFile();
//        RenameFile();
//        DeleteFile();
        listOfFiles();
    }
        private static void createFile()
        {
            try 
            {
              //  File f1=new File ("D:\\Demo\\Example\\Sample\\Sample.txt");
                File f1= new File("D:\\SampleDemo\\Example\\Example.txt");

                //here we need to put try catch or else it will show error
                f1.createNewFile();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        }
    private static void RenameFile()
    {
        try
        {
            File f1= new File("D:\\SampleDemo\\Example\\Example.txt");
            f1.createNewFile();
            File f2= new File("D:\\SampleDemo\\Example\\Examplenew1.txt");

            boolean v1= f1.renameTo(f2);
            System.out.println("Whether File has renamed "+v1);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    private static void DeleteFile()
    {
        try
        {
            File f1= new File("D:\\SampleDemo\\Example\\Example.txt");
            f1.createNewFile();

            boolean v1= f1.delete();
            System.out.println("Whether File has deleted "+v1);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    private static void listOfFiles()
    {
        try
        {
            //listOfFiles
            File f1= new File("D:\\SampleDemo\\Example");
            File[] f2=f1.listFiles();
            for(int i=0;i<f2.length;i++)
            {
                if(f2[i].isFile()==true)
                {
                    System.out.println(f2[i].getPath());
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }




}

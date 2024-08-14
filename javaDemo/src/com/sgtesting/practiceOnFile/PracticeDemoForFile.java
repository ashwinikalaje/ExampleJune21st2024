package com.sgtesting.practiceOnFile;

import java.io.File;

public class PracticeDemoForFile {
    public static void main(String[] args) {
        File f1=new File("D:\\Demo\\Sample.txt");
        //displayFileName
        String FileName=f1.getName();
        System.out.println("File name is: "+FileName);

        //Displayp path

        String pathOfTheFileName=f1.getAbsolutePath();
        System.out.println("pathOfTheFileName: "+pathOfTheFileName);

        //DispalyParentFolder
        String parentFolderName=f1.getParent();
        System.out.println("parentFolderName: "+parentFolderName);

        //DisplayWhether it is file or not

        boolean v1= f1.isFile();
        System.out.println(v1);
        //DisplayWhether it is directory or not
        boolean v2=f1.isDirectory();
        System.out.println(v2);

        //readable

        boolean v3=f1.canRead();
        System.out.println("reable: "+v3);
//writeable
        boolean v4=f1.canRead();
        System.out.println("write: "+v4);
//executable
        boolean v5=f1.canRead();
        System.out.println("write: "+v5);
    }
}

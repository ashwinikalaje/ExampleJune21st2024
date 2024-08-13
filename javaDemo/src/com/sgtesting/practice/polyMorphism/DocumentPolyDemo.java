package com.sgtesting.practice.polyMorphism;
abstract class Document {
    abstract void print();
}

class PDFDocument extends Document {
    void print() {
        System.out.println("Printing PDF document");
    }
}

class WordDocument extends Document {
    void print() {
        System.out.println("Printing Word document");
    }
}

class AudioDocument extends Document
{
    void print() {
        System.out.println("Listning Audio document");
    }

}
public class DocumentPolyDemo {
    public static void main(String[] args) {
        Document document=null;
        PDFDocument pdf=new PDFDocument();
        WordDocument word=new WordDocument();
        AudioDocument audio=new AudioDocument();
        document =pdf;
        document.print();

        document =audio;
        document.print();

        document=word;
        document.print();


    }


}

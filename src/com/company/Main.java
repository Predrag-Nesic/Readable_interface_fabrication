package com.company;

public class Main {

    public static void main(String[] args) {
        Ebook k1 = new Ebook("Na Drini cuprija", "Ivo Andric");
        k1.addPage("first page");
        k1.addPage("second page");
        k1.addPage("third page");
        k1.addPage("fourth page");
        k1.addPage("fifth page");

        k1.read();
        k1.read();
        k1.read();
        k1.read();
        k1.read();
        k1.read();

        Fabric fabric = new Fabric();

        Readable c1 = fabric.fabricate();
        Readable c2 = fabric.fabricate();
        Readable c3 = fabric.fabricate();

        System.out.println("============FIRST OBJECT=============");
        c1.read();
        c1.read();
        c1.read();
        c1.read();
        c1.read();
        c1.read();
        System.out.println("============SECOND OBJECT=============");
        c2.read();
        c2.read();
        c2.read();
        c2.read();
        c2.read();
        c2.read();
        System.out.println("============THIRD OBJECT=============");
        c3.read();
        c3.read();
        c3.read();
        c3.read();
        c3.read();
        c3.read();


    }
}

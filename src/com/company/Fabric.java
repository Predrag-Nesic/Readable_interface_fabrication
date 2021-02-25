package com.company;

import java.util.Random;

public class Fabric {
    public Readable fabricate() {
        Random random = new Random();
        int i = random.nextInt(3);

        if(i == 0) {
            return new Sms("Predrag Nesic", "you've got a message");
        } else if(i == 1) {
            return new Ebook("New book", "New author");
        } else {
            Ebook k1 = new Ebook("Full book", "Old author");
            k1.addPage("first page");
            k1.addPage("second page");
            k1.addPage("third page");
            k1.addPage("fourth page");
            k1.addPage("fifth page");

            return k1;
        }
    }
}

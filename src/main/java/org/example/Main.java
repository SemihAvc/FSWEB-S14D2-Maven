package org.example;

import org.example.enums.LampType;
import org.example.enums.PaintColor;
import org.example.model.Bed;
import org.example.model.Ceiling;
import org.example.model.Lamp;

public class Main {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp(LampType.NEON, true, 100);
        lamp1.turnOn();
        Ceiling ceiling = new Ceiling(3, PaintColor.RED);
        ceiling.create();
        Bed bed = new Bed("Double",1,1,1,1);
        System.out.println(bed.toString());

    }
}
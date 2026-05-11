package com.pluralsight;

import com.pluralsight.model.Car;
import com.pluralsight.model.HoverCraft;
import com.pluralsight.model.Moped;
import com.pluralsight.model.SemiTruck;

public class Main {
    static void main() {

        Moped m = new Moped();
        m.setColor("Blue");
        m.setFuelCapacity(15);
        m.setNumberOfPassengers(1);
        System.out.println(m);


        Car c = new Car();
        c.setColor("White");
        c.setFuelCapacity(45);
        c.setNumberOfPassengers(6);

        System.out.println(c);

        SemiTruck t = new SemiTruck();
        t.setColor("Black");
        t.setFuelCapacity(120);
        t.setCargoCapacity(65);

        System.out.println(t);

        HoverCraft h = new HoverCraft();
        h.setColor("Gray");
        h.setCargoCapacity(4);
        h.setFuelCapacity(35);
        System.out.println(h);
        }



}

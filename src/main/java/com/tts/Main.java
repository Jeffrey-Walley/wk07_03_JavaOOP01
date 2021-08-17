package com.tts;
// import java.io.File;
// import java.lang.Integer;   // auto imported by java  - the .lang is auto imported
// import java.util.* -- NOT best practice
import java.util.ArrayList;   // -- best to explicitly import by specifying
import java.util.Arrays;

// Java has 1000s of Classes, Packages, and Interfaces in the JDK

import com.tts.example.Example;
// import com.tts.other.Example;            // cannot import because there is an imported 'Example' already

import com.tts.vehicle.Car;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {                            // the args deal with command line arguements -- extra arguements you add in when running the code

       // Integer myInt = new Integer(2);  // not necessary to import Integer because it is part of java.lang

        System.out.println(Example.x);   // returns 1 (that is what value is assigned to x in com.tts.Example.example
        System.out.println(com.tts.other.Example.x);  // this will allow you to have 2 'Example' Classes - by using the full path

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();


        arrayList.add("Howdy");
        arrayList.add("Pardner");
        System.out.println("This is the size of my arrayList: " + arrayList.size());  // uses '.dot notation'
        System.out.println(arrayList);                                                  // prints out arrayList
        System.out.println(arrayList.get(1));                                          // returns 'Pardner' since pardner is indexed at 0

        // making a new instance of Car
        Car ploppaCar = new Car("blue", 7);                                       // 'new Car()' is "INVOKING THE CONSTRUCTOR"
                        // - there is no constructor defined in the class, but every Object has a defined constructor
                            // the constructor was created and now color and numDoors must be passed in when instantiating the Object

    //    ploppaCar.color = "blue";
    //    ploppaCar.numDoors = 4;                  // not good functionality allowing information to be manipulated this way, best to use getters and setters

      // using the "Getter / Setter" to set car color

        // ploppaCar.setColor("blue");              // made constructor, so now this information is required in the field
        ploppaCar.start();
        ploppaCar.drive();
        ploppaCar.drive(254);
        ploppaCar.drive("Cleveland");    // intelliJ now shows the different methods available to 'drive' since it has been overloaded

        ploppaCar.setCarType(Car.TYPE_FAMILY);      // good practice to utilize the constants that have been created


    //    System.out.println(ploppaCar.color);
        System.out.println(ploppaCar.getColor());
        System.out.println(ploppaCar.getNumDoors());

        ArrayList<Integer> integers = null;      // this can be problematic, avoid referencing 'null'

        boolean result = Car.areDoorsEqual(ploppaCar, new Car("red", 2));
        System.out.println("do the vehicles have the same # of doors?: " + result);

        ploppaCar.grossWeightInLbs = 2500;

        System.out.println("the car weighs: " + Example.convertGrossWeightToKgs(ploppaCar) + " Kgs");

        System.out.println(args);

        Arrays.stream(args).forEach(string -> System.out.println(string));   // functional programming format
    }


}

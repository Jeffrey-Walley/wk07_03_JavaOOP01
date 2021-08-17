package com.tts.vehicle;

public class Car {


    // Fields of the Object:
    // color
    public String color;
    // amount of doors
    public int numDoors;

    private static final int MAX_DOORS = 6;      // static belongs to the Class and not to instances of the class
    private static final int MIN_DOORS = 1;

    public static final String TYPE_SPORTY = "Sporty";
    public static final String TYPE_FAMILY = "Family";

    public int grossWeightInLbs;


    private String carType;
    private int currentRPM;
    private int speed;


    // Methods of the Object:
    // start
    public void start() {
        System.out.println("car is starting");
    }
    // drive
    public void drive() {
        System.out.println("car is driving");
    }

    public void drive(int miles) {
        System.out.println("Driving for " + miles + " miles");
    }

    public void drive(String destination) {
        System.out.println("Driving to : " + destination);   // examples of "overloading" the methods -- drive now has more information it can contain
    }

    // stop
   // public void stop() {
  //      System.out.println("car is stopping");
  //  }

    // 'setter' sets Color using the "Getter / Setter"
    public void setColor(String color) {
        this.color = color;                                 // data binding
    }


    // Car Constructor

    public Car(String color, int numDoors) {
        this.color = color;
        this.numDoors = numDoors;
    }


    // 'getter' of the "Getter/Setter"
    public String getColor() {
        return color;
    }


    // now for numDoors "Getter / Setter"
    public void setNumDoors(int numDoors) {
       if (numDoors > MIN_DOORS && numDoors < MAX_DOORS) {
            this.numDoors = numDoors;
        } else {
            this.numDoors = -1;
        }
    }

    public int getNumDoors() {
        return numDoors;
    }

    public int getCurrentRPM() {
        return currentRPM;
    }

    public void setCurrentRPM(int rpm) {
        this.currentRPM = rpm;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        setCurrentRPM(calculateRPM(speed));
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }


    private int calculateRPM(int speed) {
    //    int rpm = speed * getBestGear(speed) * engineFactor();
        int rpm = speed * 3;
        return rpm;
    }

    public static boolean areDoorsEqual(Car carOne, Car carTwo) {
        return carOne.getNumDoors() == carTwo.getNumDoors();
    }


}


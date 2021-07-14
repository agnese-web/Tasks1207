package com.company;

public class Vehicle {

    private String brand = "Audi";
    private int numOfSeats = 4;
    private int numOfTires = 4;
    private double length = 3.7;
    private int speed = 100;

    public Vehicle() {

    }

    // Start engine, Stop Engine, Speed manipulation
    public void startEngine(boolean start) {
        if (start) {
            System.out.println("Engine switched on!");
        } else {
            System.out.println("Please press Start button!");
        }
    }

    public void stopEngine(boolean stop) {
        if (stop) {
            System.out.println("The engine is turned off!");
        } else {
            System.out.println("The engine is still running, press Stop button to turn it off");
        }
    }

    public void speedUp (boolean gas){
        if (gas) {
            System.out.println("The speed of the " + getBrand() + " is now: "  + (getSpeed() + 5));
        } else {
            System.out.println("The speed is as it was before : " + getSpeed());
        }
    }

    public void speedDown (boolean brake) {
        if (brake) {
            System.out.println("The speed of the " + getBrand() + " is now: " + (getSpeed() - 5));
        } else {
            System.out.println("The speed is as it was before : " + getSpeed());
        }
    }


    // getters, setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public int getNumOfTires() {
        return numOfTires;
    }

    public void setNumOfTires(int numOfTires) {
        this.numOfTires = numOfTires;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}

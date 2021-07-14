package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {



        //  PLEASE UNCOMMENT EACH TASK INDIVIDUALLY TO SEE IT WORK



//        // TASK 1 -------------------------------------
//	// write a program that counts in descending order from 100 to 0;
//        // Print out only the values are divisible by 6.
//
//        System.out.println("Numbers from 100 to 0 that are divisible by 6: ");
//
//        for(int i = 100; i >= 0; i--) {
//            if (i % 6 == 0) {
//                System.out.println(i);
//            }
//        }



        // TASK 2 --------------------------------------------------
        // average
        // Write a program that takes input from the user for 10 numbers
        // and find the average of those numbers

//        Scanner scanner = new Scanner(System.in);
//        int[] number = new int[10];
//        double average = 0;
//        double sum = 0;
//
//        for(int i = 0; i < number.length; i++) {
//            System.out.print("Please enter number: ");
//            number[i] = scanner.nextInt();
//            sum = sum + number[i];
//        }
//        average = sum/10;
//        System.out.println("The average is: " + average);



        // TASK 3 ---------------------------------------------------

//        Scanner scan = new Scanner(System.in);
//        String[] string = new String[5];
//        String sentence = "";
//
//        for (int i = 0; i < string.length; i++) {
//            System.out.print("Enter a word to create a sentence: ");
//            string[i] = scan.next();
//            sentence += string[i] + " ";
//        }
//        System.out.println(sentence);



        // TASK 4 -------------------------------------------------


//        Scanner scanner = new Scanner(System.in);
//        int[] numbers = new int[10];
//        int size = numbers.length;
//        for(int i = 0; i < numbers.length; i++) {
//            System.out.print("Enter a number : ");
//            numbers[i] = scanner.nextInt();
//        }
//        Arrays.sort(numbers);
////        System.out.println(Arrays.toString(numbers)); // if You want to see the array
//        int largest = numbers[size -1];
//        System.out.println("Largest number is: " + largest);



        // TASK 5 -------------------------------------------
//
//        int numbers, odd = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter Number of elements: ");
//        numbers = scanner.nextInt();
//
//        int [] newNumbers = new int[numbers];
//
//        System.out.print("Enter " + numbers + " elements: ");
//        for (int i = 0; i < numbers; i++)
//        {
//            newNumbers[i] = scanner.nextInt();
//        }
//
//        for(int i = 0; i < numbers; i++)
//        {
//            if(newNumbers[i] % 2 != 0)
//            {
////                System.out.print(newNumbers[i] + " ");  // If wanted to see all the odd numbers
//                odd++;
//            }
//        }
//        System.out.println("Total Number of Odd Numbers : " + odd);

        // TASK 6 ----------------------------------------------------
        //  create a class called Vehicle. Let this care have features
        // length of vehicle, number of seats, number of tires
        // name/brand
        // current speed of the vehicle
        // Methods: speed up (increases speed by 5), slow down(reduce speed by 5), start engine, stop engine


        Vehicle car = new Vehicle();
        System.out.println("The brand is " + car.getBrand());
        System.out.println("The number of seats the vehicle has: " + car.getNumOfSeats());
        System.out.println("The number of tires the vehicle has: " + car.getNumOfTires());
        System.out.println("The length of the vehicle: " + car.getLength() + "m");
        System.out.println("The current speed is: " + car.getSpeed());

        car.startEngine(true);
        car.speedUp(true);

        Vehicle moto = new Vehicle();
        moto.setBrand("BMW");
        moto.setNumOfSeats(2);
        moto.setNumOfTires(2);
        moto.setLength(1.5);
        moto.setSpeed(180);
        System.out.println("The brand is " + moto.getBrand());
        System.out.println("The number of seats the vehicle has: " + moto.getNumOfSeats());
        System.out.println("The number of tires the vehicle has: " + moto.getNumOfTires());
        System.out.println("The length of the vehicle: " + moto.getLength() + "m");
        System.out.println("The current speed is: " + moto.getSpeed());

        moto.speedDown(true);
        moto.stopEngine(true);

    }

}

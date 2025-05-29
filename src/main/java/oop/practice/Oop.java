package oop.practice;

import figur.oop.Circle;
import figur.oop.Figures;
import figur.oop.Square;
import figur.oop.Triangle;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Oop {
    public static void main(String[] args) {
        task1();
    }
    /*In a separate figur package you need to create a class structure and implement the necessary methods.
There must be a base abstract class and its descendants.
All functions must be implemented.
In the Main class with the main method main, the task must be implemented.

Class Description:
Create a class structure for circle, square and triangle. Each of them should have the following fields (private) and methods (public)
- name
- coordinates
- function to get coordinates
- area calculation function

Task
The following items should be implemented in the main function:
- creating an array of random shapes with the size of 10 elements.
- sort the shapes by area (ASC/DESC - it doesn't matter)
- output the sorted array on the console in the form : Name, S=area*/
    public static void task1() {
        Random random = new Random();

        Figures[] randomefigures = new Figures[10];
        System.out.println("Initial array:");

        for (int i = 0; i < 10; i++) {
            int type = random.nextInt(3);
            double coordinate = random.nextDouble(100);
            switch (type) {
                case 0:
                    randomefigures[i] = new Circle("Circle", coordinate);
                    break;
                case 1:
                    randomefigures[i] = new Triangle("Triangle", coordinate);
                    break;
                case 2:
                    randomefigures[i] = new Square("Square", coordinate);
                    break;
            }
            System.out.println("Shape " + i + ": " + randomefigures[i].getName() + ", Coordinate: " + randomefigures[i].getcoordinates() +
                    ", S = " + randomefigures[i].areacalculation());
        }
        System.out.println("\nArea of shapes in ASC order:");
        Arrays.sort(randomefigures, Comparator.comparingDouble(Figures::areacalculation));
        for (int i = 0; i < 10; i++) {
            System.out.println(randomefigures[i].getName() + ", S = " + String.format("%.2f", randomefigures[i].areacalculation()));
        }
    }
}

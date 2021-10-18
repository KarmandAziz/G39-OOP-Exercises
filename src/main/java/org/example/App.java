package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {




    }

    //Exercises

    public static void oopExercise1() {
        Car car = new Car(1,
                2020,
                "Mercedes",
                "Black",
                3.5);

        System.out.println(car.drive());
    }

    public static void oopExercise2() {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Input height: ");
        rectangle.setHeight(scanner.nextInt());
        System.out.println("Input width: ");
        rectangle.setWidth(scanner.nextInt());
        System.out.println(rectangle.getArea());
    }


}

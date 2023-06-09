package BodyMaseIndexCalculator;


import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height in cm");
        double height = input.nextDouble();
        System.out.println("Enter your weight in kg");
        double weight = input.nextDouble();

        double convertedheight= height/100;

        double bmicalculate= weight/(Math.pow(convertedheight,2));

        if (bmicalculate<18.5){
            System.out.println("You are in the underweight range!");
        } else if (bmicalculate<24.9) {
            System.out.println("You are in healthy range!");
        } else if (bmicalculate<29.9) {
            System.out.println("You are in the overweight range!");
        } else if (bmicalculate<39.9) {
            System.out.println("You are in the obesity range!");
        } else if (bmicalculate>39.9 ) {
            System.out.println("you are in the severe obesity range !");
        }else {
            System.out.println("You entered incorrect values!!!");
        }

    }
}


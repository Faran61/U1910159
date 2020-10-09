package com.company;
import java.util.Scanner;
        /*Farangiz Khojimatova U191059
        Lab Assignment - 1
        1. A program to calculate and display a user's BMI*/
        public class BMIcalculator {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                double weight, height, BMI;
                System.out.print("Enter you weight in kg: ");
                weight = input.nextDouble();
                System.out.print("Enter you height in m: ");
                height = input.nextDouble();
                BMI = weight / (height * height);
                System.out.println("Your BMI result is: " +BMI);
                System.out.println("----------------------------------------");
                System.out.println("BMI VALUES");
                System.out.println("Underweight: less than 18.5");
                System.out.println("Normal: between 18.5 and 24.9");
                System.out.println("Overweight: between 25 and 29.9");
                System.out.println("Obese: 30 or greater");
            }}


/*
 * UCF COP3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Alex Vorakrajangthiti
 */
import java.util.Scanner;

public class exercise19 {
    public static void main(String[] args)
    {
        System.out.print("Please enter your height in inches: ");
        Scanner scanner = new Scanner(System.in);
        String height = scanner.nextLine();
        float newheight = Float.parseFloat(height);

        System.out.print("Please enter your weight in pounds: ");
        Scanner scanner1 = new Scanner(System.in);
        String weight = scanner1.nextLine();
        float newweight = Float.parseFloat(weight);

        float bmi = (newheight*newheight);
        float bmiwh = newweight/bmi;
        double bminew = bmiwh * 703;

        if (bminew < 18.5) {
            System.out.print("Your BMI is " + bminew + ".");
            System.out.print("\nYou are underweight. You should see your doctor.");
        }
        else if (bminew > 25)
    {
                System.out.print("Your BMI is " + bminew+ ".\n");
                System.out.print("You are overweight. You should see your doctor.");}
        else {
        System.out.print("Your BMI is " + bminew + ".\n");
        System.out.print("You are within the ideal weight range.");
    }


    }

}


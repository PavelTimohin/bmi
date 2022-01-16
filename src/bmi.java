//import scanner
import java.util.Scanner;

//import Math class
import java.lang.Math;

public class bmi{

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //create scanner
        Scanner input = new Scanner(System.in);

        //declare variables
        double weight;
        int feet;
        int inches;

        //prompt user
        System.out.print("Enter weight in pounds:70 ");
        weight = input.nextFloat();

        System.out.print("Enter feet: 30");
        feet = input.nextInt();

        System.out.print("Enter inches: 30");
        inches = input.nextInt();

        //convert measurements
        double weightInKilos = weight * 0.453592;
        double heightInMeters = (((feet * 12) + inches) * .0254);
        double bmi = weightInKilos / Math.pow(heightInMeters, 2.0);
//      double bmi = weightInKilos / (heightInMeters * heightInMeters);

        //display output
        System.out.println("Your BMI is: " + bmi);

        //interpret BMI
        if ( >= 18.5 &&  <= 24.9)
        {
            System.out.println("You are a healthy, normal weight");
        }

        else if (bmi >= 18.5 && bmi < 25) {
            System.out.print("Normal");
        }

        else if (bmi >= 25 && bmi < 30) {
            System.out.print("Overweight");
        }

        else if (bmi >= 30) {
            System.out.print("Obese");
        }

//      Do I need this last else if there?
//      else {
//          System.out.print("");
//      }

        input.close();

    }

}
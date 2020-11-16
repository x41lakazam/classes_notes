import java.util.Scanner;
import java.lang.Math;

public class Circle {
    public static void main (String[] args){

        // Instantiate a scanner
        Scanner scan = new Scanner (System.in);

        // Displaying an explanation to the user
        System.out.println("This program calculates the areas " +
                "and the perimeters of the excircle and the incircle " +
                "of a given rectangle ");

        // Scanning top-left coordinates
        System.out.println("Please enter the two coordinates of the " +
                "left-upper point of the rectangle");
        int topLeftX = scan.nextInt();
        int topLeftY = scan.nextInt();

        // Scanning bot-right coordinates
        System.out.println("Thanks, now please enter the two coordinates of the " +
                "right-bottom point of the rectangle");
        int botRightX = scan.nextInt();
        int botRightY = scan.nextInt();

        // Calculate rectangle's width and height
        float height = topLeftY - botRightY;
        float width = botRightX - topLeftX;

        // Calculate in-circle and out-circle radius
        // Supposing that width > height, inner-circle radius is half of the height
        double inCircleRadius = height / 2;
        // Outer-circle radius is half of the rectangle diagonal
        double outCircleRadius = Math.sqrt(Math.pow(height, 2)+Math.pow(width, 2)) / 2;

        // Calculate area
        double inCircleArea = Math.PI * Math.pow(inCircleRadius, 2);
        double outCircleArea = Math.PI * Math.pow(outCircleRadius, 2);

        // Calculate perimeter
        double inCirclePerimeter = 2*Math.PI*inCircleRadius;
        double outCirclePerimeter = 2*Math.PI*outCircleRadius;

        // Display results
        System.out.println("Incircle: radius = " + inCircleRadius +
                ", area = " + inCircleArea +
                ", perimeter = " + inCirclePerimeter);

        System.out.println("Excircle: radius = " + outCircleRadius +
                ", area = " + outCircleArea +
                ", perimeter = " + outCirclePerimeter);
    } // end of method main
} // end of class Circle

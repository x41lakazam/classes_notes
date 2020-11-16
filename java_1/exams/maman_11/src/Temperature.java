import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        // Define conversions constants
        final double KELVIN_0 = 273.15; // Starting point of the Kelvin scale related to celsius
        final double FAHRENHEIT_0 = 32; // Starting point of the fahrenheit scale related to celsius
        final double F_TO_C_RATIO = 5.0/9.0; // Ratio between one fahrenheit degree to one celsius degree
        final double C_TO_F_RATIO = 1/F_TO_C_RATIO; // Ratio between one celsius degree to one fahrenheit degree

        // Initializing variables containing the three temperatures
        double celsiusTemp, fahrenheitTemp, kelvinTemp;
        celsiusTemp = fahrenheitTemp =  kelvinTemp = 0;

        // Instantiate scanner and get input from the user
        System.out.print("Hi, please enter a temperature with its scale (for example: C 125): ");
        Scanner scan = new Scanner(System.in);

        // Read user input
        char temperatureScale = scan.next().charAt(0);
        double temperature = scan.nextDouble();

        // Checking scale mode and calculating every conversion.
        if (temperatureScale == 'F') {
            fahrenheitTemp = temperature;
            celsiusTemp = (temperature - FAHRENHEIT_0) * F_TO_C_RATIO;
            kelvinTemp = celsiusTemp + KELVIN_0;
        } else if (temperatureScale == 'C') {
            celsiusTemp = temperature;
            kelvinTemp = celsiusTemp + KELVIN_0;
            fahrenheitTemp = (celsiusTemp * C_TO_F_RATIO) + FAHRENHEIT_0;
        } else if (temperatureScale == 'K') {
            kelvinTemp = temperature;
            celsiusTemp = kelvinTemp - KELVIN_0;
            fahrenheitTemp = (celsiusTemp * C_TO_F_RATIO) + FAHRENHEIT_0;
        }

        // Displaying results
        System.out.println(celsiusTemp + " C");
        System.out.println(fahrenheitTemp + " F");
        System.out.println(kelvinTemp+ " K");

    } // End of main method
} // End of Temperature

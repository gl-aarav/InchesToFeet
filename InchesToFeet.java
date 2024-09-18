/*
 * Aarav Goyal
 * 9-18-2024
 * Period:6
 * 
 * Working on:
 * Asking the user to enter a number of inches, 
 * Output it in the form of centimeters.
 * 
 * Psuedocode:
 * 
 * Import the Scanner class
 * Create the InchesToFeet class
 * Add main method.
 * Create new Scanner
 * Ask user for whole number of inches
 * Convert the inches to feet 
 * Output the feet amount
 * 
 * 
 * 12 inches = 1 feet
 * 24 inches = 2 feet
 * 36 inches = 3 feet
*/
import java.util.Scanner;
public class InchesToFeet{
	public static void main (String[] Args){
		Scanner convert = new Scanner(System.in);
		final double CONVERSION = 12.0;
		int inches;
		System.out.print("\n\n\nEnter a POSITIVE WHOLE number of inches (at most 2 billion): ");
		inches = convert.nextInt();
		double feet = (double)inches/CONVERSION;
		System.out.printf("\n%d inches is %.2f feet rounded to two decimal places.\n\n\n",inches, feet); 
	}
}

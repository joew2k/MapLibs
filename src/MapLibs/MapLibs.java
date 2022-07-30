package MapLibs;

import java.util.Scanner;

public class MapLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Get user input for season of the year.
		System.out.println("Enter season of the year");
		Scanner scanner = new Scanner(System.in);
		String season = scanner.next();
		
		// Ask user to enter a whole number
		System.out.println("Enter whole number");
		int wholeNumber = scanner.nextInt();
		
		// Ask user to enter an adjective
		System.out.println("Enter an adjective");
		String adjective = scanner.next();
		scanner.close();
		// output "On a [adjective][season of the year] day, i drink a minimum of [whole number] cups of coffee"
		System.out.println("On a " + adjective + " "+ season + " day, i drink a minimum of " + wholeNumber + " cups of coffee");

	}

}

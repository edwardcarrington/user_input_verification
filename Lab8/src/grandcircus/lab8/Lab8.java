package grandcircus.lab8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String wannaPlay = "yes";
		int userInput = 0;
		int userInput2 = 0;

		String[] student = { "Mike", "Carol", "Rasheed", "Nancy", "Lucy", "Susan", "Nancy", "Brian", "Lacy", "Lisa" };
		String[] spot = { "1.", "2.", "3.", "4.", "5.", "6.", "7.", "8.", "9.", "10." };
		String[] movie = { "Batman.", "Batman Begins.", "Batman Returns.", "Batman Forever.", "The Dark Knight.",
				"The Dark Knight Rises.", "Batman & Robin.", "Superman.", "Superman II.", "Superman III." };
		String[] place = { "the Riverwalk.", "the DIA.", "Cobo Hall.", "the Guardian Building.", "Grand Cirus Park.",
				"Windsor.", "Belle Isle.", "Tiger Stadium.", "all of Woodward.", "Bamboo Detroit." };

		// Start of print statements

		System.out.println("Hello! I hear that you're interested in learning more about our Java Bootcamp cohort!\n");
		System.out.println("Well, we have a very interesting group of people.");

		do {
			System.out.println("\n" + "You'll find the list of the students within this cohort below: ");

			for (int i = 0; i < 10; i++) {
				System.out.println(spot[i] + " " + student[i]);
			}

			try {

				System.out.println(
						"\nWhich student would you like to learn more about? (enter an actual number of 1-10)");
				userInput = scnr.nextInt();

				System.out.println("\n" + student[userInput - 1]
						+ " is an amazing student!\nWhat would you like to learn about " + student[userInput - 1]
						+ "? Type \"1\" for their favorite movie, or type \"2\" for their favorite place in Detroit:");

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("\n"
						+ "We have 10 students included within this cohort. Please re-enter a number between 1-10.");
				continue;

			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please re-enter a number between 1-10.");
				scnr.next();
				continue;
			}

			try {

				userInput2 = scnr.nextInt();

				if (userInput2 == 1) {
					System.out.println(student[userInput2 - 1] + "'s favorite movie is " + movie[userInput2 - 1]
							+ "\nWould you like to learn more about anyone else within our Grand Circus cohort? (enter \"yes\" or \"no\")\n");
					wannaPlay = scnr.next();
					scnr.nextLine();

				}
				if (userInput2 == 2) {
					System.out.println(student[userInput2 - 1] + "'s favorite place in Detroit is "
							+ place[userInput2 - 1]
							+ "\nWould you like to learn more about anyone else within our Grand Circus cohort? (enter \"yes\" or \"no\")\n");
					wannaPlay = scnr.next();
					scnr.nextLine();
				}

			} catch (Exception e) {
				System.out.println("Invalid input. Please re-enter either a \"1\" or a \"2\".");
				scnr.nextLine();
				continue;
			}

			// else if ((userInput2 != 1) || (userInput2 != 2)) {

		} while (wannaPlay.equalsIgnoreCase("yes"));

		if (wannaPlay.equalsIgnoreCase("no")) {
			System.out.println("\nThanks for wanting to learn more about our cohort. Hope to hear from you soon!");

		}
		scnr.close();
	}
}

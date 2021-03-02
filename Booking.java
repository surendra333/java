package hotelbooking;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Booking {
	void pay() {
		Menu m = new Menu();
		Scanner sc = new Scanner(System.in);
		System.out.println("1)cash" + "\n" + "2)paytm" + "\n");
		try {
			int option = sc.nextInt();
			if (option > 0 && option < 3) {
				switch (option) {
				case 1:
					billIdGenerator();
					System.out.println("Your Rooms are Booked" + "\n" + "You can pay Bill in Hotel with your booking id");
					System.out.println("Thanks for Booking");
					System.out.println("Go  to Back" + "\n" + "Click Menu Option");
					m.menu();
					break;
				case 2:
					System.out.println("Sorry ,we have not update this feature now" + "\n");
					pay();
					break;
				default:
					System.out.println("Invalid");

					pay();
					System.out.println("Go to back" + "\n" + "click Menu option");
					m.menu();
				}
			} else {
				System.out.println("Enter Correct Value" + "\n");
				pay();
				m.menu();
			}
		} catch (Exception e) {
			System.out.println("Enter Correct Value" + "\n");
			pay();
			m.menu();
		}
	}

	public static void billIdGenerator() {
		System.out.println("your Bill Id is: ");
		Random rnd = new Random();
		int i = rnd.nextInt(Integer.SIZE - 1) + 1234567890;
		System.out.println(i);
	}
}
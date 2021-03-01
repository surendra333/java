package hotelbooking;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hotels {

	void user() {
		TajHotel taj = new TajHotel();
		SitaraGrand sitara = new SitaraGrand();
		ITCKohenur itc = new ITCKohenur();
		Novotel novotel = new Novotel();
		System.out.println("Welcome ");
		System.out.println("Available Hotels ");
		System.out.println("1)TajHotel" + "\n" + "2.SitaraGrand" + "\n" + "3.ITCKohenur" + "\n" + "4.Novotel");
		Scanner sc = new Scanner(System.in);

		try {
			int option = sc.nextInt();
			if (option > 0 && option <= 4) {
				switch (option) {
				case 1:
					System.out.println("Welcome taj");
					taj.show();
					break;
				case 2:
					System.out.println("Welcome SitaraGrand");
					sitara.display();
					break;
				case 3:
					System.out.println("Welcome  ITCKohenur");
					itc.run();
					break;
				case 4:
					System.out.println("Welcome  Novotel");
					novotel.method();
					break;
				default:
					System.out.println("Enter Correct Value");
					user();
				}
			} else {
				System.out.println("Invalid");
				System.out.println("Enter Correct Value");
				user();
			}

		} catch (Exception e) {
			System.out.println("Invalid");
			System.out.println("Enter Correct Value");
			user();
		}
	}
}

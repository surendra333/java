package hotelbooking;

import java.util.Scanner;

public class Menu {

	void menu() {
		int ch = 0;
		Hotels  hotel= new Hotels();
		Scanner sc = new Scanner(System.in);
		System.out.println("1)MENU " + "\n");
		while (true) {
			try {
				ch = sc.nextInt();
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("invalid");
			}
			switch (ch) {
			case 1:
				hotel.user();
				break;
			default:
				System.out.println("invalid");
			}
		}
	}

}

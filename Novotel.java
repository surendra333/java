package hotelbooking;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import java.util.Scanner;

class Novotel {
	void method() {

		System.out.println("1)Ac rooms" + "\n" + "2)NoN Ac rooms" + "\n");
		Scanner sc = new Scanner(System.in);
		try {
			int option = sc.nextInt();
			if (option > 0 && option < 3) {
				switch (option) {
				case 1:
					Room();
					break;
				case 2:
					room1();
					break;
				default:
					System.out.println("Invalid");
					method();
				}
			} else {
				System.out.println("Enter Correct Value");
				method();
			}
		} catch (Exception e) {
			System.out.println("Enter Correct Values");
			method();
		}
	}

	// acroom

	void Room() {

		Scanner sc = new Scanner(System.in);
		System.out.println("1)Single Bed Room per day:1600.00" + "\n" + "2)Double Bed Room per day:2400.00" + "\n");

		try {
			int option = sc.nextInt();
			if (option > 0 && option < 3) {

				switch (option) {
				case 1:
					bill();
					break;
				case 2:
					bill2();
					break;
				default:
					System.out.println("Invalid");
					Room();
				}
			} else {
				System.out.println("Enter Correct Value");
				Room();
			}
		} catch (Exception e) {
			System.out.println("Enter Correct Value");
			Room();
		}

	}

//nonac
	void room1() {

		Scanner sc = new Scanner(System.in);
		System.out.println("1)Single Bed Room per day:1200.00" + "\n" + "2)Double Bed Room per day:2000.00" + "\n");
		try {
			int option = sc.nextInt();
			if (option > 0 && option < 3) {

				switch (option) {
				case 1:
					bill3();
					break;
				case 2:
					bill4();
					break;
				default:
					System.out.println("Invalid");
					System.out.println("Enter Correct Value");
					room1();
				}
			} else {

				System.out.println("Enter Correct Value");
				room1();
			}
		} catch (Exception e) {
			System.out.println("Enter Correct Value");
			room1();
		}
	}

	// Ac bill
	// single
	void bill() {
		double price;
		Booking book = new Booking();
		Scanner sc = new Scanner(System.in);
		System.out.println("No.of Rooms");
		try {
			int option = sc.nextInt();
			System.out.println("No.of Days");
			int i = sc.nextInt();
			if (i > 0 && i <= 5) {
			if (option > 0 && option <= 5) {
				switch (option) {
				case 1:
					price = 1600.00 * 1;
					System.out.println("Total Bill:" + (price * i));
					book.pay();
					break;
				case 2:
					price = 1600.00 * 2;
					System.out.println("Total Bill:" + (price * i));
					book.pay();
					break;
				case 3:
					price = 1600.00 * 3;
					System.out.println("Total Bill:" + (price * i));
					book.pay();
					break;
				case 4:
					price = 1600.00 * 4;
					System.out.println("Total Bill:" + (price * i));
					book.pay();
					break;
				case 5:
					price = 1600.00 * 5;
					System.out.println("Total Bill:" + (price * i));
					book.pay();
					break;
				default:
					System.out.println("Limit Exceed");
					bill();
				}
			} else {
				System.out.println("Enter Correct Value");
				bill();
			}
			}
		} catch (Exception e) {
			System.out.println("Enter Correct Value");
			bill();
		}
	}

//ac
	// Double

	void bill2() {
		double price;
		Booking book = new Booking();
		Scanner sc = new Scanner(System.in);
		System.out.println("No.of Rooms");
		try {
			int option = sc.nextInt();
			System.out.println("No.of Days");
			int i = sc.nextInt();
			if (i > 0 && i <= 5) {
			if (option > 0 && option <= 5) {
				switch (option) {
				case 1:
					price = 2400.00 * 1;
					System.out.println("Total Bill:" + (price * i));
					book.pay();
					break;
				case 2:
					price = 2400.00 * 2;
					System.out.println("Total Bill:" + (price * i));
					book.pay();
					break;
				case 3:
					price = 2400.00 * 3;
					System.out.println("Total Bill:" + (price * i));
					book.pay();
					break;
				case 4:
					price = 2400.00 * 4;
					System.out.println("Total Bill:" + (price * i));
					book.pay();
					break;
				case 5:
					price = 2400.00 * 5;
					System.out.println("Total Bill:" + (price * i));
					book.pay();
					break;
				default:
					System.out.println("Limit Exceed");
					bill2();
				}
			} else {
				System.out.println("Enter Correct Value");
				bill2();
			}
			}
		} catch (Exception e) {
			System.out.println("Enter Correct Value");
			bill2();
		}

	}

	// bill3non ac
	// single
	void bill3() {
		double price;
		Booking book = new Booking();
		Scanner sc = new Scanner(System.in);
		System.out.println("No.of Rooms");
		try {
			int option = sc.nextInt();
			System.out.println("No.of Days");
			int i = sc.nextInt();
			if (i > 0 && i <= 5) {
			if (option > 0 && option <= 5) {
				switch (option) {
				case 1:
					price = 1200.00 * 1;
					System.out.println("Total Bill:" + (price * i));
					book.pay();
					break;
				case 2:
					price = 1200.00 * 2;
					System.out.println("Total Bill:" + (price * i));
					book.pay();
					break;
				case 3:
					price = 1200.00 * 3;
					System.out.println("Total Bill:" + (price * i));
					book.pay();
					break;
				case 4:
					price = 1200.00 * 4;
					System.out.println("Total Bill:" + (price * i));
					book.pay();
					break;
				case 5:
					price = 1200.00 * 5;
					System.out.println("Total Bill:" + (price * i));
					book.pay();
					break;
				default:
					System.out.println("Limit Exceed");
					bill3();
				}
			} else {
				System.out.println("Enter Correct Value");
				bill3();
			}
			}
		} catch (Exception e) {
			System.out.println("Enter Correct Value");
			bill3();
		}
	}

	// non ac

	// double

	void bill4() {
		double price;
		Booking book = new Booking();
		Scanner sc = new Scanner(System.in);
		System.out.println("No.of Rooms");
		try {
			int option = sc.nextInt();
			System.out.println("No.of Days");
			int i = sc.nextInt();
			if (i > 0 && i <= 5) {
			if (option > 0 && option <= 5) {
				switch (option) {
				case 1:
					price = 2000.00 * 1;
					System.out.println("Total Bill:" + (price * i));
					book.pay();
					break;
				case 2:
					price = 2000.00 * 2;
					System.out.println("Total Bill:" + (price * i));
					book.pay();
					break;
				case 3:
					price = 2000.00 * 3;
					System.out.println("Total Bill:" + (price * i));
					book.pay();
					break;
				case 4:
					price = 2000.00 * 4;
					System.out.println("Total Bill:" + (price * i));
					book.pay();
					break;
				case 5:
					price = 2000.00 * 5;
					System.out.println("Total Bill:" + (price * i));
					book.pay();
					break;
				default:
					System.out.println("Limit Exceed");
					bill4();
				}
			} else {
				System.out.println("Enter Correct Value");
				bill4();
			}
			}
		} catch (Exception e) {
			System.out.println("Enter Correct Value");
			bill4();
		}
	}

}

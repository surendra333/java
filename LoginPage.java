package hotelbooking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginPage {
	String UserName;
	String PassWord;

	public void show() {
		Hotels hotel= new Hotels();
		Scanner sc = new Scanner(System.in);
		System.out.println("Minimum 6 Characters");
		System.out.println("Enter UserName: ");
		String name = sc.next();
		System.out.println("Maximum 8 characters");
		System.out.println("Enter Password: ");
		String pass = sc.next();
		if (Pattern.matches("[a-zA-Z0-9]{6,15}", name) && Pattern.matches("[a-zA-Z0-9]{8,16}", pass)) {

			hotel.user();
		} else {
			System.out.println("Please Follow The Pattern");
			show();
		}

	}

}

package MyFirstProject;

import java.util.ArrayList;

public class student {
	static String name;
	static String pass;
	static int count = 0;

	public student(String name, String pass) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.pass =pass ;
	}

	public static void main(String[] args) {
		ArrayList<student> list = new ArrayList<student>();
		student std1 = new student("surendra", "suri12");
		student std2 = new student("suri", "suri12");
		list.add(std1);
		list.add(std2);
		for (student s : list) {
			if (s.name.equalsIgnoreCase("suri") && s.pass.equalsIgnoreCase("suri12")) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("ok");
		}
	}

}

package MyFirstProject;

public class student {
  String name;
  int rollno;
  int age;
  void info() {
	  System.out.println("name: "+name);
	  System.out.println("rollno: "+rollno);
	  System.out.println("age: "+age);
  }
	public static void main(String[] args) {
		student std=new student();
		std.name="surendra";
		std.rollno=134;
		std.age=24;
		std.info();
	}
	}
package MyFirstProject;
class car{
	void show() {System.out.println("single color");}
}
public class audi extends car {
	void show(){System.out.println("multiple colors");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c= new Benz();
       c.show();
	}

}

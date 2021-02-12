package MyFirstProject;

public class one {
static {
	System.out.println("welcome to static block");
	System.out.println("this is static block");
}
one(){
	System.out.println("this is initializer block");
}
	public static void main(String[] args) {
		new one();
		System.out.println("this is main method");
	}
}
class two {
	static {
	System.out.println("this is static block 2 ");
}
	two(){
		System.out.println("welcome");
	}
}
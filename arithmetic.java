package MyFirstProject;
public class arithmetic {
	static int i;
	static int a=10;
	static int b=20;
    public static void main(String[] args) {
		i=a+b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		System.out.println("arithmetic: "+i);
		i=a-b;
		System.out.println("substraction: "+i);
		i=a*b;
		System.out.println("multiplication: "+i);
		i=a/b;
		System.out.println("division: "+i);
		i=a%b;
		System.out.println("remainder: "+i);
		i=++a;
		System.out.println("increment: "+i);
		i=--a;
		System.out.println("decrement: "+i);
    }
}

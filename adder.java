package MyFirstProject;

public class adder {
    static int add(int a, int b){
    	 return a+b;
     }
    static int add(int a,int b,int c) {
    	return a+b+c;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(adder.add(1,2));
         System.out.println(adder.add(12, 1, 13));
	}

}

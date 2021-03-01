package MyFirstProject;

public class bike {
	String name;
	int   regno;
	int   price;
	double mileage;
	static String company="HONDA";
	bike(int r,String n,int p){
		name=n;
		regno=r;
		price=p;
	}
	bike(int r,String n,int p,double  db){
		name=n;
		regno=r;
		price=p;
		mileage=db;
		System.out.println("company: "+company);
		System.out.println("regno: "+regno);
		System.out.println("name: "+name);
		System.out.println("price: "+price);
		System.out.println("mileage: "+mileage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	bike b1=new bike(123,"honda",100000,50.3);
	
	bike b2=new bike(132,"rr",120000,60.3);
	}

}
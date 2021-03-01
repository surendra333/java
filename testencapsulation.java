package MyFirstProject;

public class testencapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee e=new Employee();
         e.setname("surendra");
         e.setid(333);
         e.setsalary(10000);
         System.out.println("Employee name: "+e.getname());
         System.out.println("Employee id: "+e.getid());
         System.out.println("Employee salary: "+e.getsalary());
	}
}

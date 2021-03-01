package MyFirstProject;

public class garbage {
     public void finalize(){System.out.println("garbge collected");
     
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          garbage s1=new garbage();
          garbage s2=new garbage();
          s1=null;
          s2=null;
          System.gc();
	}

}

package MyFirstProject;

public class commanline {

	public static void main(String[] args) {
		// TODO Aut

//{ 
    //public static void main(String[] args) 
   // { 
        int x[] = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50}; 

        for (int i = 0; i<x.length; i++) 
        { 
            if (x[i] >= 40) 
            { 
                System.out.println("Program is Terminated..."); 
                System.exit(0); 
            } 
            else
                System.out.println("x["+i+"] = " + x[i]); 
        } 

	}

}

package com.techouts.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class printstream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
		FileOutputStream fout=new FileOutputStream("E:\\demo.txt");
		PrintStream pout=new PrintStream(fout);
		pout.println("welcome");
		pout.println(2016);
		pout.print(2018);
		pout.close();
		System.out.println("success");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
	}

}

package com.techouts.bean;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Dataoutputstream1 {

	public static void main(String[] args) {
		
	// TODO Auto-generated method stub
    
	try {
		 FileOutputStream fout = new FileOutputStream( "E:/demo.txt");
		  DataOutputStream data=new  DataOutputStream(fout);
		     data.write(40);
		     data.close();
		     System.out.println("success");
		     
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
     
	}

}

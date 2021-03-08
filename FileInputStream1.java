package com.techouts.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
       FileInputStream fin=new FileInputStream("E:\\demo.txt");
      
	
	int	i = fin.read();
	fin.read();
	
		  System.out.println((char)i);
		  fin.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e);
     
	}
	}
}
	
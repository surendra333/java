package com.techouts.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereader1 {

	public static void main(String[] args) throws IOException {
		
     try {
		FileReader fr=new FileReader("‪E:\\demo.txt");
		int i=0;
		while((i=fr.read())!=-1) {
		//fr.read();
		System.out.println((char)i);
		}
		fr.close();
		
	} catch (FileNotFoundException e) {
        System.out.println(e);
	} 
    	 
    
	}

	
	}

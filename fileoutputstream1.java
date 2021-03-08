package com.techouts.bean;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileoutputstream1 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		     try {
				FileOutputStream fout= new FileOutputStream("E:\\testout.txt");
				fout.write(20);
				fout.close();
				System.out.println("success");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
			System.out.println(e);
			
			}
		     
			}

		}
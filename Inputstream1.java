package com.techouts.bean;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Inputstream1 {

	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream fout=new FileOutputStream("E:\\testout.txt");
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			String s="welcome";
			byte b[]=s.getBytes();
			bout.write(b);
			bout.flush();
			bout.close();
			System.out.println("success");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
			}
}


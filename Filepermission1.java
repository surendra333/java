package com.techouts.bean;

import java.io.FilePermission;
import java.security.Permission;
import java.security.PermissionCollection;

public class Filepermission1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="E:\\demo.txt";
       FilePermission file1=new FilePermission(str,"read");
       PermissionCollection permission=file1.newPermissionCollection();
       permission.add(file1);
       FilePermission file2=new FilePermission( str,"write");
       permission.add(file2);
       if(permission.implies(new FilePermission(str,"read,write"))) {
    	   System.out.println("read,write"+str);
       }else {
    	   System.out.println("no read,write"+str);
       }
       
	}

}

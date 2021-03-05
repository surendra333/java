package com.techouts.bean;

public class Thread1 {  
		 public void run(){  
		  for(int i=1;i<5;i++){  
		    try{
		    	Thread.sleep(500);
		    }catch(InterruptedException e){System.out.println(e);}  
		    System.out.println(i);  
		  }  
		 }  
		 public static void main(String args[]){  
	      Thread1 t1=new Thread1();  
		  Thread1 t2=new Thread1();  
		   
		  t1.run();   
		  t2.run();  
		 }  
		}  


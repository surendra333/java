package com.techouts.java;

     interface add1 {
    public String add(String name);
        
   public static void main(String[] args) {
	   add1 s=(name)->{
	   return name ;
   };
	   System.out.println(s.add("hi"));
   }
}
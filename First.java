package com.test.arrayList;

import java.util.ArrayList;

public class First {
	
	public static void main(String args[]){
		ArrayList<String> abc = new ArrayList<String>();
		
		abc.add("A");
		abc.add("B");
		abc.add("C");
		abc.add("D");
		
		System.out.println("Here"+ abc);
		System.out.println("Here"+ abc);
		
		abc.add(0, "AA");
		
		System.out.println("Here2"+ abc);
		
		abc.remove(0);
		
		System.out.println("Here3"+ abc);
		
		abc.remove("C");
		
		System.out.println("Here4"+ abc);
		
		boolean a = abc.contains("A");
		
		System.out.println("Here5"+ a);
	}
	
}

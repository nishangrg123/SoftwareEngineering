package com.example.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StringLength {
	
	public static void main(String args[]) {
		ArrayList<String> str = new ArrayList<String>();
		str.add("Sam");
		str.add("harry");
		str.add("thompson johnson");
		
		//find the max string in an array
		String max = Collections.max(str,Comparator.comparing(s -> s.length()));
		System.out.println("Maximum string is " +max);
		
		//find the max string length
		int maxsize = max.length();
		System.out.println("Max length of " +max+ " is " +maxsize );
		
		//find the min string in an array
		String min = Collections.min(str, Comparator.comparing(s -> s.length()));
		System.out.println("Minimum string is " +min);
		
		//find the length of min string 
		int minsize = min.length();
		System.out.println("Min length of " +min+ " is " +minsize );
	
		
		
		//calling the static method from class "ReverseString"
		System.out.println("The reverse of the string is " +ReverseString.reverseStr());
	
		
		
	}//end of main

}//end of StringLength

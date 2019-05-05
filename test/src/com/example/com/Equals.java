package com.example.com;

public class Equals extends Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "java";
		String str2 = "world";
		int a = str1.length();
		int b = str2.length();
		int c = a + b;
		System.out.println(c);
		int compare = str1.compareTo(str2);
        if(compare < 0){
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
        String str3 = str1.substring(2, str1.length()).toUpperCase();
        String str4 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
        System.out.println(str3+ " "+str4);
		
	}

}

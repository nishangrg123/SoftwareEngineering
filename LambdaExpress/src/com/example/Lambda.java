package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lambda {

	
	static void countDuplicates(String str) {
         
        // first let us split string into words
        String[] words = str.split(" ");
         
        // adds all words into a map
        // we also check whether the word is already in map!
        Map<String,Integer> wordMap = new HashMap<String,Integer>();               
        for(int i=0;i<words.length;i++) {
            String word = words[i].toUpperCase(); // for case insensitive comparison
            System.out.println(word);
            if(wordMap.get(word)!=null) {
                // we found a duplicated word!
            	wordMap.put(word,wordMap.get(word)+1);
            	
            }else {
                wordMap.put(word, 1);
            }
        }
        
        System.out.println("This is the final value");
        for (@SuppressWarnings("rawtypes") Map.Entry entry : wordMap.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        }
		
	}
	public static void main(String[] args) {
        System.out.print("Enter string to analyse:");
        Scanner sn = new Scanner(System.in);
        String input = sn.nextLine();
        countDuplicates(input);
	}//end of main
}//end of interface 

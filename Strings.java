package com.bptn.course._05_strings;

public class Strings {

	public static void main(String[] args) {
		//to create a new string
		String s = "Hello World";
		
		String reverse = " ";
		
		//find the total length of the string and store it inside a variable
		int stringLength = s.length();
		
		System.out.println("The lenght of the string is: "+ stringLength);
		
		//substring() method - to get part of the String
		
		String sub = s.substring(1);
		
		System.out.println("The substring is : "+ sub);
		
		String sub1 = s.substring(0, 8);
		
		System.out.println("The substring is : "+ sub1);
		
		//to lowercase
		String lowCase = s.toLowerCase();
		
		System.out.println("The lowercase string is : "+ lowCase);
		
		String upCase = s.toUpperCase();
		
		System.out.println("The uppercase string is : "+ upCase);
		
		int index = s.indexOf("World");
		System.out.println("The index string is : "+ index);
		
		
		//Find Character
		char C = s.charAt(5);
		System.out.println("The character of string is : "+ C);
		
		for(int i= s.length()-1; i>=0; i--) {
			
			reverse += s.charAt(i);
			System.out.println(reverse);
		}
		System.out.println(reverse);

	}

}

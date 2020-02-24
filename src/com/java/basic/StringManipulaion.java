package com.java.basic;

import java.util.HashSet;
import java.util.Set;

public class StringManipulaion {

	public static void main(String[] args) {

		System.out.println("To check if one string cnatons another string or not by using indexOf() method");
		String input="Java is the best programmeing language";
		boolean isPresent=input.indexOf("Java")!=-1?true:false;
		
		if(isPresent) {
			System.out.println("input string: "+input);
			System.out.println("search string: "+"Java");
			System.out.println("does string contains?"+"Yes");
		}
		
		System.out.println("To check if one string cnatons another string or not by using contains() method");
		boolean itsPresent=input.contains("Java");
		if(itsPresent) {
			System.out.println("input string: "+input);
			System.out.println("search string: "+"Java");
			System.out.println("does string contains?"+"Yes");
		}
		System.out.println("**********************************************************");
		System.out.println("Moving all special charchter to end");
		String name="nay*@^eem wa&$s h%@#ere y%estard$@a&y";
		String regx="[a-zA-Z0-9\\s+ ]";
		String res1="";
		String res2="";
		int len=name.length();
		for (int i = 0; i <len; i++) {
			char c=name.charAt(i);
			if(String.valueOf(c).matches(regx)) {
				res1=res1+c;
			}
			else {
				res2=res2+c;
			}
			
		}
		System.out.println(res1+res2);
		
		
		System.out.println("**********************************************************");
		System.out.println("Reverse String");
	String namerev="This string is reversed NAYEEM";
	String rev="";
	int len1=namerev.length();
	for(int i=len1-1;i>=0;i--) {
		rev=rev+namerev.charAt(i);
	}
	System.out.println("The reversed String is "+rev);
	System.out.println("reverse string second method");
	StringBuffer sf=new StringBuffer(namerev);
	System.out.println(sf.reverse());
	
	System.out.println("**********************************************************");
	System.out.println("converting to Upper case character String");
	String upperString="sarfaraz ahmed";
	
	char[] c=upperString.toCharArray();
	for (int i = 0; i < c.length; i++) {
		if(i%2==0) {
			char m=Character.toLowerCase(c[i]);
			System.out.print(m);
		}else {
			char n=Character.toUpperCase(c[i]);
			System.out.print(n);
		}
		
		
	}
	System.out.println("**********************************************************");
	System.out.println("Dublicate String ");
	String[] arString= {"java","python","ruby","java","python","c#"};
	for (String string : arString) {
		System.out.print(" "+ string);
	}
	System.out.println();
	int lenarr=arString.length;

	for (int i = 0; i < lenarr; i++) {
		for (int j = i+1; j <lenarr; j++) {
			if(arString[i].equals(arString[j])) {
				System.out.println("Dublicates "+arString[i]);
			}
		}
		
	}
	
	System.out.println("Second Method ");
	Set<String> store=new HashSet<>();
	for(String names:arString) {
		if(store.add(names)==false) {
			System.out.println("dublicates are "+names);
		}
	}
	
	
	
	}

}

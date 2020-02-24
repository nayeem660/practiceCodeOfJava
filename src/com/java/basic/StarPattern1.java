package com.java.basic;

public class StarPattern1 {

	
	public static void main(String[] args) {
		System.out.println("First Star pattern");
		/*
		1*****
		12****
		123***
		1234**
		12345*
		123456
		*/
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=6;k>i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Second Star pattern");
//		Second Star pattern
//		*
//		**
//		***
//		****

		for (int a = 1; a <=4; a++) {
			for (int b = 1; b <=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Third Star pattern");
//		Third Star pattern
//		****
//		***
//		**
//		*
		for (int i = 1; i <=4; i++) {
			for (int j = 4; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Fourth pattern");
//		Fourth pattern
//		*
//		**
//		***
//		****
//		***
//		**
//		*
		for (int a = 1; a <=4; a++) {
			for (int b = 1; b <=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <=4; i++) {
			for (int j =3 ; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Fifth pattern");
//		Fifth pattern
//	    *
//	   **
//	  ***
//	 ****
		for (int i =1 ; i <=4; i++) {
			for (int j = 4; j>=i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Sixth pattern");
//		Sixth pattern
//		****
//		 ***
//		  **
//		   *
		for (int i = 1; i <=4; i++) {
			for (int j = 2; j <=i; j++) {
				System.out.print(" ");
			}
			for (int k = 4; k >=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Seventh patter");
		
		for (int i = 1; i <=4; i++) {
			for (int j = 3; j>=i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(" ");
			}
			for (int k =3; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Eighth pattern");
//		Eighth pattern
//	     *
//	    * *
//	   * * *
//	  * * * *
//	Second method for above program
//	    *
//	   ***
//	  *****
//	 *******
		for (int i = 1; i <=4; i++) {
			for (int j = 4; j >=i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print(" *");
			}
			System.out.println();
			
		}
		System.out.println("Second method for above program");
		for (int i = 1; i <=4; i++) {
			for (int j = 4; j >=i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print("*");
			}
			for (int l = 2; l <=i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Third method for above pattern");
		for (int i = 1; i <=4; i++) {
			for (int j = 4; j >=i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <(i*2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Ninth patteren");
//		Ninth patteren
//		 *******
//		  *****
//		   ***
//		    *
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(" ");
			}
			for (int k = 4; k>=i; k--) {
				System.out.print("*");
			}
			for (int l = 3; l >=i; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Second method");
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(" ");
			}
			for (int k = 9; k >(i*2); k--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		System.out.println("Third method for above ");
		for (int i = 5; i>=1; i--) {
			for (int j = 5; j >i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < (i*2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Tenth patteren");
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=i; j++) {
				if(i>=2 && j<=i-1) {
				System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
//		for (int i = 1; i <=4; i++) {
//			for (int j = 4; j>=i; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < args.length; k++) {
//				
//			}
//		}
		
	}
}

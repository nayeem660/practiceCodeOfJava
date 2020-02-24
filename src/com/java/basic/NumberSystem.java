package com.java.basic;

public class NumberSystem {
	
	public void fibonacci() {
		System.out.println("fibonacci series");
		int k,a,b;
		k=0;a=1;b=1;
		System.out.print("1 1");
		int n=50;
		while(k<=n) {
			k=a+b;
			System.out.print(" "+k);
			a=b;
			b=k;
		}
	
	}
	
	public void palinDrom() {

		System.out.println("Checking PALIMDROM");
		int r,sum=0,temp;
		int n1=121;
		temp=n1;
		while(n1>0) {
			r=n1%10;
			sum=sum*10+r;
			n1=n1/10;
		
		}
		if(temp==sum) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrom");
		}
		
	}
	
	public void factorialNumb() {
		System.out.println("Printing palindrom of the number");
		int n2=5;
		int fact=1;
		for(int i=1;i<=n2;i++) {
			fact=fact*i;
		}
		System.out.println(fact+" factorial of " +n2);
	
	}
		
	
	public static void main(String[] args) {
		NumberSystem ns=new NumberSystem();
		ns.factorialNumb();
		ns.fibonacci();
		ns.palinDrom();

		
	}
}

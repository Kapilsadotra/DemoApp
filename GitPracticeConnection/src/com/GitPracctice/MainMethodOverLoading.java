package com.GitPracctice;

public class MainMethodOverLoading {

	
	public static void main(String[] args) {
		System.out.println("Actual main method");
		
		main(10.0);
		main("kapil");
		main(10);
		
	}
	public static void main(int args) {
		System.out.println("Int method");
		
	}
	public static void main(double args) {
		System.out.println("double method");
		
	}
	public static void main(String args) {
		System.out.println("string method");
	}
}

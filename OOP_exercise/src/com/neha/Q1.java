package com.neha;

public class Q1 {
	Q1(){
		System.out.println("Q1()");
	}
	Q1(int i){
		System.out.println("Q1(int)");
	}
	public static void main(String[] args) {
		Q1 b1=new Q1();
		System.out.println("");
		Q1 c1=new Q1(10);
		System.out.println("    ");
	}
	}



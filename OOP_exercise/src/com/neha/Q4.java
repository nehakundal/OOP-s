package com.neha;

public class Q4 {
	void test() {
		System.out.println("Hi I am test");
	}
	public static void main(String[] args) {
		Q4 b1=new Q4();
		System.out.println("hello ");
		b1.test();
	}
	static {
		System.out.println("I am instance block");
	}
	{
		System.out.println("I am also instance");
	}

}

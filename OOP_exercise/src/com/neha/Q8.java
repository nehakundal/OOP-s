package com.neha;
//method overriding method name same parameter must be same
class grandparents{
	void print () {
		System.out.println("python");
		}
}
class parents extends grandparents{
	void print() {
		System.out.println("PHP");
	}
	
	}
class child extends parents{
	void print() {
		System.out.println("Java");
	}
}

public class Q8 {
	public static void main(String[] args) {
		child c=new child();
		c.print();
		}
	}

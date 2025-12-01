package com.neha;
class animal{
	void m1() {
		System.out.println("m1 method inside the class animal");
	}
}
class COW extends animal{
	void m1() {
		System.out.println("m2 method inside the class cow");
	}
}

public class Is_relationship {
	public static void main(String[] args) {
		animal C1 =  new COW();
		C1.m1();
	}

}

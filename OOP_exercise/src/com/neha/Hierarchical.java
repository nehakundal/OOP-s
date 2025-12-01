package com.neha;
class E{
	void m1() {
		System.out.println("m1 method inside the class A");
	}
}
class F extends E{
	void m2() {
		System.out.println("m2 method inside the class B");
	}
}
class G extends F{
	void m3() {
		System.out.println("m3 method inside the class A");
	}
}

public class Hierarchical {
	public static void main(String[] args) {
		F b1=new F();
		G c1= new G();
		b1.m2();
		c1.m3();
	}

}

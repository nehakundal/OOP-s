package com.neha;

public class Q6 {
	int i;
	static Q6 test() {
		Q6 t1= new Q6();
		return t1;
	}
	public static void main(String[] args) {
		Q6 obj =test();
		System.out.println(obj.i);
	}

}

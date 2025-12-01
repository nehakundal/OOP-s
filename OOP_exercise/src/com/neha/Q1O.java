package com.neha;

public class Q1O {
 
 

	interface One
	{
		int i=222;
	}
	
	
	interface onetwo
	{
		
		int i=One.i+One.i;
	}
	interface onetwothree
	{
		int i=onetwo.i+onetwo.i;
	}

}

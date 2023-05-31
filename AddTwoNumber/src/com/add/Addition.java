package com.add;

public class Addition {

	public String greeting()
	{	
		String x ="hello sir how are team leader "
		System.out.println(x);
		return x ;
	}
	
	public static void main(String[] args) {
		
	
	int num1=30;
	int num2=8;
	int result;
	result = num1*num2;
	System.out.println("Multiplication of two number is :"+result);


	Addition g = new Addition();
	g.greeting();

	}

}

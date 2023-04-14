package org.opentutorials.javatutorials.generic;


public class Main {

	public static void main(String[] args) {
		/* MyClass
		MyClass<Integer,Double> obj = new MyClass<>(10,20.0);
		obj.showType();
		*/
		
		/*
		NumericFns<Integer> iob = new NumericFns<>(4);
		System.out.println(iob.square());
		*/ 
		
		NumericFns<Integer> iOb = new NumericFns<Integer>(6);
		NumericFns<Double> dOb = new NumericFns<Double>(-6.0);
		
		System.out.println(iOb.absEqual(dOb));
	}

}

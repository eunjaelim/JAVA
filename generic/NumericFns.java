package org.opentutorials.javatutorials.generic;

public class NumericFns<T extends Number> {
	T num;
	NumericFns(T ob){
		this.num = ob;
	}
	/*
	double square() {
		return ob.intValue()*ob.doubleValue();
	}
	*/
	
	boolean absEqual(NumericFns<?> ob) {
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true;
		return false;
	}
}

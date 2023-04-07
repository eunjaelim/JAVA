package org.opentutorials.javatutorials.generic;

public class Printer <T,V>{
	T thingToPrint;
	V otherThing;
	
	public Printer(T thingToPrint) {
			this.thingToPrint = thingToPrint;
		}
	
	public void print() {
		System.out.println(thingToPrint);
	}
	}

package com.org.oopconcept.question4;

public abstract class Parrot {
	
	public abstract String parrotSays();
	
	public String getMessgae(String name) {
		return "A parrot living with "+name+" Says "+this.parrotSays();
	}

}

package com.org.oopconcept.swimminganimals;

import com.org.inter.oopconcept.FishInterface;

/**
 * 
 * @author Ramesh
 *
 */
public class Fish implements FishInterface {

	public String sing() {
		return "Fishes don’t sing";
	}

	public String walk() {
		return "Fishes don’t walk";
	}

	public String swim() {
		return "Fishes can swim";
	}

}

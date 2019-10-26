package com.org.oopconcept.swimminganimals;

import com.org.oopconcept.FishInterface;

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

	@Override
	public String getFishBodyType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFishActivities() {
		// TODO Auto-generated method stub
		return null;
	}

}

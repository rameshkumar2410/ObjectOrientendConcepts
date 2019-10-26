package com.org.oopconcept.swimminganimals;

import com.org.inter.oopconcept.FishInterface;

/**
 * 
 * @author Ramesh
 *
 */
public class ClownFish implements FishInterface {
	
	public String getFishBodyType() {
		return "Clownfish are small and colourful";
	}

	public String getFishActivities() {
		return "Clownfish make jokes";
	}

	@Override
	public String sing() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String walk() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String swim() {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.org.oopconcept;

import com.org.inter.oopconcept.BirdActivities;

/**
 * 
 * @author Ramesh
 *
 */
public class Bird extends Animal implements BirdActivities {

	public String fly() {
		return "I am flying";
	}

	@Override
	public String sing() {
		return "I am singing";
	}

}

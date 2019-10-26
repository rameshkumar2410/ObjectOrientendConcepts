package com.org.oopconcept.question3;

import com.org.inter.oopconcept.Chicken;

/**
 * 
 * @author Ramesh
 *
 */
public class Rooster implements Chicken {
	@Override
	public String getSound() {
		return "Cock-a-doodle-doo";
	}

	public String relation() {
		return "I am a male from the Chicken family";
	}

}

package com.org.oopconcept.swimminganimals;

/**
 * 
 * @author Ramesh
 *
 */
public class SpecializeFishSolution {

	public static void main(String arg[]) {
		String shark = SpecializeFish.fishType("Large", "Grey");
		System.out.println(shark);
		String clown = SpecializeFish.fishType("Small", "Orange");
		System.out.println(clown);
	}

}

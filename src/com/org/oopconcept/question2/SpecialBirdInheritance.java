package com.org.oopconcept.question2;


/**
 * 
 * @author Ramesh
 *
 */
public class SpecialBirdInheritance {

	public static void main(String arg[]) {
		SpecialBird bird=new Duck();
		bird.getSound();
		bird.activity();
		System.out.println(""+bird.activity()+"   "+bird.getSound());
		bird=new Chicken();
		bird.getSound();
		bird.activity();
		System.out.println(""+bird.activity()+"   "+bird.getSound());
	}
	
}

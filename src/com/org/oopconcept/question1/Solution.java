package com.org.oopconcept.question1;

/**
 * 
 * @author Ramesh
 *
 */
public class Solution {

	public static void main(String arg[]) {
		Bird bird = new Bird();
		bird.fly();
		bird.walk();
		bird.sing();
		System.out.println("  "+bird.fly()+"   "+bird.walk()+"   "+bird.sing());
		
	}
}

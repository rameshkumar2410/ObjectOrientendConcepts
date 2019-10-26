package com.org.oopconcept.question1.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.org.oopconcept.question1.Bird;
/**
 * 
 * @author Ramesh
 *
 */
public class BirdActivityTest{
	
	@Test
	void birdTest() {
		Bird bird=new Bird();
		assertEquals("I am flying", bird.fly());
		assertEquals("I am walking", bird.walk());
		assertEquals("I am singing", bird.sing());
	}

}

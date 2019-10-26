package com.org.oopconcept.question2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.org.oopconcept.question2.Chicken;
import com.org.oopconcept.question2.Duck;
import com.org.oopconcept.question2.SpecialBird;
/**
 * 
 * @author Ramesh
 *
 */
public class SpecialBirdTest {
	
	@Test
	public void chickenSoundTest() {
		SpecialBird sp=new Chicken();
		assertEquals("Cluck, cluck", sp.getSound());
		assertEquals("Chicken cannot fly", sp.activity());
	}
	
	@Test
	public void duckSoundTest() {
		SpecialBird sp=new Duck();
		assertEquals("Quack, quack", sp.getSound());
		assertEquals("Duck can Swim", sp.activity());
	}


}

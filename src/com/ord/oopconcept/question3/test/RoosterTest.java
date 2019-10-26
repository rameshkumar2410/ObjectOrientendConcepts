package com.ord.oopconcept.question3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ord.oopconcept.question3.Rooster;

public class RoosterTest {
	
	@Test
	public void roosterTest() {
		Rooster rooster= new Rooster();
		System.out.println(rooster.relation()+"  "+rooster.getSound() );
		assertEquals("Cock-a-doodle-doo", rooster.getSound());
		
	}

}

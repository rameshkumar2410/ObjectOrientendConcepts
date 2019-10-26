package com.org.inter.oopconcept.animalbehaviour.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.org.inter.oopconcept.FlyingInsect;
import com.org.inter.oopconcept.animalbehaviour.Butterfly;
import com.org.inter.oopconcept.animalbehaviour.Caterpillar;

/**
 * 
 * @author Ramesh
 *
 */
public class CaterpillarToButterflyTest {

	@Test
	public void metamorphosisTest() {
		Caterpillar caterpillar = new Caterpillar();
		System.out.println(caterpillar.fly());
		System.out.println(caterpillar.walk());
		caterpillar.transformToButterfly();

		assertNotNull(caterpillar.fly());
		assertEquals("A caterpillar cannot fly", caterpillar.fly());
		assertNotNull(caterpillar.walk());
		assertEquals("A caterpillar can crawl", caterpillar.walk());

		FlyingInsect flyingInsect = new Butterfly();

		assertNotNull(caterpillar.fly());
		assertEquals("A butterfly can fly", flyingInsect.fly());
		assertNotNull(caterpillar.walk());
		assertEquals("A butterfly does not make a sound", flyingInsect.sound());

	}

}

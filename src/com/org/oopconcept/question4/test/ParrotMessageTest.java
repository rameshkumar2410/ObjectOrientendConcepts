package com.org.oopconcept.question4.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.org.oopconcept.question4.Cat;
import com.org.oopconcept.question4.Dog;
import com.org.oopconcept.question4.Parrot;
import com.org.oopconcept.question4.Rooster;

public class ParrotMessageTest {
	
	@Test
	public void parrotSoundTest() {
		Parrot parrot=new Dog();
		assertEquals("A parrot living with Dog Says Woof woof", parrot.getMessgae("Dog"));
		parrot=new Cat();
		assertEquals("A parrot living with Cat Says Meow", parrot.getMessgae("Cat"));
		parrot=new Rooster();
		assertEquals("A parrot living with Rooster Says Cock-a-doodle-doo", parrot.getMessgae("Rooster"));
	}

}

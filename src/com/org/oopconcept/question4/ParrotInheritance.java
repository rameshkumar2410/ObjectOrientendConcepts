package com.org.oopconcept.question4;

public class ParrotInheritance {
	
	public static void main(String arg[]) {
		Parrot parrot=new Dog();
		System.out.println(parrot.getMessgae("Dog"));
		parrot=new Cat();
		System.out.println(parrot.getMessgae("Cat"));
		parrot=new Rooster();
		System.out.println(parrot.getMessgae("Rooster"));
	}
	
}

package com.org.oopconcept.countinganimal;

public class CountingAnimal extends Animal {

	private static int fly = 0;
	private int walk = 0;
	private static int sing = 0;
	private int swim = 0;
	Animal animal = new Animal();

	public void getCountofAnimalActivities() {

		if (animal.getBird().fly().equals("I am flying") || getDuck().activity().equals("I am flying")
				|| getChicken().activity().equals("I am flying") || getButt().fly().equals("I am flying")) {
			fly++;
		}

		if (getBird().sing().equals("I am singing") || getDuck().getSound().equals("I am singing")
				|| getChicken().getSound().equals("I am singing") || getRooster().getSound().equals("I am singing")
				|| getFish().sing().equals("I am singing") || getShark().sing().equals("I am singing")
				|| getClown().sing().equals("I am singing") || getDol().sing().equals("I am singing")
				|| getDog().parrotSays().equals("I am singing") || getButt().sound().equals("I am singing")) {
			sing++;
		}

	}

	public static void main(String arg[]) {

		CountingAnimal animal = new CountingAnimal();
		animal.getCountofAnimalActivities();
		System.out.println(fly);
		System.out.println(sing);

	}

}

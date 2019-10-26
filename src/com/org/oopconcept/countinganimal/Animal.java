package com.org.oopconcept.countinganimal;

import com.org.oopconcept.animalbehaviour.Butterfly;
import com.org.oopconcept.question1.Bird;
import com.org.oopconcept.question2.Chicken;
import com.org.oopconcept.question2.Duck;
import com.org.oopconcept.question3.Rooster;
import com.org.oopconcept.question4.Cat;
import com.org.oopconcept.question4.Dog;
import com.org.oopconcept.question4.Parrot;
import com.org.oopconcept.swimminganimals.ClownFish;
import com.org.oopconcept.swimminganimals.Dolphin;
import com.org.oopconcept.swimminganimals.Fish;
import com.org.oopconcept.swimminganimals.Shark;

public class Animal {
	public Bird bird;
	public Duck duck;
	public Chicken chicken;
	public Rooster rooster;
	public Parrot parrot;
	public Fish fish;
	public Shark shark;
	public ClownFish clown;
	public Dolphin dol;
	public Dog dog;
	public Butterfly butt;
	public Cat cat;

	public Bird getBird() {
		return bird=new Bird();
	}

	public Duck getDuck() {
		return duck=new Duck();
	}

	public Chicken getChicken() {
		return chicken=new Chicken();
	}

	public Rooster getRooster() {
		return rooster=new Rooster();
	}

	public Fish getFish() {
		return fish=new Fish();
	}

	public Shark getShark() {
		return shark=new Shark();
	}

	public ClownFish getClown() {
		return clown=new ClownFish();
	}

	public Dolphin getDol() {
		return dol=new Dolphin();
	}

	public Dog getDog() {
		return dog=new Dog();
	}

	public Butterfly getButt() {
		return butt=new Butterfly();
	}

	public Cat getCat() {
		return cat=new Cat();
	}

	public void setBird(Bird bird) {
		this.bird = bird;
	}

	public void setDuck(Duck duck) {
		this.duck = duck;
	}

	public void setChicken(Chicken chicken) {
		this.chicken = chicken;
	}

	public void setRooster(Rooster rooster) {
		this.rooster = rooster;
	}

	public void setParrot(Parrot parrot) {
		this.parrot = parrot;
	}

	public void setFish(Fish fish) {
		this.fish = fish;
	}

	public void setShark(Shark shark) {
		this.shark = shark;
	}

	public void setClown(ClownFish clown) {
		this.clown = clown;
	}

	public void setDol(Dolphin dol) {
		this.dol = dol;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public void setButt(Butterfly butt) {
		this.butt = butt;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}
	
	

}

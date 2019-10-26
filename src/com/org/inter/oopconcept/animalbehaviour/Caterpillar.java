package com.org.inter.oopconcept.animalbehaviour;

import com.org.inter.oopconcept.CrawlingInsect;
import com.org.inter.oopconcept.FlyingInsect;

public class Caterpillar implements CrawlingInsect {
	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "A caterpillar cannot fly";
	}

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String walk() {
		// TODO Auto-generated method stub
		return "A caterpillar can crawl";
	}
	
	public void transformToButterfly() {
		FlyingInsect flyingInsect=new Butterfly();
		System.out.println(flyingInsect.fly());
		System.out.println(flyingInsect.sound());
	}
}

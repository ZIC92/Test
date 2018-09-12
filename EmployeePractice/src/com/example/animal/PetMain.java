package com.example.animal;

public class PetMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal a;
		Spider s = new Spider();
		s.eat();
		s.walk();
		a = new Spider();
		a.eat();
		a.walk();

		pet p;
		Cat c = new Cat("Tom");
		c.eat();
		c.walk();
		c.play();
		a = new Cat();
		a.eat();
		a.walk();
		p = new Cat();
		p.setName1("Mr. Whiskers");
		p.play();

		Fish f = new Fish();
		f.setName("Guppy");
		f.eat();
		f.walk();
		f.play();
		a = new Fish();
		a.eat();
		a.walk();
	}

}

package com.example.animal;

public class Fish extends Animal implements pet {
	private String name;

	public Fish() {
		super(3);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void play() {
		System.out.println("Just keep swimming");
	}

	public void eat() {
		System.out.println("Fish eat pond scum");
	}
	public void walk(){
		System.out.println("Fish, of course, can't walk, they swim");
	}

	public String getName() {
		return this.name;
	}

	public void setName1(String name) {
		setName(name);
	}
}

package com.example.animal;

public class Cat extends Animal implements pet {
	private String name;
	public Cat(String name){
		 super(4);
		 this.name = name;
	}
	public Cat(){
		this("Fluffy");
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public void play(){
		System.out.println(this.name + " likes to play with string");
	}
	public void eat(){
		System.out.println("Cats likes to eat spiders and fish");
	}

	public void setName1(String name) {
		setName(name);

	}
}

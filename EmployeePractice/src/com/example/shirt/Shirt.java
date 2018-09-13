package com.example.shirt;

public class Shirt {
	private int id;
	private String description;
	private String color;
	private String size;
	private double prize;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSize() {
		return size;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

	public double getPrize() {
		return prize;
	}

}

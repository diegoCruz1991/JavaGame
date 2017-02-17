package com.oca.core.characters;

public class Character {

	private String name;
	public String type;
	private int age;
	private String gender;
	private double height;
	private double lifePoints;
	private int magicPoints;
	private int attackPoints;
	private int defensePoints;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getLifePoints() {
		return this.lifePoints;
	}

	public void setLifePoints(double lifePoints) {
		this.lifePoints = lifePoints;
	}

	public int getMagicPoints() {
		return this.magicPoints;
	}

	public void setMagicPoints(int magicPoints) {
		this.magicPoints = magicPoints;
	}

	public int getAttackPoints() {
		return this.attackPoints;
	}

	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}

	public int getDefensePoints() {
		return this.defensePoints;
	}

	public void setDefensePoints(int defensePoints) {
		this.defensePoints = defensePoints;
	}

	public void attack() {}

	public void walk() {}

	public void defend() {}

	public void jump() {}

}
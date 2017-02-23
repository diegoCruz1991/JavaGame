package com.oca.core.characters;

import static com.oca.core.config.CharacterTypes.WARRIOR;

public class Enemy {

	private String type;
	private int age;
	private String gender;
	private double height;
	private double lifePoints;
	private int attackPoints;
	private int defensePoints;

	{type = WARRIOR; age = 18; gender = "M"; height = 1.70; lifePoints = 100; attackPoints = 5; defensePoints = 5;}

	public Enemy() {}

	public Enemy(String type, int age) {
		this.setType(type);
		this.setAge(age);
	}

	public Enemy(double lifePoints, int attackPoints, int defensePoints) {
		this.setLifePoints(lifePoints);
		this.setAttackPoints(attackPoints);
		this.setDefensePoints(defensePoints);
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
		if(age > 300 || age < 15) {
			System.out.println("Error - The age is not valid, range needs to be between 15 to 300");
		} else {
			this.age = age;
		}
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		if(!"M".equalsIgnoreCase(gender) && !"H".equalsIgnoreCase(gender)) {
			System.out.println("Error - The gender is not valid");
		} else {
			this.gender = gender;
		}
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
		if(lifePoints > 200 || lifePoints < 0) {
			System.out.println("Error - The range of Life Points is between 0 and 200");
		} else {
			this.lifePoints = lifePoints;
		}
	}

	public int getAttackPoints() {
		return this.attackPoints;
	}

	public void setAttackPoints(int attackPoints) {
		if(attackPoints > 5 || attackPoints < 0) {
			System.out.println("Error - The range of attack Points is between 0 and 5");
		} else {
			this.attackPoints = attackPoints;
		}
	}

	public int getDefensePoints() {
		return this.defensePoints;
	}

	public void setDefensePoints(int defensePoints) {
		if(defensePoints > 5 || defensePoints < 0) {
			System.out.println("Error - The range of defense Points is between 0 and 5");
		} else {
			this.defensePoints = defensePoints;
		}
		
	}

	public void attack(MainCharacter character) {
		System.out.println(this.type + " enemy is attacking " + character.getName());
		character.defend(this);
	}

	public void attack(MainCharacter characterOne, MainCharacter... characters) {
		this.attack(characterOne);

		for(MainCharacter character : characters) {
			this.attack(character);
		}
	}

	public void walk() {}

	public void defend(MainCharacter character) {
		double attackTemp = character.getAttackPoints() - this.getDefensePoints(); 
		System.out.println(this.type + " enemy is losing " + attackTemp + " life points");
		this.setLifePoints(this.getLifePoints() - attackTemp);
	}

	public void jump() {}

}
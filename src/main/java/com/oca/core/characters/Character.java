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

	public Character(String name, String type, int age) {
		this.setName(name);
		this.setType(type);
		this.setAge(age);
	}

	public Character(double lifePoints, int magicPoints, int attackPoints, int defensePoints) {
		this.lifePoints = lifePoints;
		this.magicPoints = magicPoints;
		this.attackPoints = attackPoints;
		this.defensePoints = defensePoints;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if(name == null || (name.length() > 8 || name.length() < 1)) {
			System.out.println("Error - The name is not valid, range 1 to 8");
		} else {
			this.name = name;
		}
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
		if(height > 2.3 || height < 0.5) {
			System.out.println("Error - The range of height is between 0.50 and 2.30");
		} else {
			this.height = height;
		}
	}

	public double getLifePoints() {
		return this.lifePoints;
	}

	public void setLifePoints(double lifePoints) {
		if(lifePoints > 120 || lifePoints < 0) {
			System.out.println("Error - The range of Life Points is between 0 and 120");
		} else {
			this.lifePoints = lifePoints;
		}
	}

	public int getMagicPoints() {
		return this.magicPoints;
	}

	public void setMagicPoints(int magicPoints) {
		if(magicPoints > 10 || magicPoints < 0) {
			System.out.println("Error - The range of Magic Points is between 0 and 10");
		} else {
			this.magicPoints = magicPoints;
		}
	}

	public int getAttackPoints() {
		return this.attackPoints;
	}

	public void setAttackPoints(int attackPoints) {
		if(attackPoints > 10 || attackPoints < 0) {
			System.out.println("Error - The range of attack Points is between 0 and 10");
		} else {
			this.attackPoints = attackPoints;
		}
	}

	public int getDefensePoints() {
		return this.defensePoints;
	}

	public void setDefensePoints(int defensePoints) {
		if(defensePoints > 10 || defensePoints < 0) {
			System.out.println("Error - The range of defense Points is between 0 and 10");
		} else {
			this.defensePoints = defensePoints;
		}
	}

	public void attack() {}

	public void walk() {}

	public void defend() {}

	public void jump() {}

}
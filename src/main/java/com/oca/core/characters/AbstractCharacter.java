package com.oca.core.characters;

import static com.oca.core.config.CharacterTypes.WARRIOR;

public abstract class AbstractCharacter {

	private String type;
	private int age;
	private String gender;
	private double height;
	private double lifePoints;
	private int attackPoints;
	private int defensePoints;

	{ type = WARRIOR; age = 18; gender = "M"; height = 1.70; lifePoints = 100; attackPoints = 5; defensePoints = 5;}

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

	protected void attack(AbstractCharacter character) {
		if(character != null) {
			character.defend(this);
		}
	}

	public abstract void attack(AbstractCharacter characterParam, AbstractCharacter... characters);

	public abstract void defend(AbstractCharacter character);

	public void walk() {}

	public void jump() {}

}
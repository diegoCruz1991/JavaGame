package com.oca.core.characters;

import static com.oca.core.config.CharacterTypes.WARRIOR;

public class MainCharacter {

	private String name;
	private String type;
	private int age;
	private String gender;
	private double height;
	private double lifePoints;
	private int magicPoints;
	private int attackPoints;
	private int defensePoints;

	{ name = "player 1"; type = WARRIOR; age = 18; gender = "M"; height = 1.70; lifePoints = 100; magicPoints = 5; attackPoints = 5; defensePoints = 5;}

	public MainCharacter() {}

	public MainCharacter(String name, String type, int age, double lifePoints, int magicPoints, int attackPoints, int defensePoints) {
		this(lifePoints, magicPoints, attackPoints, defensePoints);
		this.setName(name);
		this.setType(type);
		this.setAge(age);
	}

	public MainCharacter(double lifePoints, int magicPoints, int attackPoints, int defensePoints) {
		this.lifePoints = lifePoints;
		this.magicPoints = magicPoints;
		this.attackPoints = attackPoints;
		this.defensePoints = defensePoints;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if(name == null || name.trim().isEmpty()) {
			System.out.println("Error - The name is not valid");
		} else {
			String tempName = name.trim();
			if(tempName.length() > 10) {
				name = tempName.substring(0, 10);
			} else {
				this.name = name;
			}
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

	private void attack(Enemy enemy) {
		if(enemy != null) {
			System.out.println(this.name + " is attacking " + enemy.getType() + " enemy");
			enemy.defend(this);
		}
	}

	public void attack(Enemy enemyParam, Enemy... enemies) {
		System.out.println("Segundo");
		this.attack(enemyParam);
		//for(int index = 0; index < enemies.length; index++)
		for(Enemy enemy : enemies) {
			this.attack(enemy);
		}
	}

	public void walk() {}

	public void defend(Enemy enemy) {
		double attackTemp = enemy.getAttackPoints() - this.getDefensePoints(); 
		System.out.println(this.name + " is losing " + attackTemp + " life points");
		this.setLifePoints(this.getLifePoints() - attackTemp);
	}

	public void jump() {}

	@Override
	public boolean equals(Object anObject) {
		if(anObject instanceof MainCharacter) {
			MainCharacter another = (MainCharacter)anObject;
			return this.getName().equals(another.getName());
		}
		return false;
	}

}
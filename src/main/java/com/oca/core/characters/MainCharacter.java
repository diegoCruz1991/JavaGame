package com.oca.core.characters;

public class MainCharacter extends AbstractCharacter {

	private String name;
	private int magicPoints;

	{ name = "player 1"; magicPoints = 5;}

	public MainCharacter() {}

	public MainCharacter(String name, String type, int age, double lifePoints, int magicPoints, int attackPoints, int defensePoints) {
		this(lifePoints, magicPoints, attackPoints, defensePoints);
		this.setName(name);
		this.setType(type);
		this.setAge(age);
	}

	public MainCharacter(double lifePoints, int magicPoints, int attackPoints, int defensePoints) {
		this.setLifePoints(lifePoints);
		this.setMagicPoints(magicPoints);
		this.setAttackPoints(attackPoints);
		this.setDefensePoints(defensePoints);
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

	@Override
	public void attack(AbstractCharacter enemyParam, AbstractCharacter... enemies) {
		System.out.println(this.getName() + " is attacking an enemy");
		this.attack(enemyParam);
		
		for(AbstractCharacter enemy : enemies) {
			this.attack(enemy);
		}
	}

	@Override
	public void defend(AbstractCharacter enemy) {
		double attackTemp = enemy.getAttackPoints() - this.getDefensePoints(); 
		this.setLifePoints(this.getLifePoints() - attackTemp);
	}

	@Override
	public boolean equals(Object anObject) {
		if(anObject instanceof MainCharacter) {
			MainCharacter another = (MainCharacter)anObject;
			return this.getName().equals(another.getName());
		}
		return false;
	}

}
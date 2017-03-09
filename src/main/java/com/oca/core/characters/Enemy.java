package com.oca.core.characters;

public class Enemy extends AbstractCharacter {

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

	@Override
	public void attack(AbstractCharacter characterParam, AbstractCharacter... characters) {
		System.out.println("Enemy " + this.getType() + " is attacking " + ((MainCharacter)characterParam).getName());
		this.attack(characterParam);
		
		for(AbstractCharacter character : characters) {
			System.out.println("Enemy " + this.getType() + " is attacking " + ((MainCharacter)character).getName());
			this.attack(character);
		}
	}

	@Override
	public void defend(AbstractCharacter character) {
		double attackTemp = character.getAttackPoints() - this.getDefensePoints(); 
		this.setLifePoints(this.getLifePoints() - attackTemp);
	}

}
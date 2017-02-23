package com.oca.app;

import com.oca.core.characters.MainCharacter;
import com.oca.core.characters.Enemy;

import static com.oca.config.GameConfiguration.*;
import static com.oca.core.config.CharacterTypes.*;

/**
* Esta clase es la clase principal donde inicia el juego
* @author Diego Cruz
*/
public class App {

	/**
	* Metodo principal donde inicia la ejecucion del juego
	*/
	public static void main(String... args) {

		System.out.println("Welcome to " + GAME_NAME);

		MainCharacter mainCharacter = new MainCharacter();

		Enemy enemy = new Enemy(WARRIOR, 30);

		enemy.setLifePoints(80);
		enemy.setAttackPoints(6);
		enemy.setDefensePoints(3);

		mainCharacter.setHeight(1.85);
		mainCharacter.setGender("H");
		mainCharacter.setMagicPoints(10);
		mainCharacter.setLifePoints(100);
		mainCharacter.setAttackPoints(8);
		mainCharacter.setDefensePoints(5);

		mainCharacter.attack(enemy);

		enemy.attack(mainCharacter);

	}
	
}


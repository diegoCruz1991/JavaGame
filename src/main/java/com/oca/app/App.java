package com.oca.app;

import com.oca.core.characters.Character;

import static com.oca.config.GameConfiguration.*;
import static com.oca.core.config.CharacterTypes.MAGE;

/**
* Esta clase es la clase principal donde inicia el juego
* @author Diego Cruz
*/
public class App {

	/**
	* Metodo principal donde inicia la ejecucion del juego
	*/
	public static void main(String args[]) {

		System.out.println("Welcome to " + GAME_NAME);

		Character mainCharacter = new Character("Diego", MAGE, 25);

		mainCharacter.setHeight(1.85);
		mainCharacter.setGender("H");
		mainCharacter.setMagicPoints(10);
		mainCharacter.setLifePoints(100);
		mainCharacter.setAttackPoints(5);
		mainCharacter.setDefensePoints(5);

	}
	
}


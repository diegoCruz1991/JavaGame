package com.oca.app;

import com.oca.core.characters.MainCharacter;
import com.oca.core.characters.Enemy;
import com.oca.ui.Menu;

import java.time.LocalDate;
import java.time.LocalDateTime;

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

		Menu.printMenu();
	}
	
}


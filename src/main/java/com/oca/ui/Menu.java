package com.oca.ui;

import com.oca.ui.helpers.UserCMDHelper;

public class Menu {

	public static void printMenu() {
		int opc = 0;

		do {
			System.out.println("1. Empezar juego");
			System.out.println("2. Salir juego");
			
			opc = UserCMDHelper.readIntFromCMD();

			switch(opc) {
				case 1:
					System.out.println("Juego Empezado");
					break;
				case 2:
					System.out.println("Adios!");
					break;
				default: System.out.println("Opcion invalida!");
			}
		} while(opc != 2);
	}
}
package com.oca.ui.helpers;

import java.util.Scanner;

public class UserCMDHelper {

	public static int readIntFromCMD() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
}
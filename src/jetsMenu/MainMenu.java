package jetsMenu;

import java.util.Scanner;

public class MainMenu {
	public static void main(String[] args) {
		int selection;
		Hanger a = new Hanger();
		Scanner kb = new Scanner(System.in);

		System.out.println("Welcome to Benny and the Jets! Your one stop shop for everything Jets!");
		System.out.println("Feel free to peruse our menu and make a selection of what you'd like to do ");
		do {
			System.out.println("1: List fleet");
			System.out.println("2: View our fastest Jets");
			System.out.println("3: View our longest range Jets");
			System.out.println("4: Customize your own Jet");
			System.out.println("5: Leave ");
			System.out.println("Please enter your selection 1, 2, 3, 4, or 5: ");
			selection = kb.nextInt();
			if (selection == 1) {
				Jet[] fleet = a.getFleet();
				for (int i = 0; i < a.getFleet().length; i++) {
					if (fleet[i] != null){
						System.out.println(fleet[i]);
					}
				}
			}
			if (selection == 2) {
				System.out.println(a.getMaxSpeed());

			}
			if (selection == 3) {
				System.out.println(a.getMaxRange());
			}
			if (selection == 4) {
				a.createJet();
				
			}

		} while (selection != 5);
		System.out.println("Thank you for visiting Benny and the Jets, come again soon!");
		return;
	}
}

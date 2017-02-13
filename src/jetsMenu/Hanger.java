package jetsMenu;

import java.util.Scanner;

public class Hanger {
	Scanner kb = new Scanner(System.in);
	Jet[] hanger = new Jet[10];

	public Hanger() {

		hanger[0] = new Jet("Arirbus", "a380", 404000000, 634, 9755);
		hanger[1] = new Jet("Cessna", "Citation", 1200000, 554, 7565);
		hanger[2] = new Jet("Boeing", "BBJ1", 57000000, 553, 7133);
		hanger[3] = new Jet("Lockheed Martin", "F-22 Raptor", 339000000, 1498, 1839);
		hanger[4] = new Jet("Air Tractor", "AT-502B", 575000, 211, 620);

	}

	Jet[] getFleet() {
		return hanger;
	}

	int getMaxSpeed() {
		int maxSpeed = hanger[0].getSpeed();
		for (int i = 0; i < hanger.length; i++) {
			if (hanger[i] != null) {
				if (hanger[i].getSpeed() > maxSpeed) {
					maxSpeed = hanger[i].getSpeed();
				}
			}
		}
		return maxSpeed;
	}

	int getMaxRange() {
		int maxRange = hanger[0].getRange();
		for (int i = 0; i < hanger.length; i++) {
			if (hanger[i] != null) {
				if (hanger[i].getRange() > maxRange) {
					maxRange = hanger[i].getRange();
				}
			}
		}
		return maxRange;
	}

	void createJet() {
		System.out.println("Select a Make of jet: ");
		String make = kb.nextLine();
		System.out.println("Select a model of jet: ");
		String model = kb.nextLine();
		System.out.println("Select the max speed you'd like your jet to go: ");
		int speed = kb.nextInt();
		System.out.println("Select the maximum distance you'd like your jet to be able to travel");
		int range = kb.nextInt();
		System.out.println("What do you want your price to be? ");
		int price = kb.nextInt();
		if (price <= 100000) {
			System.out.println("Come on man...You think we're working for free here? ");
		} else {
		}

		for (int j = 0; j < hanger.length; j++) {
			if (hanger[j] == null) {
				hanger[j] = new Jet(make, model, speed, range, price);
				break;
				
			}
		}
	}

}

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Program {
	static Scanner sc = new Scanner(System.in);

	public static double getRandNum() {
		int min = 70;
		int max = 90;
		return (Math.random() * (max - min)) + min;
	}

	public static void main(String[] args) {

		Seating[][] row = new Seating[4][3];

		for (int i = 0; i < row.length; i++) {
			row[i] = new Seating[i];

			for (int n = 0; n < row[i].length; n++) {
				row[i][n] = new Seating(true, getRandNum());
			}
		}
		System.out.println("please enter amount of seats you want to buy 1-12>");
		int amountOsSeats = sc.nextInt();
		for (amountOsSeats = 1; amountOsSeats <= 12; amountOsSeats++) {
			System.out.println("please enter the number of row 0-3>");
			int i = sc.nextInt();
			System.out.println("please enter the number of seat 0-2>");
			int n = sc.nextInt();

			for (i = 0; i < row.length; i++) {

				for (n = 0; n < row[i].length; n++) {
					if (row[i][n].available == true) {
						row[i][n].buySeat();
					}
				}
			}
		}

	}

}

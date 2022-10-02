package ejc88_lab5;

import java.util.Random; //Import Random class
import java.util.Scanner;  // Import the Scanner class

public class MainProgram {

	public static void main(String[] args) {
		Random dice = new Random();
		Scanner scan = new Scanner(System.in);
		
		String loop = "Yes";
do {
		System.out.println("How many times would you like to roll the dice?");
		String rollSTR = scan.nextLine();
		int rolls = Integer.parseInt(rollSTR);
	
		
		rollDice(rolls,dice);
		
		System.out.println("would you like to go again? enter Yes or No");
		 loop = scan.nextLine();
		
}while( loop.equals("Yes"));
	
	}
//method to roll dice
	static void rollDice(int rolls, Random dice) {
		//declares local variables for counting
		double val2 = 0;
		double val3 = 0;
		double val4 = 0;
		double val5 = 0;
		double val6 = 0;
		double val7 = 0;
		double val8 = 0;
		double val9 = 0;
		double val10 = 0;
		double val11 = 0;
		double val12 = 0;
		
//loop rolls two dice with random numbers from 0-5, adds 1, will repeat the roll as many times
//as specified from main function'
		
		for (int i = 0; i <= rolls; i++) {
			int roll1 = dice.nextInt(6);
			roll1 = roll1 + 1;
			int roll2 = dice.nextInt(6);
			roll2 = roll2 + 1;

			int total = roll1 + roll2;
			
//adds the newly generated value to the count
			
			if (total == 2) {
				val2 = val2 + 1;
			} else if (total == 3) {
				val3 = val3 + 1;
			} else if (total == 4) {
				val4 = val4 + 1;
			} else if (total == 5) {
				val5 = val5 + 1;
			} else if (total == 6) {
				val6 = val6 + 1;
			} else if (total == 7) {
				val7 = val7 + 1;
			} else if (total == 8) {
				val8 = val8 + 1;
			} else if (total == 9) {
				val9 = val9 + 1;
			} else if (total == 10) {
				val10 = val10 + 1;
			} else if (total == 11) {
				val11 = val11 + 1;

			} else if (total == 12) {
				val12 = val12 + 1;

			}
		}
		/**System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		System.out.println(val5);
		System.out.println(val6);
		System.out.println(val7);
		System.out.println(val8);
		System.out.println(val9);
		System.out.println(val10);
		System.out.println(val11);
		System.out.println(val12);
		**/
		//divides counts by 100 to get fractions
		val2 = val2/rolls;
		val3 = val3/rolls;
		val4 = val4/rolls;
		val5 = val5/rolls;
		val6 = val6/rolls;
		val7 = val7/rolls;
		val8 = val8/rolls;
		val9 = val9/rolls;
		val10 = val10/rolls;
		val11 = val11/rolls;
		val12 = val12/rolls;
		
		//displays all the newly calculated values
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		System.out.println(val5);
		System.out.println(val6);
		System.out.println(val7);
		System.out.println(val8);
		System.out.println(val9);
		System.out.println(val10);
		System.out.println(val11);
		System.out.println(val12);
	}
}

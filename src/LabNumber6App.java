
import java.util.Random;
import java.util.Scanner;

public class LabNumber6App {

	public static void main(String[] args) { // start of the class
		Scanner scnr = new Scanner(System.in);
		int number;
		int die1;
		int die2;
		int roll = 1;
					
		String userContinue = "yes";
		String userContinue2 = "no";
		
		Welcome();
			
		do {
					
		roll();
		userContinue =scnr.next();
		if (roll ==1)		
		System.out.println("Roll " + roll);
		
		sides();
		number = scnr.nextInt();
							
		die1 = generateRandomDieRoll(number);
		die2 = generateRandomDieRoll(number);
		
		if((roll == 1 ) && (die1 + die2) == 7) {
			System.out.println("You have rolled " + die1 + "  " + die2 + " You have won");
		}else if((die1 + die2) == 2 ) {
		   System.out.println("You have rolled " + die1 + "   " + die2 + " Snake Eyes");	
		}else if((die1 + die2) == 12) {
			System.out.println("You have rolled " + die1 + "  " + "  "+ die2 +  " Box Cars");
		}else if ((die1 + die2) == 7) {
			System.out.println("You have rolled " + die1 + "   " + die2 + " you have crapped out");
		}else 
	
		System.out.println("Your have rolled " + die1 + " " + "  " + die2);
				
		System.out.println("Do you want roll again?");
		userContinue = scnr.next();
		
//		if(roll ==1)
//		System.out.println(("Roll ") + ( ++roll));
		
		if(userContinue2.equalsIgnoreCase("no"));
		System.out.println("Roll "+ ++ roll);
		
		
		}while(userContinue.equalsIgnoreCase("yes"));
		
		System.out.println();
		
		System.out.println("Goodbye");
		
		scnr.close();
		
	} // end of the class

	private static void sides() {
		System.out.println("Please enter the number of sides for a pair of dice");
	}
		private static int generateRandomDieRoll(int sides) {
		int dice;
	
		Random rand = new Random();
		dice = rand.nextInt(sides) + 1;
		return dice;	
		
	}
		private static void roll() {
			System.out.println("Is this your first roll?");
		
		}
		private static void Welcome() {
			System.out.println("Welcome to Grand Circus Casino!");
			System.out.println();
		}
}
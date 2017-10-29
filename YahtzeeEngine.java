import java.util.Scanner;

/**
 * 
 */

/**
 * @author Brian Hane
 *
 */
public class YahtzeeEngine {
	 public static void introduction(){
	        System.out.println("This program will [insert rules]");
	    }
	    public static YahtzeeDie [] dieArray(Scanner keyboard){
	        int numDice = getInt(keyboard, "How many dice do you want to throw? ");
	        while ((numDice <= 0)||(numDice >10)){
	            System.out.println("Error: enter a number between 0-10");
	            numDice = getInt(keyboard, "How many dice do you want to throw? ");
	        }
	        YahtzeeDie [] dieArray = new YahtzeeDie [numDice];
	        return dieArray;
	    }

	    public static int getInt (Scanner keyboard, String prompt){
	        System.out.print(prompt);
	        while (!keyboard.hasNextInt()){
	            keyboard.next();
	            System.out.println("Error: you must enter an integer.");
	            System.out.print(prompt);
	        }
	        return keyboard.nextInt();
	    }
	    public static void printDot(int numRolls){
	        System.out.print(".");
	        if ((numRolls%50) == 0){
	            System.out.println();
	        }
	    }
	    public static void printResults (int numRolls, YahtzeeDie[] dieArray){
	        System.out.println();
	        System.out.println("Yahtzee!!");
	        System.out.print("After " + numRolls + " rolls, I finally rolled ");
	        System.out.println(dieArray.length + " " + dieArray[0].getValue() + "'s");
	        System.out.println();   
	    }

	    public static boolean runAgain (Scanner keyboard){
	        System.out.print("Play again? (y|n)):    ");
	        String answer = keyboard.next().trim().toLowerCase();
	        keyboard.nextLine();
	        System.out.println();
	        return (answer.charAt(0) == 'y');
	    }
}


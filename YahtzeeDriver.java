/**
 * 
 */

/**
 * @author Brian Hane
 *
 */
import java.util.*;


public class YahtzeeDriver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
            YahtzeeEngine.introduction();
            boolean runAgain = true;
            while (runAgain){
                boolean rolledYahtzee = false;
                int numRolls = 0;
                YahtzeeDie [] dieArray = YahtzeeEngine.dieArray(keyboard);
                while(!rolledYahtzee){
                    dieArray = rollDice(dieArray);
                    numRolls++;
                    YahtzeeEngine.printDot(numRolls);
                    rolledYahtzee = checkForYahtzee(dieArray, numRolls);
                }
                YahtzeeEngine.printResults (numRolls, dieArray);
                runAgain = YahtzeeEngine.runAgain(keyboard);
            }
    }
    public static boolean checkForYahtzee(YahtzeeDie[] dieArray, int numRolls) {
        for(int i = 0; i < dieArray.length; i++) {
            for(int j = i+1; j < dieArray.length; j++) {
                if(dieArray[i].getValue() != dieArray[j].getValue()) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static YahtzeeDie [] rollDice(YahtzeeDie [] dieArray){
        for (int i = 0; i < dieArray.length; i++){
            dieArray[i] = new YahtzeeDie ();
            dieArray[i].roll();
        }
        return dieArray;
    } 

}

/**
 * This program allows the user to input three random numbers between 1 and 6.
 * Then the program calculates the sum of Dice Rolls and the product of random numbers.
 * Then it checks to see if the user wins or loses.
 */
import java.util.Scanner;
/**
 * The import Scanner allows the user to input values into the system.
 * The public class RollOfDice is the name of a class and this type of class has to be accessible to public.
 */

public class RollOfDice {
    /**
     * Function name : main
     * @param args
     */
    public static void main(String[] args) {
        /**
         * This function: System.out.println() prints out the below statement.
         */
        System.out.println("This program is Developed by Derek Osborne on 11/26/2022");
        /** 
         * The Function Scanner Scan allows the user to input values based on the type of variable called.
        */
        Scanner scan = new Scanner(System.in);
        /**
         * Since we dealing with whole numbers we called our variables integer.
         */
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        /**
         * The Function below prints the user's inputs which has to fall between 1 and 6 and stores those values.
         */
        System.out.println("Enter number between 1 and 6");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

         /**
          * The Function below is called the If statements.
          * Inside the Function:
          * The user is restricted and has to input values between 1 and 6.
          * Anything outside the parameters between 1 and 6 will shut the game down.
          */
        if(num1 < 1 || num2 < 1 || num3 < 1){
            System.out.println("The number must not be less than 1");
            System.exit(0);
        }
        if(num1 > 6 || num2 > 6 || num3 > 6){
            System.out.println("The number must not be greater than 6");
            System.exit(0);
        }
       /**
        * The method below calculates the product of numbers and sum of dice rolls and prints out the function.
        */
       int productOfNumbers = num1 * num2 * num3;
       int sumOfDiceRolls = roll1 + roll2 + roll3;
       System.out.println("Dice Sum: " + sumOfDiceRolls + ". Number Product: " + productOfNumbers);
       /**
        * The function is checkwin
        * Inside the function:
        * We used the if statements to check if the user wins or loses based on the user's input of values.
        */

       if (checkWin(productOfNumbers, sumOfDiceRolls)) {
        System.out.println("Wow!. You won the game");
        }
       else{
        System.out.println("Aww!. You lost the game. Better Luck Next Time.");
       }
      /**
       * The scanner always have to be closed to avoid any leaks.
       */

        scan.close();
    }
    /**
     * Function : rollDice
     * @return (value of rollDice).
     * return value is a random number between 1 and 6 and the random number will add 1 to the right side of the values inputed.
     */
    public static int rollDice(){
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int)randomNumber;
    }
    /**
     *Function : checkWin
     *Function type : Boolean
     *Inside the function type:
     *Boolean was used because we want to compare true/false statements based on user input of values.  
     * @param productOfNumbers
     * @param sumOfDiceRolls
     * @return
     */
    public static boolean checkWin(int productOfNumbers, int sumOfDiceRolls ){
       return(productOfNumbers > sumOfDiceRolls && (sumOfDiceRolls + productOfNumbers)/2 < productOfNumbers);
       }
}

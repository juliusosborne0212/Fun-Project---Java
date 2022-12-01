/**
 * is a system used to asked for input.
 */
import java.util.Scanner;

/**
 * Name of a class which has to be declared public.
 */
public class Poker {
    
    /**
     * This main method has to be declared static. 
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to my Mini Poker game. Type anything when you're ready.");
        scan.nextLine();
        System.out.println("It's like Poker, but a lot simpler.The rules are below");
        System.out.println("There are two players, you and the computer.");
        System.out.println("The dealer will give each player one card.");
        System.out.println("Then, the dealer will draw five cards (the river)");
        System.out.println("The player with the most river matches wins!");
        System.out.println("If the matches are equal, everyone's a winner!");
        System.out.println("Ready? Type anything if you are.");
        scan.nextLine();

        System.out.println("Enter the name for player 1 : ");
        String name = scan.nextLine();
        
        System.out.println(" ");
       /**
        * Variables used are String and Integers. 
        */
        String yourCard = randomCard();
        String computerCard = randomCard();
        System.out.println("Here's your card: " + name);
        System.out.println(yourCard);
        System.out.println("\nHere's the computer card: ");
        System.out.println(computerCard);

       

        int yourMatches = 0;
        
        int computerMatches = 0;

        
        System.out.println(randomCard());
    System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
    /**
     * Function name: For Loops
     * Inside the Function:
     * The number of draws should be less than 5 and begins by 1.
     */
    for(int i = 1; i <= 5; i++){
        scan.nextLine();
        String draw = randomCard();
        System.out.println("Card " + i);
        System.out.println(draw);
    }  
    /**
     * Function name: If Statements
     * Inside the Function: 
     * Used to specify a block of code to be executed, if a specified condition is true
     *  */  
    if(yourCard.equals("draw")){
        yourMatches++;
    }
    if(computerCard.equals("draw")){
        computerMatches++;
    }
    System.out.println("Your number of matches: " + yourMatches);
    System.out.println("Computer number of matches: " + computerMatches);
    if(yourMatches > computerMatches){
        System.out.println( name + " wins");
    }
    else if(computerMatches > yourMatches){
        System.out.println("Computer Wins");
    }
    else{
        System.out.println("Its a draw");
    }
    scan.close();
    }

    /**
     * Function name: randomCard
     * Inside the Function
     * needs to have a @return method and has to return a string.
     */
    public static String randomCard(){
        double randomNumber = Math.random()*13;
        randomNumber+=1;
        int randomInt = (int)randomNumber;

        /**
         * Function name : Switch Statement
         * Inside the Function
         * it is execute a block of code among many alternatives
         * in this case we used to store and compare various types of poker cards which will allow the dealer to draw cards from.
         */
    switch(randomInt){
        case 1:return
        "   _____\n"+
        "  |A _  |\n"+ 
        "  | ( ) |\n"+
        "  |(_'_)|\n"+
        "  |  |  |\n"+
        "  |____V|\n";
        case 2:return
        "   _____\n"+              
        "  |2    |\n"+ 
        "  |  o  |\n"+
        "  |     |\n"+
        "  |  o  |\n"+
        "  |____Z|\n";
        case 3:return
        "   _____\n" +
        "  |3    |\n"+
        "  | o o |\n"+
        "  |     |\n"+
        "  |  o  |\n"+
        "  |____E|\n";
        case 4:return
        "   _____\n" +
        "  |4    |\n"+
        "  | o o |\n"+
        "  |     |\n"+
        "  | o o |\n"+
        "  |____h|\n";
        case 5:return
        "   _____ \n" +
        "  |5    |\n" +
        "  | o o |\n" +
        "  |  o  |\n" +
        "  | o o |\n" +
        "  |____S|\n";
        case 6:return
        "   _____ \n" +
        "  |6    |\n" +
        "  | o o |\n" +
        "  | o o |\n" +
        "  | o o |\n" +
        "  |____6|\n";
        case 7:return
        "   _____ \n" +
        "  |7    |\n" +
        "  | o o |\n" +
        "  |o o o|\n" +
        "  | o o |\n" +
        "  |____7|\n";
        case 8:return
        "   _____ \n" +
        "  |8    |\n" +
        "  |o o o|\n" +
        "  | o o |\n" +
        "  |o o o|\n" +
        "  |____8|\n";
        case 9:return
        "   _____ \n" +
        "  |9    |\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |____9|\n";
        case 10:return
        "   _____ \n" +
        "  |10  o|\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |___10|\n";
        case 11:return
        "   _____\n" +
        "  |J  ww|\n"+ 
        "  | o {)|\n"+ 
        "  |o o% |\n"+ 
        "  | | % |\n"+ 
        "  |__%%[|\n";
        case 12:return
        "   _____\n" +
        "  |Q  ww|\n"+ 
        "  | o {(|\n"+ 
        "  |o o%%|\n"+ 
        "  | |%%%|\n"+ 
        "  |_%%%O|\n";
        case 13:return
        "   _____\n" +
        "  |K  WW|\n"+ 
        "  | o {)|\n"+ 
        "  |o o%%|\n"+ 
        "  | |%%%|\n"+ 
        "  |_%%%>|\n";
        default:return"This should never been called";
    } 

    }
    
}


import java.util.Scanner;
/**
 * Name of the class is called FunFacts
 * The class named has to be public.
 */
public class FunFacts {
    /**
     * Function name is main
     * @param args
     */
    public static void main(String[] args){
    System.out.println("This program is developed by Derek Osborne on 11/25/2022"); 
    /**
     * Function name = Scanner
     * Inside the function :
     * It allows the user to make a choice/inputs
     *  */   
        Scanner scan = new Scanner(System.in);
    int choice;    
        System.out.print( "\nDo you want to learn some interesting Facts about Continents?\n" );
System.out.println( "Write 1 for Africa");
System.out.println( "Write 2 for Australia");
System.out.println( "Write 3 for North America");
System.out.println( "Write 4 for South America" );
System.out.println( "Write 5 for Europe");
choice = scan.nextInt();

trivia(choice);

scan.close();
    }
    /**
     * Function name : Trivia
     * @param choice(Integer)
     * Inside the function:
     * Switch Statement was used because we want to compare choices
     * Based on user choice there is a print statements. 
     */
public static void trivia(int choice){
    switch (choice) {
        case 1:
            System.out.println("It has the tallest mountain Kilimanjaro, which is located in Tanzania");
            System.out.println("It has the longest river called river Nile");
            break;
        case 2:
            System.out.println("It is the driest inhabited continent of the world");
            break;
        case 3:
            System.out.println("There Are 965 Species of Mammal in North America"); 
            System.out.println("100’s of Languages Are Spoken in North America ");
            System.out.println("North America’s Geography Includes All the Major Biomes");  
            break;
        case 4:
            System.out.println("the weather in South America is hot and humid");
            System.out.println("The second longest river in the world, The Amazon, is in South America.");
            break;
        case 5:
            System.out.println(" It has 932 castles. Even if you visited one castle a day, it would take you over 2 years to see them all");
            System.out.println("200 different languages are spoken across Europe.Only 24 are recognised as the official languages of the European Union");
            break;          
    
        default:
            break;
    }
}    
}
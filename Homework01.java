/*
 * Written by Darius Brown				
 */
//In remembrance of Ezekiel Lawson, Febuary 6 2024 - Febuary 8 2024. My first nephew I never got a chance to see grow up. Miss you little guy. 
import java.util.Scanner;
import java.util.Random;
public class Homework01 {
	// Imports Java libraries for inputs
	public static int RNG_RANGE = 100;//random number generator for numeric comparison portion.
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);//selects input device
	System.out.println("The Farrow Lands. A choose your own adventure game.");
	Random r = new Random();
	System.out.println("In this game, other characters' dialogues are marked with \"quotations\". Your dialogue is without. To Begin, enter \"begin\".\nTo exit, enter \"exit\".");
	String story = "\"Welcome to the edge of void stranger, I am the Knowledge Seeker! It appears you've traveled a great distance to arrive here.\nYou must be weary young traveler..."
			+ " You should rest here tonight before you continue on your journey.\"\n\"Ohhhh, it seems i've forgotten my manners, I've given you my name but what is yours, young one?\"\nEnter your name";
	String choice00 = keyboard.nextLine();//the first decision
	if (choice00.equalsIgnoreCase("begin")) 
	{
	System.out.println(story);//Prints the above string. 		
	}
	else if (choice00.equalsIgnoreCase("exit")) 
	{
	System.out.println("See you for an adventure another time!");
	System.exit(0);//Immediately stops the program. (sad face)
	}
	else
	{
		System.out.println("Please enter a valid response.");
		System.exit(0);//ISP
	}
	//Stacking story line strings here to system.out.println later. I'm not the best at organization.
	
	String storyRoom = ("You talk to the book keeper and arrange a room. You get into bed and fall asleep. A knight such as yourself always sleeps in their armor.\n"
	+ "You wake the next morning and meet with the Knowledge Seeker in the tavern.");
	String storySpeech = ("You begin your speech in hopes of rallying the town to help you on your quest. Your words are so influential and awe-inspiring, it wasn't able to be written here due to over exposure to pure awesomeness!\n"
			+ "Men and women were brought to tears, roses were thrown, candles were waived, and babies were named in your honor for 100 years! \nThe entire town of Mcguffins rally to join you on your quest. The next morning, you ride to the Void.\n"
			+ "You and your army arrive at dawn, swords drawn, staffs raised, and banners held high. A great battle followed.\nThe Void is very powerful...\nMany lives were lost, but you and your clan of unlikely heros vanquish the void! ");
	String storySpeech2 = ("You begin your speech, but it's so poorly worded and ill timed that the crowd grows angry! You're run out of town by the villagers!");
	
	
	String name = keyboard.nextLine();// Never miss an opportunity to have custom names.	
	System.out.println("\"Always a pleasure to guide a noble knight such as yourself, "+name+".\"");
	System.out.println("\"Now, what will it be?\"");
	System.out.println("Enter: \"rest\", \"continue\", or \"talk\"");//asks for user input	
	String choice01 = keyboard.nextLine();
	if (choice01.equalsIgnoreCase("rest"))
	{
		System.out.println("You follow the knowledge seeker to a small tavern near the outskirts of the Void.");
		System.out.println("You enter the old iron clad doors and are greeted by many foul looking (and smelling) characters.");
		System.out.println("What would you like to do, approach the bar? ask for a room? Leave? Or give a speech?\n Enter: \"bar\",\"room\", or \"speech\".");
		String choice2 = keyboard.nextLine();
		if(choice2.equalsIgnoreCase("bar"))
		{
			System.out.println("Enter the number of drinks you'll have as a whole number. Example: 5");
			int drink;
			drink = keyboard.nextInt();
	       //boolean expression
	        if (drink>=1 && drink<=3)
	        {
	        	String storyBar = ("You approach the bar and order "+drink+" drink(s) and to your surprise it tastes like pumpkin spice. You're allergic to pumpkin spice!");
			System.out.println(storyBar);
			System.out.println("The end. Play again, "+name+".");//END 1
			System.exit(0);//ISP.
			}
	        else if (drink>=4) 
	        {
	        	System.out.println("You order "+drink+" drinks and become drunk. When you wake up, you can't remember why, or how you came to the tavern and head home.");
	        	System.out.println("The end. Play again, "+name+".");
	        	System.exit(0);//ISP.
	        }
	        else if (drink == 0)
        	{
        		System.out.println("You go to order a drink, you decide "+drink+" drinks... Why did you come to the bar?");
        		System.out.println("You can't order 0 drinks, Start over!");
        		System.exit(0);
        	}
	        else
	        {
	        	System.out.println("That's an incorrect response, Start over!");
	        	System.exit(0);//ISP
	        }
		 }
			else if (choice2.equalsIgnoreCase("room")) 
			{
			System.out.println(storyRoom);
			System.out.println("\"Good morrow "+name+"!\"");
			System.out.println("\"I trust you are well rested and ready for the void. Now, will you continue to the Void,"+name+"?\"\nEnter \"true\" or \"false\". ");
			//Boom, Pow! String comparison
			String comparison = keyboard.nextLine();
			String tru = "true";
			String fals = "false";
				if(comparison.equalsIgnoreCase(fals))
				{
				System.out.println("You bid the Knowledge Seeker farewell and make a new life for yourself at the tavern working for the shop keep. You live out your days in peace, forgetting all about the Void.\nThe end.");
				System.out.println("Play again "+name+"");
				System.exit(0);//END 2
			
				}
			else if(comparison.equalsIgnoreCase(tru))
				{
				System.out.println("\"Excellent! we ride!\"\nThe Knowledge Seeker leads you outside where two horses are saddled. You ride for nearly an hour before reaching the Void.\n"
						+ "You stand at the edge of the void, it's black essence ominously wafting out like bellowing clouds. You enter the void, but you went in without armor"
						+ "(you took it off previously to shower). How foolish! \nYou died. WOMP WOMP! ");
				System.out.println("Play again "+name+"");
				System.exit(0);//ISP
				}
			else
				{
				System.out.println("Someone doesn't want to play by the rules... I like that, you win "+name+"!");//END 3. Easter egg, bonus points if you found it without reading the code first :)
				System.exit(0);//ISP
				}
			}
		else if (choice2.equalsIgnoreCase("speech")) 
		{
			System.out.println("To give your speech, answer the following math question.");
			//Numeric comparison portion. 
			int num1 = r.nextInt(RNG_RANGE);
			int num2 = r.nextInt(RNG_RANGE);
			int result = num1 + num2;
			System.out.println("What is "+num1+" + "+num2+"?");
			int answer = keyboard.nextInt();
			
			if(answer == result)
				{
				System.out.println("You're correct!");
				System.out.println(storySpeech);
				System.out.println("Well done "+name+"! Thanks for playing :)");//END 4
				System.exit(0);//ISP
				}
			else if (answer != result)
				{
				System.out.println("That's incorrect!");
				System.out.println(storySpeech2);//END 5
				System.out.println("Try again "+name+".");
				System.exit(0);//ISP
				}
			else
				{
				System.out.println("Please enter a valid response. Start over!");
				System.exit(0);//ISP
				}
		}
		}
	if (choice01.equalsIgnoreCase("continue"))
		{
		System.out.println("You ignore the Knowledge Seeker and carry on through the night and reach the void at dawn, exhausted, and with chapped lips from dehydration.");
		System.out.println("Before you lies a glowing purple portal, You look into it wondering what could be on the other side.\n\"Enter\" or \"Explore\"");
		String choice3 = keyboard.nextLine();
	if(choice3.equalsIgnoreCase("enter"))
		{
		System.out.println("You step into it cautiously, and lose balance and fall through and hit your head!"
		+ "\nWhen you open your eyes, you see a ceiling fan above you, your leg is half way on a bed wrapped in twisted blankets. It was all a dream!\nThe End.");
		System.out.println("See you another time "+name+".");//END 6
		System.exit(0);//ISP.
		}
	else if(choice3.equalsIgnoreCase("Explore"))
		{
		String storyExplore = ("You continue around the portal and jump into the void. A short distance later you find yourself at the foot of a mountain. You enter and find a chest full of potions,\n"
				+ "scrolls, silver, and gold!\nWell Done "+name+"." );
		System.out.println(storyExplore);//END 7
		System.exit(0);//ISP.
		}
	else
		{
		System.out.println("Please enter a valid response. Start over!");
		System.exit(0);//ISP
		}
	}
	if (choice01.equalsIgnoreCase("talk"))
	{
	System.out.println("Choose: Why are you out here in the middle of the night? or, Who are you? Enter \"who\" or \"why\".");
	String choice4 = keyboard.nextLine();
		if (choice4.equalsIgnoreCase("who"))
			{
	System.out.println("Who are you?\n\"I am the Knowledge Seeker! I literlly just told you, bro. It's the middle of the night, you want to go to the void or not?\"");
	System.out.println("You died of embarrassment! Womp Womp...\nBetter luck next time, "+name+".");//Ending 8.
	System.exit(0);//Immediately stops program.
			}
		else if(choice4.equalsIgnoreCase("why"))
			{
			System.out.println("Why are you out here in the middle of the night? Don't you have a life?");
			String tellMeWhy = ("\"I suppose you'd rather someone else help you? Right, I'm sure there are plenty of others around to guide you. Good luck "+name+"!\"\nYou did not find someone else to guide you. You stumble in the night"
					+ " and fall down a waterfall.\nThe End. " );//Ain't nothin' but a heartache
			System.out.println(tellMeWhy);//I want it that way.....
			System.out.println("Try again "+name+".");//END 9
			System.exit(0);//ISP.
			}
		else
			{
			System.out.println("Please enter a valid response. Start Over!");
			System.exit(0);//ISP
			}
	}
		
	
	
	}
    }

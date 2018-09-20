/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOUR CODE GOES HERE :)

public class ASCIIArt {
	public static void main(String args[]) {
		drawQuote();
		drawEars();
		drawEars();
		System.out.println("\"-----\"");
		drawEyes();
		drawMouth();
		System.out.println("-------");
		drawHands();
		drawFeet();
		System.out.println("\nThis is a little creature called Bob. \nHe has two LONG ears, two eyes, two hands and two feet.");
		System.out.println("\nNote: the blank spaces in between the ears may show up as blue lines when you run this code.");
	}
	public static void drawEars() {
		System.out.println("\"" + "     " + "\"");
	}
	public static void drawEyes() {
		System.out.println("| > < |");
	}
	public static void drawMouth() {
		System.out.println("|  -  |");
	}
	public static void drawHands() {
		System.out.println(" -| |- ");
	}
	public static void drawFeet() {
		System.out.println("  / \\  ");
		System.out.println(" /   \\  ");
	}
	public static void drawQuote() {
		System.out.println("\t __________");
		System.out.println("\t|          |");
		System.out.println("\t| Hello!!  |");
		System.out.println("\t| I'm Bob. |");
		System.out.println("\t|__________|");
		System.out.println("\t //");
		System.out.println("\t//");
	}
}

/*
		 __________
		| Hello!!  |
		|__________|
		 //
		//
"     "
"	  "
"-----"
| > < |
|  -  |
-------
 -| |- 
  / \
 /   \
   */

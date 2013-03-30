import java.util.*;
public class Main {
public static void main(String[] args){
	Random Number = new Random();
	int answer;
		answer = 1+Number.nextInt(10);
		int remain = 0;
		int deathcont = 0;
		int min = 5;
	

	System.out.println("This is a guessing game where you have to guess a number between 1-10 you have 6 attempts before you fail, let the games begin!");
	System.out.println("A number has been picked");
	System.out.println("Made for Zach");
	Scanner number = new Scanner(System.in);
	while(remain < 6){
	System.out.println("Enter your guess 1-10 : ");
	int dimmer = number.nextInt();
	if(dimmer == answer) remain = 6; else{
	System.out.println("Guess again");
	System.out.println("You have " + min + " Guess's left");
	remain++;
	deathcont++;
	min--;
	}
	}
	if(deathcont==6)System.out.println("You have failed the game"); else{
	System.out.println("YOUR WON! THE ANSWER WAS " + answer);
	
	}

}	
}
// goal is ==
// [3/28/13 8:44:25 PM] Zach Latta: I like games.
// [3/28/13 8:44:40 PM] Zach Latta: I want you to make a game for me where I need to guess a number between 1 and 10.
// [3/28/13 8:44:53 PM] Zach Latta: So a guessing game.
// .
// . 
// .
 // Links used to help build this
//http://www.youtube.com/watch?v=fFg40hzi9X0
//http://www.youtube.com/watch?v=AhwIYAXPASw
//http://www.youtube.com/results?search_query=java+ramdom+number&oq=java+ramdom+number&gs_l=youtube-reduced.3..33i21.629184.634115.0.634184.19.16.3.0.0.0.274.2259.4j4j6.14.0...0.0...1ac.1.069q8QME0yo
//http://www.youtube.com/watch?v=5DdacOkrTgo
//http://www.youtube.com/results?search_query=java+getting+user+input&oq=java+getting+use&gs_l=youtube-reduced.3.0.0.77205.79444.0.80806.16.13.0.3.3.2.247.1623.5j6j2.13.0...0.0...1ac.1.yW35GwRS-rY
//http://introcs.cs.princeton.edu/java/11cheatsheet/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

public class AdventureGameProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner keyedInput = new Scanner (System.in);
   	 
    	String userName;
    	String userChoice;
    	String userTestAns;
   	 
   	 
   	 
   	 
    	System.out.println("Welcome to the game: Test Day!");
    	System.out.println("Please enter your name: ");
    	userName = keyedInput.nextLine();
   	 
   	 
   	 
    	System.out.println("hello " + userName + ", you are 12 years old and you have a big geography test today, which you aren't prepared for at all. ");
   	 
  	 
   	 
    	System.out.println("You're at school, and your teacher has arranged the desks differently because of the test. You can sit wherever you want. Do you sit beside the door or the window? ");
    	System.out.println("Door: press A");
    	System.out.println("Window: press B");
    	userChoice = keyedInput.nextLine();
   	 
        	switch (userChoice) {
            	case "A" : case "a" :
            	System.out.println("You sat by the door. ");
           	 
            	// sitting by door
            	System.out.println("Your classmates start to enter the room. Your classmate Jennifer sits next to you.");
            	System.out.println();
            	System.out.println("The test starts. You don't know anything. Do you want to do your best on your own, or try to look at Jennifer's answers?");
            	System.out.println("Do it on your own: press A");
            	System.out.println("Look at Jennifer's answers: press B");
            	userChoice = keyedInput.nextLine();
           	 
           	 
                	switch (userChoice) {
                        	case "A" : case "a" : // not cheating
                                    System.out.println("You chose not to take the risk and tried your best on the test. At the end there is a bonus question: ");
                                    System.out.println();
                                    System.out.println("What is the smallest province in Canada?");
                                    System.out.println("Please type in your answers. And remember to use proper spelling, spacing, and capitalization, or your teacher will mark it wrong.");
                                    userTestAns = keyedInput.nextLine();
                   	 
                                    if (userTestAns.equals("Prince Edward Island")) {
                                        System.out.println("When you go to school the next day, your teacher has marked the test. You got a 13/20. You did get the bonus question right. That's good, at least.  ");
                                        System.out.println(" ");
                                        System.out.println(" ");
                                        System.out.println("Thank you for playing Test Day!");
                                        System. exit(0);

                                    }else{
                                        System.out.println("When you go to school the next day, your teacher has marked the test. You got a 12/20. You didn't get the bonus question right.  ");
                                        System.out.println("Apparently, the smallest province in Canada is Prince Edward Island, not " + userTestAns + ".");
                                        System.out.println(" ");
                                        System.out.println(" ");
                                        System.out.println("Thank you for playing Test Day!");
                                        System. exit(0);
                                            }   	 
                               	 
                            	// cheating
                        	case "B" : case "b" :

                        	System.out.println("You try to look at Jennifer's test, but her arm is blocking your way.");                           	 
                        	System.out.println("Do you want to drop your pencil and look while you pick it up, or wait until the teacher isn't looking?");
                        	System.out.println("Drop your pencil: press A");
                        	System.out.println("Wait until the teacher isn't looking: press B");
                       	 
                        	userChoice = keyedInput.nextLine();
                           	 
                                	switch (userChoice) {
                                    	case "A" : case "a" : // pencil on floor
                                    	System.out.println("You subtly knock your pencil onto the floor. As you go to pick it up, you lean closer to Jennifer's desk and try to see what she wrote down. ");
                                    	System.out.println("As you do this, you hear your teacher call your name. She calls you up the the front, and tells you she saw you looking over at another students paper. ");
                                    	System.out.println(" ");
                                    	System.out.println("'Cheating is an immediate zero, " + userName + ".'She says. 'You should know that. I'll be contacting your parents about this.'");
                                    	System.out.println("When you get home, your parents have already been called. They take away your XBox and ground you for a month. ");
                                   	 
                                    	System.out.println(" ");
                                    	System.out.println(" ");
                                    	System.out.println("Thank you for playing Test Day!");
                                    	System. exit(0);
                                   	 
                                    	case "B" : case "b" : //succesfully cheat off of jennifer
                                    	System.out.println("You wait for a minute or two, until the teacher turns around to put something away. When she isn't looking, you stretch your neck out and lean over to look at Jennifer's test.");
                                    	System.out.println("Jennifer notices you. She looks at the teacher who has her back turned, and moves her arm, giving you a clear view of what she's writing. ");
                                    	System.out.println("She smiles at you goes back to her test. ");
                                    	System.out.println(" ");
                                    	System.out.println("You finish the test and submit it with confidence. ");
                                    	System.out.println("When you go to school the next day, your teacher has marked the test. You got a 20/20! Jennifer really knows her stuff! ");
                                   	 
                                   	 
                                    	System.out.println(); // direction scene
                                    	System.out.println("Later,when class is done and it's time to head home that day, you feel great. You're excited to show your mark to your parents.   ");
                                    	System.out.println("Because of how great you feel, you decide to walk home instead of taking the bus like you normally do.");
                                    	System.out.println("As you're walking, you come across an intersection that you can't quite remember. Do you go left or right?");
                                    	System.out.println("Go left: press A");
                                    	System.out.println("Go right: press B"); // turn 1
                                   	 
                                        	userChoice = keyedInput.nextLine();
                                       	 
                                            	switch (userChoice) { //direction scene 1
                                                	case "A" : case "a" :
                                                	System.out.println("You went left. After turning the corner, you recognised where you were, and walked home the rest of the way.");
                                                	System.out.println(" ");
                                                	System.out.println(" ");
                                                	System.out.println("Thank you for playing Test Day!");
                                                	System. exit(0);
                                               	 
                                                	case "B" : case "b" :
                                                	System.out.println("You went right. You don't quite recongize where you are. You come to another split in the road. Do you continue straight, or go right again? ");
                                                	System.out.println("Go straight: press A");
                                                	System.out.println("Go right: press B"); // turn 2
                                               	 
                                                    	userChoice = keyedInput.nextLine();
                                                   	 
                                                    	switch (userChoice) { // direction scene 2
                                                        	case "A" : case "a" :
                                                        	System.out.println("You continued straight. After a while, you recognised where you were, and walked home the rest of the way.");
                                                       	 
                                                        	System.out.println(" ");
                                                        	System.out.println(" ");
                                                        	System.out.println("Thank you for playing Test Day!");
                                                        	System. exit(0);
                                                       	 
                                                        	case "B" : case "b" :
                                                        	System.out.println("You took another right turn. You still don't recongize where you are. After a few more turns, you end up back at the school. ");
                                                        	System.out.println("From there, you decide to just take the bus, and you get home half an hour later than normal. ");
                                   	 
                                                        	System.out.println("When you get home, your parents are happy to see your grade.  ");
                                       	 
                                                        	System.out.println(" ");
                                                        	System.out.println(" ");
                                                        	System.out.println("Thank you for playing Test Day!");
                                                        	System. exit(0);
                                                    	 
                                                        	default :
                                                        	System.out.println("Invalid response :(  ");
                                                        	System. exit(0);
                                                                	} // end of direction scene 2
                                            	} // end of direction scene 1
                                   	 
                                                	default :
                                                	System.out.println("Invalid response :(  ");
                                                	System. exit(0);
                                   	 
                                            	} // pencil or wait decision
                            	 
                   	 
                            	System.out.println(" ");
                            	default :
                            	System.out.println("Invalid response :(  ");
                            	System. exit(0);
                	} 	 
                            	 
        	// user sits by window
        	case "B" : case "b" :
        	System.out.println("You sat by the window. ");
        	System.out.println("The weather outside is amazing. It's sunny, and there's a warm breeze coming in through the window.");
        	System.out.println("You start the test, but by the time you're midway through, the comfortable weather puts you to sleep at your desk. ");
        	System.out.println("By the time you wake up, the test is being collected, and you're only half way through. ");
        	System.out.println("You dread going to school the next day, but still have to anyway. The tests are marked and you got a 9/20. Yikes. ");
     	 
        	System.out.println(" ");
        	System.out.println(" ");
        	System.out.println("Thank you for playing Test Day!");
        	System. exit(0);
       	 
        	default :
        	System.out.println("Invalid response :(  ");
        	System. exit(0);
            	} // door or window
        
        
        
        
        
    }
    
}

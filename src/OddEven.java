

import java.util.Scanner;

class OddOrEven{


	   public static void main(String args[])
	   { 
	   
	   Scanner scan = new Scanner(System.in);
		System.out.println("Hi! What's your name?");
	   String userName = scan.nextLine(); //prompts user for their name with the keyword "userName"
	   	  
	   System.out.print("Welcome " + userName + "! ");
	   
	  String answer; //the object "answer" answers the question "Want to try again?"
	  
	  
	  //loop the following code as long as the answer to the question 
	  //"Want to try again?" is Y or y
	  do {
	   int x; //x= the number that the user inputs
	   
	   System.out.println("Please enter a number between 1 and 100.");
	      @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
	      x = in.nextInt();
	      
	      if (x <=0 || x >=101) //if x is greater than 100 or less than 1
	    	  System.out.println("No way, " + userName + "! That number isn't between 1 and 100!");
	      
	      if (x % 2 == 0 && x <=60 && x >= 26) //if x is even and between 25 and 60
	         System.out.println("This is an even number, " + userName);
	      
	      if (x % 2 == 0 && x >=1 && x <=25 ) //if x is even and less than 25
	    	  System.out.println("Hey, " + userName + "!The number " + x + " is even and less than 25!");
	      
	      if (x % 2 == 0 && x >60 && x <101) //if x is even and between 60 and 100
	    	  System.out.println ("Hey, " + userName + "! The number " + x + " is even!");
	      
	     if (x % 2 != 0 && x > 60 && x <100) //if x is odd and greater than 60
	    	 System.out.println("Hey, " + userName + "! The number " + x + " is odd and over 60!");
	     
	     if (x % 2 !=0 && x >=0 && x < 60) //if x is odd and greater than 0 but less than 60
	    	 System.out.println("Hey, " + userName + "! The number " + x + " is odd!");
	     
	     System.out.println("Want to try again? (y/n)");
			answer = scan.next(); //asks the user if they want to run the program again
	    	   
	   
}
	  while (answer.equalsIgnoreCase("y")); //loops the program again
	  
	  System.out.println("Ok, " + userName + "! Thanks for playing. Goodbye!");
	  //ends the program
	  
	  scan.close();
	  
	   }
}


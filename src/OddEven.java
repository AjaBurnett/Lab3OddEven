

import java.util.Scanner;

class OddOrEven{


	   public static void main(String args[])
	   { 
	   
	   Scanner scan = new Scanner(System.in);
		System.out.println("Hi! What's your name?");
	   String userName = scan.nextLine();
	   
	   
	  String answer;
	  
	  do {
	   int x;
	   System.out.println("Welcome " + userName + "! Please enter a number between 1 and 100.");
	      Scanner in = new Scanner(System.in);
	      x = in.nextInt();
	      
	      if (x <=0 || x >=101)
	    	  System.out.println("No way, " + userName + "! That number isn't between 1 and 100!");
	      
	      if (x % 2 == 0 && x <=60 && x >= 26)
	         System.out.println("Hey, " + userName + "! The number " + x + " is even! ");
	      
	      if (x % 2 == 0 && x <=25 )
	    	  System.out.println("Hey, " + userName + "!The number " + x + " is even and less than 25!");
	      
	      if (x % 2 == 0 && x >60 && x <101)
	    	  System.out.println ("Hey, " + userName + "! The number " + x + " is even!");
	      
	     if (x % 2 != 0 && x > 60 && x <100)
	    	 System.out.println("Hey, " + userName + "! The number " + x + " is odd and over 60!");
	     
	     if (x % 2 !=0 && x < 60)
	    	 System.out.println("Hey, " + userName + "! The number " + x + " is odd!");
	     
	     System.out.println("Want to try again? (y/n)");
			answer = scan.next();
	    	 

	   
	   
}
	  while (answer.equalsIgnoreCase("y"));
	  
	  System.out.println("Ok, " + userName + "! Thanks for playing. Goodbye!");
	   }
}


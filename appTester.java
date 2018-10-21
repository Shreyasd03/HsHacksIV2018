/*
 * This code is currently made for math only. It can be progressed further to add more subjects, topics, questions, and more.
 */

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
public class appTester {
	
	
   public static void main(String[] args) throws InterruptedException {
	   int points = 0;
       int pointsNeededToEscape = 100;
	   while(true) {
		   //the options for multiple choice answers (character to index)
	
	       String[] subjects = new String[] {"Math"};
	       HashMap<String, String[]> subjectToTopic = new HashMap<String, String[]>();
	       
	       String[] topics;
	       for(int i = 0; i < subjects.length; i++) {
	    	   if (subjects[i].equals("Math")) {
	    		   topics = new String[] {"geometry", "algebra", "calculus"};
	    		   subjectToTopic.put(subjects[i], topics);
	    	   }
	       }
	       
	       Scanner input = new Scanner(System.in);
	     
	
	       System.out.println("Subjects: " + subjectToTopic.keySet());
	       System.out.println("What subject do you want to work on today?");
	       String subject = input.nextLine();
	       
	       System.out.println("Topics: " + Arrays.toString(subjectToTopic.get(subject)));
	       System.out.println("What topic do you want to work on today?");
	       String topic = input.nextLine();
	
	       System.out.println("How many questions do you want to do? (max 5)");
	       int questionNum = input.nextInt();
	
	        
	       System.out.println("Answer the questions! (A, B, C, or D)");
	       
	       System.out.println("Ready!");
	       try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	       System.out.println("Set!");
	       try {
	   		TimeUnit.SECONDS.sleep(2);
	   	} catch (InterruptedException e) {
	   		e.printStackTrace();
	   	}
	       System.out.println("Go!");
	       try {
	   		TimeUnit.SECONDS.sleep(2);
	   	} catch (InterruptedException e) {
	   		e.printStackTrace();
	   	}
	       
	       
	       
	       //Algebra Questions
	       problem[] mathAlgebra;
	       String[] posAns = new String[] {"6", "2", "5", "7"};
	       problem alOne = new problem("Math", "Solve for x: 2x -3 = 7", posAns, "C");
	       
	       posAns = new String[]{"3", "6", "9", "5"};
	       problem alTwo = new problem("Math", "Solve for x: x + 4 = 9", posAns, "D");
	       
	       posAns = new String[]{"7", "5", "3", "6"};
	       problem alThree = new problem("Math", "Solve for x: 5x + 8 = 33", posAns, "B");
	       
	       posAns = new String[]{"x= -2, y= -1", "x= -2, y= 10", "x= 2, y= -2", "x= 3, y= -5"};
	       problem alFour = new problem("Math", "Solve the system of equations: y = -3x + 4    x + 4y = -6", posAns, "C");
	       
	       posAns = new String[]{"20 + x = 40", "x + 40 = 20", "20x = 40", "20x > 40"};
	       problem alFive = new problem("Math", "Express as an equation: 20 more than x is 40", posAns, "A");
	       
	       posAns = new String[]{"24", "16", "19", "32"};
	       problem alSix = new problem("Math", "If x = 4, simplify: x^2 + 3x - 4", posAns, "A");
	       
	       posAns = new String[]{"3.42 × 10^6", "3.60 ×  10^6", "3.60 × 10^7", "3.42 × 10^7"};
	       problem alSeven = new problem("Math", "In scientific notation, 20,000 + 3,400,000 = ?", posAns, "A");
	       
	       posAns = new String[]{"16ab", "-3a + b", "-3a + 7b", "9a + 7b"};
	       problem alEight = new problem("Math", "Which of the following is equivalent to 3a + 4b – (–6a – 3b)", posAns, "D");
	       
	       posAns = new String[]{"-6", "-3", "-2/3", "2/3"};
	       problem alNine = new problem("Math", "What is the slope of the line with the equation 2x + 3y + 6 = 0", posAns, "C");
	       
	       mathAlgebra = new problem[] {alOne, alTwo, alThree, alFour, alFive, alSix, alSeven, alEight, alNine};
	       
	       
	     //Geometry Questions
	       problem[] mathGeometry;
	       posAns = new String[] {"6", "2", "4", "7"};
	       problem gEOne = new problem("Math", "What is the radius of the circle whose equation is (x − 5)2 + (y + 3)2 = 16?", posAns, "C");

	       posAns = new String[]{"3", "6", "9", "5"};
	       problem gETwo = new problem("Math", "If two legs of a right triangle measure 3 and 4 respectively, what is the length of the hypotenuse of that right triangle?",
	              posAns, "D");

	       posAns = new String[]{"720", "540", "360", "72"};
	       problem gEThree = new problem("Math", "The number of degrees in the sum of the interior angles of a pentagon is", posAns, "B");

	       posAns = new String[]{"36pi", "12pi", "288pi", "48pi"};
	       problem gEFour = new problem("Math", "A sphere is inscribed inside a cube with edges of 6pi cm. In cubic centimeters, what is the volume of the sphere, in terms of π?",
	              posAns, "A");

	       posAns = new String[]{"60", "90", "36", "48"};
	       problem gEFive = new problem("Math","The angles of triangle ABC are in the ratio of 8:3:4. What is the measure of the smallest angle in degrees?", posAns,"C" );

	       posAns = new String[]{"108", "120", "90", "135"};
	       problem gESix = new problem("Math", "Determine, in degrees, the measure of each interior angle of a regular octagon.", posAns, "D");

	       posAns = new String[]{"180", "90", "60", "120"};
	       problem gESeven = new problem("Math", "What is the difference between the sum of the measures of the interior angles of a regular pentagon and the sum of the measures of the exterior angles of a regular pentagon?",
	              posAns, "A");

	       posAns = new String[]{"3.8", "14", "7.2", "10"};
	       problem gEEight = new problem("Math", "What is the length of the line segment whose endpoints are (1, −4) and (9, 2)?", posAns, "D");

	       posAns = new String[]{"pentagon", "hexagon", "quadrilateral", "triangle"};
	       problem gENine = new problem("Math", "For which polygon does the sum of the measures of the interior angles equal the sum of the measures of the exterior angles?",
	              posAns, "C");

	       mathGeometry = new problem[] {gEOne, gETwo, gEThree, gEFour, gEFive, gESix, gESeven, gEEight, gENine};


	       
	       
	     //Calculus Questions
	       problem[] mathCalculus = new problem[]{};
	       
	       
	       
	       
	       int correct = 0;
	       int wrong = 0;
	       int questionsLeft = questionNum;
	       String userAns = "";
	       
	       Random random = new Random();
	       int index;
	       
	       List<Integer> usedIndex = new ArrayList<Integer>();
	       
	       if(subject.equals(mathAlgebra[0].topic)) {
		       for(int i = 0; i < questionNum; i++) {
		    	   index = random.nextInt(9);
		    	   while(usedIndex.contains(index)) {
		    		   index = random.nextInt(9);
		    	   }
		    	   usedIndex.add(index);   
		    	   
		    	   System.out.println(mathAlgebra[index].question);
		    	   System.out.println("A: " + mathAlgebra[index].possAns[0] + "    B:" + mathAlgebra[index].possAns[1] + "    C:" + mathAlgebra[index].possAns[2] + "    D:" + mathAlgebra[index].possAns[3]);
		    	   Scanner userInput = new Scanner(System.in);
		    	   userAns = userInput.next();
//		    	   System.out.println(userAns);
		    	   if (mathAlgebra[index].ans.equals(userAns)) {
		    		   correct++;
		    		   if(index <=2) {
		    			   points += 10;
		    		   }
		    		   else if(index <= 5 && index >= 3) {
		    			   points += 15;
		    		   }
		    		   else if(index > 5) {
		    			   points += 20;
		    		   }
		    	   }
		    	   else{
		    		   wrong++;
		    	   }
		    	   questionsLeft--;
		    	   if(questionsLeft == 0) {
		    		   break;
		    	   }
		    	   
		       }
	       }
	       
	       else if(subject.equals(mathGeometry[0].topic)) {
		       for(int i = 0; i < questionNum; i++) {
		    	   
		    	   index = random.nextInt(10);
		    	   while(usedIndex.contains(index)) {
		    		   index = random.nextInt(9);
		    	   }
		    	   usedIndex.add(index);   
		    	   System.out.println(mathGeometry[index].question);
		    	   System.out.println("A: " + mathGeometry[index].possAns[0] + "    B:" + mathGeometry[index].possAns[1] + "    C:" + mathGeometry[index].possAns[2] + "    D:" + mathGeometry[index].possAns[3]);
		    	   Scanner userInput = new Scanner(System.in);
		    	   userAns = userInput.next();
		    	   if (mathGeometry[index].ans.equals(userAns)) {
		    		   correct++;
		    		   if(index <=2) {
		    			   points += 10;
		    		   }
		    		   else if(index <= 5 && index >= 3) {
		    			   points += 15;
		    		   }
		    		   else if(index > 5) {
		    			   points += 20;
		    		   }
		    	   }
		    	   else{
		    		   wrong++;
		    	   }
		    	   questionsLeft--;
		    	   if(questionsLeft == 0) {
		    		   break;
		    	   }
		    	   
		       }
	       }
	       
	       System.out.println("You got " + correct + " correct and got " + wrong + " wrong. That is about a " + ((correct*1.0)/questionNum)*100 + "%");
	       System.out.println("You have " + points + " points!");
	       if(points >= pointsNeededToEscape) {
	    	   System.out.println("CONGRAGULATIONS! You have enough points to access your computer!");
	    	   break;
	       }
	       else {
	    	   System.out.println("You dont have enough points! Go again to get more! (you need " + pointsNeededToEscape + " more)");
	       }
	   }
   }
}



package textManipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class LabTextManipulation {

	public static void main(String[] args) {

		// Read in the name and put into a Array List
		ArrayList<String> parks = new ArrayList<String>();
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter names of national parks(enter done to exit):  ");

		String inputParks = input.nextLine();

		while (!inputParks.equalsIgnoreCase("done")) {

			parks.add(inputParks);
			System.out.println("Please enter names of national parks(enter done to exit):  ");
			inputParks = input.nextLine();

		}

	

		// String builder add " | " but not including the last one.
		StringBuilder nationalParks = new StringBuilder();
		boolean first = true;

		for (String el : parks) {
			if (first) {
				first = false;
			} else {
				nationalParks.append(" | ");
			}
			nationalParks.append(el);
		};

		System.out.printf("Favorite National Parks: %s", updateSpelling(nationalParks.toString()));

		
		

	}
	
	// Update the spelling
	private static String updateSpelling(String text){
		
		StringBuilder sb = new StringBuilder();
		//default a space for a condition for next char to be change to a upper letter.
		char ch = ' ';
		 	//loop the string
			for(int i = 0;i<text.length();i++){
				//check if it is first letter after a space,and this Char is not a space
				if(ch == ' ' && text.charAt(i) != ' '){
					sb.append(Character.toUpperCase(text.charAt(i)));
					
				}
				//knowing that is is not first letter check if it is a letter
				else if(Character.isLetter(text.charAt(i)))
				{
					sb.append(Character.toLowerCase(text.charAt(i)));
				}
				//if it is not first letter and not a letter it must be a space
				else 
				{
					sb.append(text.charAt(i));
				}
				//keep tracing every Char in each index
				ch = text.charAt(i);
			}
		
		 return sb.toString();
}

}

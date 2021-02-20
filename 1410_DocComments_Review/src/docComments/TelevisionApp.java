package docComments;

import java.util.ArrayList;
import java.util.Scanner;


public class TelevisionApp {
	
	static ArrayList<Television> list = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		list.add(new Television("21","TCL",false));
		list.add(new Television("49","SONY",true));
		list.add(new Television("56","Samsung",true));
		list.add(new Television("36","Panasonic",false));
		while(true) {
		menuSlect();
		}
	}
	
	private static void menuSlect(){
		Scanner input = new Scanner(System.in);
		int numberSelect = 0;
		System.out.println("1. Show all devices");
		System.out.println("2. Add a device");
		System.out.println("3. Find a device");
		System.out.println("4. Delete a device");
		System.out.println("5. Number of devices");
		System.out.println("6. Exit");
		System.out.println("Enter your selection: ");
		
		numberSelect = input.nextInt();
		
		System.out.println();
		
		menuActive(numberSelect,input);
		
	}
	
	
	 private static void menuActive(int numberSelect, Scanner input) {
		 
		 	int id = 0;
		 	boolean check ;
		 	
		 	switch(numberSelect) {
		 	
		 		case 1:
		 			for(Television i:list) {
		 				System.out.println(i);
		 			}
		 			System.out.println();
		 			break;
		 			
		 		case 2:
		 			System.out.println("Enter Brand Name: ");
		 			input.nextLine();
		 			String name = input.nextLine();
		 			System.out.print("Enter dimension inches number: ");
		 			
		 			String dimension = input.nextLine();
		 			System.out.print("Enter true or false for if it is a SmarTV");
		 			boolean smart = input.nextBoolean();
		 			list.add(new Television(dimension,name,smart));
		 			System.out.println();
		 			break;
		 		
		 		case 3:
		 			System.out.println("Please Enter TV's ID: ");
		 			 id = input.nextInt();
		 			 check = false;
		 			for(Television i:list) {
		 				if(id ==i.getId()) {
		 					System.out.println(i);
		 					check = true;
		 				}
		 				
		 			}
		 			if(!check) {
		 				System.out.println("ID:"+id+"Not Found");
		 				System.out.println();
		 			}
		 			break;
		 			
		 		case 4:
		 			System.out.println("Please Enter TV'S ID you want to Delete: ");
		 			id = input.nextInt();
		 			check =false;
		 			for(Television i:list){
		 				if(id==i.getId()) {
		 					System.out.println(i+"Deleted");
		 					list.remove(i);
		 					check = true;
		 					break;
		 				}
		 			}
		 			if(!check) {
		 				System.out.println("ID"+id+"Not Found");
		 				System.out.println();
		 				break;
		 			}
		 		case 5:
		 			System.out.println("Total of TVs is: "+list.size());
		 			System.out.println();
		 			break;
		 			
		 		case 6:
		 			System.out.println("Good Bye");
		 			System.exit(0);
		 			
		 		default:
		 			System.out.println("Error invaild choice!");
		 			
		 			
		 	}
	
	 }
}

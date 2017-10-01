package ie.gmit.sw;

import java.util.Scanner;

public class MenuRunner {
	
	//Scanner for reading in
	private static Scanner scanner = new Scanner (System.in);

	//RUNNING TIME: O(1) - Constant time, MenuRunner is just user input, apart from calling a method which calls upon subsequent methods
	//						which in turn contain their own running time
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		long timeTaken = 0;
		int option = 0;
		String fileName;
		String key;
		
		//Initail prompt
		System.out.println("Please select an option:");
		System.out.println("1) File parse & encryption/decryption");
		System.out.println("2) Exit");
		option = scanner.nextInt();
		
		//Copy and past for convenience
		// DATASTRUCTURESANDALGORITHMSDATASTR
		// THECURFEWTOLLSTHEKNELLOFPARTINGDAY
		
		//Controlled while loop
		while(option != 2){
			//Switch for user option
			switch(option){
			case 1:
				//Read in file name/URL
				System.out.println("Please enter name of file (.txt or URL):");
				fileName = scanner.next();
			
				//Read in key
				System.out.println("Please enter the key used to encrypt the file:");
				key = scanner.next();
				
				//Start timer
				timeTaken = System.currentTimeMillis();
				
				//Begin parsing/encryption
				FileParse.FileWriter(key, fileName);
				
				//Finish timer
				System.out.println("Please see 'output.txt', time taken is: " + (System.currentTimeMillis() - timeTaken) + "ms");
				
				break;
				
				default:
					System.out.println("Please enter a valid option!");
			}//Switch
			
			//Repeat options
			System.out.println("Please select an option:");
			System.out.println("1) File parse & encryption/decryption");
			System.out.println("2) Exit");
			option = scanner.nextInt();
			
		}//While

	}//main

}//MenuRunner

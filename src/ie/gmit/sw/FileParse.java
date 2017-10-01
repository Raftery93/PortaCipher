package ie.gmit.sw;

import java.io.*;
import java.net.*;

public class FileParse {

	//RUNNING TIME: O(1) - Constant time, due to no loops present. This is an estimate as the file reading will take some time but nothing to drastic
	//method creates buffer reader
	public static BufferedReader myParse(String fileName){
		
		BufferedReader br = null;
		
		//try catch statement for error testing
		try{
			//if statement to catch URL
			if(fileName.contains("www.") || fileName.contains("http.")){
				
				URL myUrl = new URL(fileName);
				
				//buffer reader
				br = new BufferedReader(
						new InputStreamReader(
								myUrl.openStream()));//To read URL
			}//if
			
			else{
				br = new BufferedReader(new FileReader(fileName));//To read file
			}//else
		}//try
		//Catch exceptions
		catch (IOException | NullPointerException e){
			System.out.println("Error: Your file/URL was not found");
		}//catch
		
		//return
		return br;//return what was read in
	}//myParse
	
		//RUNNING TIME: O(n) - Linear, time doubles as input doubles, not to intensive as it just writes to file
		public static void FileWriter(String key, String fileName){
			
			BufferedReader br = myParse(fileName);
			
			int read;
			
			try{
				BufferedWriter bw = new BufferedWriter(
						new FileWriter("output.txt"));//To write to file "output.txt" 
				
				//-1 = end of file
				while((read = br.read()) != -1){
					//Pass char into decryption
					char c = Decrypt.Decryption(Character.toUpperCase((char)read), key);

					bw.write(c);//write chars as upper case to the output.txt
				}//while
				
				br.close();//close bufferReader
				bw.close();//close bufferWriter
			}//try
			
			//Catch exceptions
			catch(FileNotFoundException e){
				System.out.println("Error with file");
			}//catch
			catch(IOException e){
				System.out.println("Error with file");
			}//catch
			catch(NullPointerException e){
				System.out.println("Error with file");
			}//catch
			
		}//FileWriter
	
}//FileParser

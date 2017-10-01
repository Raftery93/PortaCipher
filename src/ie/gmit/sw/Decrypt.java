package ie.gmit.sw;

//import java.util.*;

public class Decrypt {
	
	//RUNNING TIME: O(n) - Linear, due to the fact that the time doubles as input size (n) doubles
	public static char Decryption(char c, String key){
		//Variables
		char newChar = c;
		int keyChar = 0;
		int row = 0;
		int col = 0;
		int i = 0;

		//If letter parsed is a letter(checked via unicode), else do nothing with character
		if ((int) newChar > 64 && (int) newChar < 91) {
			
			//Check the letter against the tableau row, once matched, break out of loop
			for (i = 1; i < 14; i++) {
				if (PortaCipher.tableau[i][0].indexOf(key.charAt(keyChar)) >= 0) {
					row = i;
					break;
				} //if
			} //for

			//Check the letter against the tableau col by finding its unicode value
			col = (((int)newChar)-65)+1;
			
			//Increment to get the next read in (unconverted) char
			keyChar++;
			
			//Reset keyLetter if reached the end of the passKey, as to prep for next letter
			if (keyChar == key.length()) {
				keyChar = 0;
			}//if
			//The index of row + col will give me my new letter (converted)
			newChar = PortaCipher.tableau[row][col].charAt(0);
		}//outer if

		//Send back the new char
		return newChar;
		
	}//Decryption
}//Decrypt

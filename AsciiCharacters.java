/* This program will display
 * the ASCII characters */

//Class to display the ASCII characters.
public class AsciiCharacters {

	//Main method.
	public static void main(String[] args) {
		
		//Initialize the counting of the ASCII characters
		int count = 0;
		
		//Showing the ASCII characters table from "!" to "~"
		for (int i=33; i<=126; i++) {
			
			//Increase the count, each time the for loop runs.
			count++;
			
			//Display 10 ASCII characters per line.
			if (count % 10 == 0) {
				System.out.println((char)i);
			}	//If statement.
			
			//Maintain the gaps between two ASCII characters
			else {
				System.out.print((char)i + " ");
			}	//Else statement.
			
		}	//For loop.
		
	}	//Main() method.

}	//ASCII characters class.

/**
 * @author Arash
 *
 *For all of the following words, if you move the first letter to the end of the word, 
 *and then spell the result backwards, you will get the original word:
 *banana dresser grammar potato revive uneven assess
 *Write a program that reads a word and determines whether it has this property. 
 *Continue reading and testing words until you encounter the word quit.
 *Treat uppercase letters as lowercase letters.
 */

import java.util.*;

public class WordReverser {
	public static void main(String[] args) 
	{		
		while (true)
		{
			//input
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Please enter a new word: ");
			String word = keyboard.next().toLowerCase();
			
			//exit the program
			if (isEqual(word, "quit"))
			{
				System.out.print("Goodbye.");
				break;
				//System.exit(0);		
			}
			
			//moves the first letter to the back of the word variable
			String word1 = word.substring(1, word.length()) + word.charAt(0);
			
			//reverses the original word
			System.out.println("The word reversed is "+ reversable(word1));
			
			//output
			if (isEqual(word, reversable(word1)))
				System.out.println(word + " is meeting the property.\n");
			else System.out.println(word + " is not meeting the property.\n");				
		}
	}

	/**
	 * Checks if the two strings are equal
	 * @param original
	 * @param reverse
	 * @return
	 */
	static boolean isEqual(String original, String reverse)
	{
		if (original.equals(reverse))
			return true;
		else return false;
	}
	
	/**
	 * Reverses the string
	 * @param newWord
	 * @return
	 */
	static String reversable(String word)
	{
		String newWord = "";
		for (int i = word.length() - 1; i >=0; i--)
		{
			newWord += word.charAt(i);
		}
		return newWord;
	}
}
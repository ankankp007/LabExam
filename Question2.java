//Create a Java program that prompts the user for a sentence and implements a method to
//format this sentence so that each word starts with an uppercase letter and the rest are lowercase,
//regardless of how the input text was originally formatted.
//public static String formatSentence(String sentence)
//Display the formatted sentence.
package SetA;

import java.util.Scanner;

public class Question2 {
	static String convert(String str)
	{

		char ch[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {

			
			if (i == 0 && ch[i] != ' ' || 
					ch[i] != ' ' && ch[i - 1] == ' ') {

				if (ch[i] >= 'a' && ch[i] <= 'z') {

					ch[i] = (char)(ch[i] - 'a' + 'A');
				}
			}

			
			else if (ch[i] >= 'A' && ch[i] <= 'Z') 

				ch[i] = (char)(ch[i] + 'a' - 'A');		 
		}

		String st = new String(ch);
		return st;
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner (System.in);
		System.out.print("Enter the sentence:");
		String str= obj.nextLine();
		System.out.println( "The Sentence shoild be : " +convert(str));
	}
}



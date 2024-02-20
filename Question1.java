//Write a Java method that checks if an array of integers contains three sequential numbers
//(e.g., 4, 5, 6 or 9, 10, 11) anywhere within it.
//public static boolean containsSequentialNumbers(int[] numbers)
//Write a program that prompts the user to enter a sequence of numbers, checks for sequential
//numbers, and displays an appropriate message.

package SetA;
import java.util.Scanner;

public class Question1 {
	static boolean containsSequentialNumbers(int array[])
	{
	
		
//		for (int i =1; i<array.length;i++) {
//			if ((array[i]+ array[i+2])/2==array[i+1]) {
//				return true;
//			}
//		}
//			return false;
		if(array[0] < array[1] && array[1] < array[2]) {
			return true;
		}
		else {
			return false;
		}

	}
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		// System.out.println("Enter the size of the array:");
		// int x=obj.nextInt();
		int array[]=new int[3];
  	 System.out.println("Enter elements to of the array: ");
		for(int i=0;i<3;i++)
			array[i]=obj.nextInt();
		
		
		if (containsSequentialNumbers(array) == true)
			System.out.println("Array elements are consecutive");
		else
			System.out.println("Array elements are not consecutive");
	}
	
}





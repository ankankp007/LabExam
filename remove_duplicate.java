package SetC;

import java.util.Scanner;

public class remove_duplicate {
	public static int[] findDuplicate(int arr[]) { 
		int count[] = new int[100000];
		for(int i = 0;i < arr.length;i++) { 
			count[arr[i]]++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter the size of the Array : ");
		int n = obj.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter " + n + " elements : ");
		for(int i = 0;i < n;i++) { 
			arr[i] = obj.nextInt();
		}
		int cnt[] = findDuplicate(arr);
		
		for(int i = 0;i < cnt.length;i++) { 
			if(cnt[i] > 1) {
				for(int j = 0;j < cnt[i];j++) {
					System.out.print(i + " ");
				}
			}
		}
		System.out.println();
		
		obj.close();
	}
}

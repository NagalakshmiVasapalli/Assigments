package UdemyAssigments;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		int arraysize = scan.nextInt();
		int arrayValues[] = new int[arraysize];
		System.out.println("Enter the values in the array");
		int temp;
		for( int i=0; i<arraysize; i ++)
		{
			arrayValues[i] = scan.nextInt();
		}
		
		for(int i=0; i<arraysize; i++)
		{
			for(int j=i+1; j<arraysize ; j++)
			{
				if(arrayValues[i]>arrayValues[j])
				{
					temp = arrayValues[i];
					arrayValues[i] = arrayValues[j];
					arrayValues[j] = temp;
				}
			}		
			
		}
		System.out.println("Ascending Order:");
		for (int k=0;k<arraysize;k++)
		{
			 System.out.print(arrayValues[k] + " ");
		}
		
	}
}

package UdemyAssigments;

import java.util.Scanner;

public class LargestNumber {
	
	public Factorial check() {
		
		return new Factorial();
		
	}

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of tthe array:");
		int ArraySize = scan.nextInt();
		int ArrayValues[] = new int[ArraySize];
		System.out.println("Enter the values of the array:");
		for(int i=0; i<ArraySize; i++)
		{
			 ArrayValues[i] = scan.nextInt();
		}
		int max=0;
		for(int i=0; i<ArraySize; i++)
		{
			for(int j=i+1; j<ArraySize ; j++)
			{
				if(ArrayValues[i]<ArrayValues[j])
				{
					
					max = ArrayValues[j];
				}
			}
		}
		
		System.out.println("Largest number is:" + max);
		
	}

}

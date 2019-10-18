package UdemyAssigments;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int min=0;
		System.out.println("Enter the array size");
		int ArraySize = scan.nextInt();
		System.out.println("Enter the array Values:");
		int ArrayValues[] = new int[ArraySize];
		for (int i=0; i<ArraySize; i++)
		{
			ArrayValues[i] = scan.nextInt();
		}		
		for(int i=0; i<ArraySize;i++)
		{
			for (int j=i+1; j<ArraySize; j++)
			{
				if(ArrayValues[i]<ArrayValues[j])
				{
					min = ArrayValues[i];
				}
			}
		}
		
		System.out.println("Smallest number is:" + min);
	}

}

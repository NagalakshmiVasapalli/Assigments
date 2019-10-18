package UdemyAssigments;

import java.util.Scanner;

public class DescendingOrder {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the array:" + " ");
		int ArraySize = scan.nextInt();
		int ArrayValue[] = new int[ArraySize];
		System.out.println("Enter the array values");
		for(int i=0; i<ArraySize; i++)
		{
			ArrayValue[i] = scan.nextInt();
		}
		
		int temp;
		for(int i=0; i<ArraySize; i++)
		{
			for (int j=i+1; j<ArraySize; j++)
			{
				if(ArrayValue[i] < ArrayValue[j])
				{
					temp = ArrayValue[i];
					ArrayValue[i] = ArrayValue[j];
					ArrayValue[j] = temp;
				}
			}
		}
		
		System.out.println("Descending Order:");
		for(int k=0; k<ArraySize; k++)
		{
			System.out.print(ArrayValue[k] + " ");
		}
	}

}

package UdemyAssigments;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String Reverse=" ";
		System.out.println("Enter the text:");
		String text = scan.nextLine();
		int size = text.length();
		
		for(int i=size-1; i>=0; i--)
		{
		 Reverse = Reverse + text.charAt(i);
		}
		
		System.out.println("String after Reverse:" + Reverse);
	}

}

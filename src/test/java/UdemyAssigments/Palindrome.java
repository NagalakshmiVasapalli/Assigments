package UdemyAssigments;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		String reverse = "";
		System.out.println("Enter the String:");
		String text = scan.nextLine();
		int size = text.length();
		for(int i=size-1 ; i>=0 ; i--)
		{
			reverse = reverse + text.charAt(i);
		}
		
		System.out.println("Reverse of the String:" + reverse);
		
		if(reverse.equalsIgnoreCase(text))
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not a Palindrome string");
		}
	}

}

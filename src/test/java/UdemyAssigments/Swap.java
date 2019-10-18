package UdemyAssigments;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		int temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:" + '\n');
		int first = scan.nextInt();
		System.out.println("Enter the second number:" + '\n');
		int second = scan.nextInt();
		temp = first;
		first = second;
		second = temp;
		System.out.println("Numbers after swap:" + " " + first + " " + second);	
		

	}

}

package UdemyAssigments;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		int result=1;
		for (int i=0; i<num; i++)
		{
			result = (num-i)*result;
		}

		System.out.println("Factorial of" + num + "is:" + result);
	}

}

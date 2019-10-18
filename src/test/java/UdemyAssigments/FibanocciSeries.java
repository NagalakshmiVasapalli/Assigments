package UdemyAssigments;

import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) {
		
		int a=0,b=0,c=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int till = scan.nextInt();
		
		System.out.println("Fibonacci Series:");
		for(int i=0;i<=till ; i++)
		{
			a=b;
			b=c;
			c=a+b;
			
		 System.out.print(a + " ");
		}		

	}

}

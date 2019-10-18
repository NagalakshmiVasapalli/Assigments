package UdemyAssigments;

import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,1};
		int arraysize = a.length;
		System.out.println("Size of the ArrayList is" + arraysize);
		for (int i=0; i<arraysize-1; i++)
		{
			for (int j=1; j<arraysize-1 ;  j++)
			{
				if((a[i]==a[j]))
				{
					
				}			
				
				System.out.println(a[i]);
			}
			
		
		}

	}
}

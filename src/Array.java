//import java.util.Scanner;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Size: ");
		int s=sc.nextInt();
		System.out.print("Enter the No: ");
		int a[] = new int [s];
		
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
		}
		//Search number in array
				int b=30;
				int flag=0;
				int i;
				for(i=0;i<a.length;i++)
				{
					if(b==a[i])
					{
						flag++;
						break;
					}
					
				}
				if(flag>=1)
				{
					System.out.println("Element Found at index "+ i);
				}
				else
				{
					System.out.println("Element not Found");
				}
		
		
		/*  
		 * for (int i=0;i<s;i++) 
		 * { System.out.println(a[i]); }
		 */
		
		// EVEN MID
//		int mid = (a[0]+a[s-1])/2;
//		if (mid%2==0)
//		System.out.println(mid+" is even");
//		else
//		System.out.println(mid+" is odd");
		
		// SUM ARRAY
//		int sum=0;
//		for (int i=0;i<s;i++)
//		sum=sum+a[i];
//		System.out.println(sum);
		
		//Largest Num
//		int max=a[0];
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]>max)
//			{
//				max=a[i];
//			}
//
//		}
//		System.out.println(max);
		

		
		
		
		
	}

}

import java.util.Scanner;
public class Amstro {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the No: ");
		int a=sc.nextInt();
		int b=a;
		int d=0;
		int f=a;
		double sum=0;
		int count=0;
		
		while(a!=0)
		{
			d=a%10;
			count++;
			a=a/10;
		}
		
		while(b!=0)
		{
			d=b%10;
			sum=sum+Math.pow(d,count);
			b=b/10;
			
		}
		if(sum==f)
		
			System.out.println("Amstrong");
		
		else
			System.out.println("Not Amstrong");
	}
	

}

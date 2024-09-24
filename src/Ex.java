import java.util.Scanner;

public class Ex {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the A value: ");
		int a = sc.nextInt();
		System.out.print("Enter the B value: ");
		int b = sc.nextInt();
		int result = 0;
		System.out.print("Enter the Operator: ");
		char ch = sc.next().charAt(0);
		
		if (ch=='+')
		{ 
			result=a+b;
			System.out.println(result);
		}
		else if (ch=='-')
		{
			result=a-b;
			System.out.println(result);
		}
		else if (ch=='/')
		{
			result=a/b;
			System.out.println(result);
		}
		else if (ch=='*')
		{
			result=a*b;
			System.out.println(result);
		}
		else
		{
			System.out.println("Invalid");
		}
		
}

}




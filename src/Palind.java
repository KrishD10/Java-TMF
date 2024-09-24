
public class Palind {

	public static void main(String[] args) {
		int a=151;
		int b=a;
		int rev=0;
		int d;
		while(a!=0)
		{
		d= a%10;
		rev=rev*10+d;
		a=a/10;
		}
		if (rev==b)
		
			System.out.println("Palindrome");
			
		else
			System.out.println("Not a plaindrome");
		
	

	}

}

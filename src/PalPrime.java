//import java.util.Scanner;
public class PalPrime {

	public static void main(String[] args) {
		//Scanner sc= new Scanner(System.in);
		int  num = 313;
		int temp = 313;
		int c = 0;
		int rev = 0;
		for (int i =1 ; i <=num; i++)
		{
			if(num % i == 0) 
			{
				c++;
			}
			
		}
           if (c==2)
            {
            	System.out.println("Prime Number");
            }
            else
            {
            	System.out.println("Not a Prime Number");
            }
            while(num != 0)
            {
            	int d = num % 10;
            	rev = rev * 10 + d;   
            	num = num /10;
            }
            System.out.println(rev);
           if(temp == rev && c == 2)
            {
            	System.out.println("Pal Prime Number");
            }
            else
            {
            	System.out.println("Not Pal Prime");
            }
		

	}

}

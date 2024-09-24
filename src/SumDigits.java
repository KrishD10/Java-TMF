import java.util.Scanner;
public class SumDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the no: ");
		int num=sc.nextInt();
		int sum=0;
		int d;
		
		while(num!=0)
		{
			d=num%10;
			sum=sum+d;
			num=num/10;
		}
		System.out.println(sum);

	}

}

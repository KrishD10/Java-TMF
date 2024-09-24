import java.util.Scanner;
public class digitprintln {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the No: ");
		int num=sc.nextInt();
		int d;
		
		while(num!=0)
			
		d=num%10;
		num=num/10;
		System.out.println(num);
			
		
	}
}
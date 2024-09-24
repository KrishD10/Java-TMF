import java.util.Scanner;
public class Naturalnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the No: ");
		int num=sc.nextInt();
		int i;
		int sum=0;
		
		for(i=1;i<=num;i++)
		{
			sum=sum+i;
		}
        System.out.println(sum);
	}

}

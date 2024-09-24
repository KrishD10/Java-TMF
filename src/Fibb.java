
public class Fibb {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n3;
		int i=2;
		int count=0;
		System.out.println(n1);
		System.out.println(n2);
//		for(i=2;i<=6;i++)
//		{
//			n3=n1+n2;
//			n1=n2;
//			n2=n3;
//			count++;
//			System.out.println(n3);
//			
//			
//		}
//		System.out.println("c "+count);
//		
		while(i<=15)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			i++;
			count++;
			System.out.println(n3);
		
		}
		System.out.println("c"+ count);

	}

}

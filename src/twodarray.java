import java.util.*;
public class twodarray {

	public static void main(String[] args) {
		//1
		int A[] = {2,3,4,5,6};
		int B[] = {7,8,4,2,3};
		
		for (int i=0;i<A.length;i++)
		{
			for (int j=0;j<B.length;j++)
			{
				if(A[i]==B[j])
					System.out.println(A[i]);
				}
		}
		
		//2
		int C[]= {50,30,20,10,70};
		Arrays.sort(C);
		System.out.println(C[0]);
		System.out.println(C[C.length-1]);
		
		//3
		int D[]= {5,6,7,8,9};
		int sum=0;
		
		for (int k=0;k<D.length;k++)
		{
			sum=sum +D[k];
			
			
		}
		System.out.println(sum/D.length);
		
		//4
		int E[]= {5,6,7,8,9};
		int value=8;
		int count=0;
		int l;
		
		for (l=0;l<E.length;l++)
		{
			if(E[l]==value)
			{
				System.out.println("Element Found");
				break;
				
			}
			
		}
		System.out.println(E[l]);
		
		//5 
		int F[]= {1,2,2,3,4,4,5};
		
		for(int m=0;m<F.length;m++)
		{
			for(int n=m+1;n<F.length;n++ )
			{
				if(F[m]==F[n])
				{
					System.out.println(F[n]);
				}
			}
		}
		
		//6
		int G[]= {2,3,4,5,6};
		int H[]= {2,3,4,5,6};
		
		
		if(Arrays.equals(G, H))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("N Equal");
		}
		
		int P[][]= {{2,3,4},{5,6,7},{8,9,1}};
		int Q[][]= {{2,3,4},{5,6,7},{8,9,1}};
		
		if(Arrays.equals(P, Q))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("N Equal");
		}
		
		//7 
		
		int ar[]= {1,2,3,5,6,7};
		int sum1=0;
		int total;
		int w;
		
		for(int r=0;r<ar.length;r++)
		{
			sum1 = sum1 + ar[r];
		}
		 w = ar.length+1;
		 total=w*(w+1)/2;
		 
		 System.out.println(total-sum1);
	
		 //9
		 int arr[]= {2,3,4,5,6,7};
		 int sum2=0;
		 
		 for (int s=0;s<arr.length;s++)
		 {
			 sum2 = sum2 + arr[s];
		 }
		 System.out.println(sum2);
		 
		 //10
		 
		 int c[][] = {{1,2,3},{4,5,6},{7,8,9}};
			
			for(int i = 0; i< 3; i++)
			{
				int sumrow = 0;
				int sumcol = 0;
				for(int j = 0; j< 3; j++)
				{
					sumrow = sumrow + c[i][j];
					sumcol = sumcol + c[j][i];
					
				}
				System.out.println("rowwise sum"+ " "+sumrow);
				System.out.println("colwise sum"+ " "+sumcol);
			}
		 
		
		
				
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

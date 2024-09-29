
public class StringEx {

	public static void main(String[] args) {
		
		String s1= "Beautiful The upma is ";
		int i;
		int count=0;
		int res=0;
		
		for (i=0;i<s1.length();i++)
		{
			if(s1.charAt(i) !=' ' )
			{
				count++;
			}
			else
			{
				res=Math.max(count, res);
				count=0;
				
			}
			
		}
		
		System.out.println(Math.max(count, res));
		
		//2 
		
		 String s3 = new String("Hello world new");    //String 1  
	     String s2 = new String(" World");    //String 2  
	     String s4 = String.join("*",s3,s2);   //String 3 to store the result  
	     System.out.println(s4);  //Displays result
	            
	            String s = "palak";
	    		System.out.println(s.concat("rai"));
	    		
	    		
	    		String x = "this is my accademy where i ome daily fr java class";
	    		String y[] = x.split(" ");
	    		System.out.println("n of words"+y.length);
	    		
	    		
	    		
	    		String  k = "this is first program";
	    	       
	    	       String u[]= k.split(" ");
	    	       for(String h :u)
	    	       {
	    	    	   System.out.println(h);
	    	    	   String j = h.replace('i', 'p');
	    	    	   System.out.println(j);
	    	       } 
	    	       
	    	       
	    	       String s7 = "Suma is waste fellow";
	    	       
	    	       String b = s7.substring(5);
	    	       String c =s7.replace('s','*');
	    	       System.out.println("replaced name "+c);
	    	       System.out.println("name "+b);
	    	       String z = s7.replaceAll("[aeiouAEIOU]","*");
	    	      String x1= s7.replace("[aeiou]", "z");
	    	      //System.out.println(x1);
	    	      System.out.println("new_output"+z);

	}

}

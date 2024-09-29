//import java.util.*;

   public class Setget {
	 String name;
	    int age;
	    
	    void setName(String n) 
	    {
	    	name = n;
	    }
	    String getNam()
	    {
	    	return name;
	    }
	    void setAge(int a) 
	    {
	         age= a;
	    }
	    int getAge()
	    {
	    	return age;
	    }
	    
	    
	
	public static void main(String[] args) {
		Setget ob = new Setget();
		ob.setName("palak");
		ob.setAge(30);
		Setget ob2 = new Setget();
		ob2.setName("pal");
		ob2.setAge(20);
		Setget ob3 = new Setget();
		ob3.setName("pk");
		ob3.setAge(10);
		System.out.println(ob.getAge()+ " "+ob.getNam());
		System.out.println(ob2.getAge()+ " "+ob2.getNam());
		System.out.println(ob3.getAge()+ " "+ob3.getNam());
	}

}



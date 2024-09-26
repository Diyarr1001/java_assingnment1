package MODULE1;
import java.util.Scanner;
public class ternary {

	private
	int n1, n2, n3;
	Scanner sc=new Scanner(System.in);
	public
	void get()
	{
		System.out.println("enter n1");
		n1=sc.nextInt();
		System.out.println("enter n2");
		n2=sc.nextInt();
		System.out.println("enter n3");
		n3=sc.nextInt();
	}
	void call()
	{
		if(n1 >= n2 && n1 >= n3) 
		{
			System.out.println("n1 is greater");
		}
		else
			
		    	if(n2 >= n1 && n2 >= n3)
               {
	              System.out.println("n2 is greater");
               }
               else
               {
            	   System.out.println("n3 is greater");
		}
			
			
{
	
}
	}
}

package MODULE1;
import java.util.Scanner;
public class number {

	private int n;
	Scanner sc=new Scanner(System.in);
	public 
	void get()
	{
		System.out.println("enter number between 10 to 20");
		n=sc.nextInt();
	}
	void call()
	{
		if(n>=10 && n<=20)
		{
		    System.out.println("number is between 10 to 20");	
		}
		else
			System.out.println("number is  not between 10 to 20");
			
	}
	
}

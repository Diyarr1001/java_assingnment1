package MODULE1;
import java.util.Scanner;
public class voting {

	private
	int age;
	boolean citizen;
	Scanner sc=new Scanner(System.in);
	public 
	void get()
	{
		System.out.println("enter citizenship yes or no  & enter age");
		age=sc.nextInt();
	}
	void call()
	{
		if(age>=18 )
		{
			System.out.println("eligible for voting");
		}
		else
			System.out.println("not eligible for voting");

	
	}
	void display()
	{
		System.out.println("age="+age);
		//System.out.println("citizen="+citizen);
	}
}

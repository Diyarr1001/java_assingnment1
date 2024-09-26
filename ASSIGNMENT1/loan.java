package MODULE1;
import java.util.Scanner;
public class loan {

	private 
	int age,income;
	public
	Scanner sc=new Scanner(System.in);
	
	void get()
	{
		System.out.println("enter age and income");
		age=sc.nextInt();
		income=sc.nextInt();
	}
	void call()
	{
		if(age>=18 && income>=25000)
		{
			System.out.println("eligible");
		}
		else
			System.out.println("not eligible");

	
	}
	void display()
	{
		System.out.println("age="+age);
		System.out.println("income="+income);
	}
}

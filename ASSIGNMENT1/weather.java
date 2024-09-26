package MODULE1;
import java.util.Scanner;
public class weather {

	private int temp;
	boolean raining=false;
	Scanner sc=new Scanner(System.in);
	public 
	void get()
	{
		System.out.println("enter temperature between 20°C to 30°C");
		temp=sc.nextInt();
		System.out.println("is it raining(true/false)");
		raining=sc.nextBoolean();
	}
	void call()
	{
		if(temp>=20 && temp<=30 && !raining)
		{
			System.out.println("whether is safe to go outside");
		}
		else
			System.out.println("whether is not safe to go outside");
			
	}
}

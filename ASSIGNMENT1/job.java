package MODULE1;
import java.util.Scanner;
public class job {

	private
	boolean degree=true;
	boolean experience=true;
	boolean criminalrecord=false;
	Scanner sc=new Scanner(System.in);
	public 
	void get()
	{
		System.out.println(" person having degree(true/false)");
		degree=sc.nextBoolean();
		System.out.println("person having experience(true/false)");
		experience=sc.nextBoolean();
		System.out.println("person having criminal record(true/false)");
		criminalrecord=sc.nextBoolean();
		
	}
	void call()
	{
		if(degree && experience && criminalrecord)
		{
			System.out.println(" a person is eligible for a job");
		}
		else
			System.out.println(" a person is  not eligible for a job");
	}
}

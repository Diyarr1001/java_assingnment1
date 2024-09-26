package MODULE1;
import java.util.Scanner;
public class exam {
private
int average,score1,score2,score3;
Scanner sc=new Scanner(System.in);

public 
void get()
{
	System.out.println("enter  score, score 1,score 2 & score 3");
	
	score1=sc.nextInt();
	score2=sc.nextInt();
	score3=sc.nextInt();

	
}
void call()
{
	//System.out.println("avergae="+average);
	
	//average=(score1+score2+score3)/3;
	if((average>=60) && (score1>=40 && score2>=40 && score3>=40))
	{
		System.out.println("fail");
	}
	else 
		System.out.println("pass");
}
	void display()
	{
		
		System.out.println("scaore1="+score1);
		System.out.println("score2="+score2);
		System.out.println("score3="+score3);
		
		
	}
}

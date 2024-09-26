package MODULE1;
import java.util.Scanner;
public class doorcontrol {

	private
	boolean id=true;
	boolean accesscard=true;
	boolean admin=true;
	 Scanner sc=new Scanner(System.in);
	 public
	 void get()
	 {
		 System.out.println(" valid id card(true/false)");
		 id=sc.nextBoolean();
		 System.out.println("valid access card(true/false)");
		 accesscard=sc.nextBoolean();
		 System.out.println("is admin(true/false)");
		 admin=sc.nextBoolean();
	 }
	 void call()
	 {
		 if((id && accesscard )|| (admin))
		 {
			 System.out.println("access granted");
			 
		 }
		 else
			 System.out.println("access denied");
	 }
	
}

package pack1;
import java.util.ArrayList;
import java.util.Scanner;
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean K=true;
		Scanner s=new Scanner(System.in);
		ArrayList <String>al=new ArrayList();
		while(K)
		{
			System.out.print("Name : ");
			al.add(s.nextLine());
			System.out.print("Enter y for more\nEnter n to stop.");
		    String ch=s.nextLine();
		    switch(ch)
		    {
		    case "n":
		    	K=false;
		    	break;
		    	default:
		    		
		    		break;
		    }
		}
		System.out.println(al);
		System.out.println("3rd inder = "+al.get(2));
	}

}

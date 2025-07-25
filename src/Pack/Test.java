package Pack;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		ArrayList <String>al=new ArrayList();
		for(int i=0;i<3;i++){
			System.out.print("Name : ");
			al.add(s.nextLine());
		}
		
		System.out.println(al);
		System.out.println(al.get(0));
	}
}

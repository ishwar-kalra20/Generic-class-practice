public class Demo <Y,K>{
	
	void fun1(Y a)
	{
		System.out.println(a);
	}
	void fun2(K a)
	{
		System.out.println(a);
	}
	void fun3(Y a,K b)
	{
		System.out.println(a+" "+b);
		//System.out.println(b);
	}
	
public static void main(String arg[]){

	Demo d=new Demo();
	d.fun1("sv");
	d.fun2(4);
	d.fun3("asd", 132);
	Demo<Integer,Double>d1=new Demo();
	d1.fun3(4, 3.3);
	
}
}

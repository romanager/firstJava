import java.util.*;

class HelloWorld 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello, XXI Century World!");
		System.out.println(new Date());
		String A = "text";
		String B = "text";
		String C = new String("text");
		
		if (A == B)
		{
			System.out.println("It is true");
		}
		else
		{
			System.out.println("It is false");
		}

		System.out.println();

		if (A == C)
		{
			System.out.println("It is true");
		}
		else
		{
			System.out.println("It is false");
		}
	}
}
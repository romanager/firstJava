class Art
{
	Art()
	{
		System.out.println("Constructor Art");
	}
}

class Drawing extends Art
{
	Drawing()
	{
		System.out.println("Constructor Drawing");		
	}
}

public class Cartoon extends Drawing
{
	Cartoon()
	{
		System.out.println("Constructor Cartoon");
	}
	public static void main(String[] args)
	{
		Cartoon x = new Cartoon();
	}
}
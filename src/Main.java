
public class Main 
{
	public static void main(String[] args)
	{	
		Calculator calc = new Calculator();

		//feature #1 출력 기능
		System.out.println( calc.add(20, 10) );
		System.out.println( calc.sub(20, 10) );
		System.out.println( calc.mult(20, 10) );
		System.out.println( calc.div(20, 10) );
		
	}
}

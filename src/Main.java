
public class Main 
{
	public static void main(String[] args)
	{	
		Calculator calc = new Calculator();

		System.out.println( calc.add(20, 10) );
		System.out.println( calc.sub(20, 10) );
		System.out.println( calc.mult(20, 10) );
		System.out.println( calc.div(20, 10) );
		
		System.out.println( calc.convertDecimalToHex(11));
		System.out.println( calc.convertDecimalToHex(16));
		System.out.println( calc.convertDecimalToHex(44));
		System.out.println( calc.convertDecimalToHex(256));
		System.out.println( calc.convertDecimalToHex(300));
	}
}

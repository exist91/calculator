
public class Main 
{
	public static void main(String[] args)
	{	
		Calculator calc = new Calculator();

		//feature #1 출력 기능
		System.out.println( calc.MyAdd(20, 10) );
		System.out.println( calc.MySub(20, 10) );
		System.out.println( calc.MyMult(20, 10) );
		System.out.println( calc.MyDiv(20, 10) );
		
	}
}

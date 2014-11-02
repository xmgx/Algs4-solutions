
public class ex_1_1_5 {

	public static void main(String[] args)
	{ 
		double a, b;
		a = StdIn.readDouble();
		b = StdIn.readDouble();
		
		if (a > 0 && a < 1 && b > 0 && b < 1) StdOut.print("true");
		else StdOut.print("false");
	}
}
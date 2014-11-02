
public class ex_1_1_9 {
	
	public static void main(String args[])
	{ //Binary representation of n integer number
		
		int N = 5;
		String s = "";
		for (int n = N; n > 0; n /= 2)
			s = (n % 2) + s;
		StdOut.println(s);
	}

}

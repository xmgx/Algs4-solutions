
public class ex_1_1_14 {
	
	public static void main(String args[])
	{
		int N = 32000;
		int x = lg(N);
		StdOut.print(x);
		
	}
	
	public static int lg(int N)
	{
		int i = 0;
		int x = 2;
		while (x <= N) {
			x *= 2;
			i++;
		}	
		return i;
	}

}


public class ex_1_1_11 {

	public static void main(String args[])
	{
		int N = 16; //Size of the square table
		
		//Create numbers for columns - first column blank
		StdOut.print("   ");
		for (int i = 1; i <= N; i++)
			if (i < 10) StdOut.printf("%d  ", i);
			else StdOut.printf("%d ", i);
		
		for (int i = 1; i <= N; i++) {
			if (i < 10) StdOut.printf("\n%d  ", i);
			else StdOut.printf("\n%d ", i);
			for (int j = 1; j <= N; j++) {
				if (i <= j) StdOut.print("*  ");
				else StdOut.printf("   ");
			}
		}
		
	}
}

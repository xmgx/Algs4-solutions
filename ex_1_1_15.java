
public class ex_1_1_15 {
	
	public static void main(String args[])
	{
		int N = 10000; //size of the a array
		int[] a = new int[N];
		for (int i = 0; i < N; i++)
			a[i] =  StdRandom.uniform(N);
		
		//execute the function:
		int M = N;
		int[] b = new int[M];
		b = histogram(a, M);
		
		//Display the results:
		for (int i = 0; i < N; i++)
			StdOut.printf("%d ", a[i]);
		StdOut.println();
		for (int i = 0; i < M; i++)
			StdOut.printf("%d ", b[i]);
		

	}

	public static int[] histogram(int[] a, int M) 
	{
		int[] b = new int[M];
		for (int i = 0; i < M; i++)
			b[a[i]]++;
		return b;
	}
}

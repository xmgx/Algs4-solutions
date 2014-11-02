
public class ex_1_1_13 {
	
	public static void main(String args[])
	{
		
		int N = 9;
		int M = 4; 
		int[][] A = new int[9][9];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++){
				A[i][j] = i;
			}
		}
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++){
				StdOut.print(A[j][i]);
			}
			StdOut.printf("\n");
		}

	}
}

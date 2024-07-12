package demo;

public class Print_Diagonal {

	static void printPrincipalDiagonal(int mat[][], int n)
	{
		System.out.print("Principal Diagonal: ");
		int sum=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i == j)
				{
					System.out.print(mat[i][j] + ", ");
					sum= sum+mat[i][j];
				}
			}
		}
		System.out.println();
		System.out.println("sum = "+ sum);
	}

	static void printSecondaryDiagonal(int mat[][], int n)
	{
		System.out.print("Secondary Diagonal: ");
		int sum=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if ((i + j) == (n - 1)) 
				{
					System.out.print(mat[i][j] + ", ");
					sum= sum+mat[i][j];
				}
			}
		}
		System.out.println();
		System.out.println("sum = "+ sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int a[][] = { { 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 1, 4, 3, 4 },
				{ 5, 6, 7, 8 } };
		printPrincipalDiagonal(a, n);
		printSecondaryDiagonal(a, n);
		

	}

}

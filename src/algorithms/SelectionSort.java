package algorithms;

public class SelectionSort {

	public static void main(String[] args) {

		int [] A = {5,7,2,9,6,1,3,7};

		selectionsort(A, 7);

		for (int i : A) {
			System.out.print(i + ", ");
		}

	}

	public static int [] selectionsort(int [] A,int n)
	{
		int tmp;
		int min;

		for(int i=0; i < n-1; i++)
		{
			min=i;

			for(int j=i; j < n; j++)
			{
				if (A[j] < A[min]){

					min=j;
				}

			}
			tmp=A[i];
			A[i]=A[min];
			A[min]=tmp;
		}
		return A;
	}

}
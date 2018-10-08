package algorithms;

public class QuickSort {

	public static void main(String[] args) {

		int [] A = {5,7,2,9,6,1,4,7};

		quickSort(A, 0, 7);

		for (int i : A) {
			System.out.print(i + ", ");
		}
	}

	public static void quickSort(int A[],int p, int r)
	{
		int q;
		if(p<r)
		{
			q=partition(A,p, r);
			quickSort(A,p, q-1);
			quickSort(A,q+1, r);
		}
	}

	public static int partition(int A[],int p, int r){
		int tmp;
		int x = A[r];
		int i = p-1;

		for(int j=p; j<=r-1; j++)
		{
			if(A[j]<=x)
			{
				i++;
				tmp=A[i];
				A[i]=A[j];
				A[j]=tmp;
			}
		}
		tmp=A[i+1];
		A[i+1]=A[r];
		A[r]=tmp;
		return i+1;
	}

}

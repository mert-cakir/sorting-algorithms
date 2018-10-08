package algorithms;

public class BubbleSort {

	public static void main(String[] args) {

		int [] A = {5,1,4,2,8};

		bubblesort(A);

		for (int i : A) {
			System.out.print(i + ", ");
		}
	}

	public static void bubblesort(int [] A)
	{

		int tmp;

		for(int i=0; i<A.length; i++)
		{
			for(int j=A.length-1 ; j>i;j--)
			{
				if(A[j-1]>A[j])
				{
					tmp=A[j-1];
					A[j-1]=A[j];
					A[j]=tmp;
				}
			}
		}
	}

}

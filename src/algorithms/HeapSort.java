package algorithms;

public class HeapSort {

	public static void main(String[] args) {

		int [] A = {5,12,20,18,4,3};

		heapsort(A, A.length);

		for (int i : A) {
			System.out.print(i + ", ");
		}

	}

	public static void heapsort(int[]A, int heapsize){
		int tmp;
		BuildHeap(A);
		for(int i = A.length-1; i>=0; i--)
		{
			tmp=A[0];
			A[0]=A[i];
			A[i]=tmp;
			heapsize = heapsize -1 ;
			heapify(A,0);

		}
	}

	public static void heapify(int[]A,int i)
	{

		int heapsize = A.length -1 ;
		int largest = 0;
		int le=left(i);
		int ri=right(i);
		if((le<=heapsize) && (A[le]>A[i]))
			largest = le;
		else
			largest = i;
		if((ri<=heapsize) && A[ri]>A[largest])
			largest = ri;

		if (largest != i) {
			int tmp = A[i];
			A[i]= A[largest];
			A[largest] = tmp;
			heapify(A, largest);
		}
	}

	public static int left(int i ){
		return 2*(i+1)-1;
	}

	public static int right(int i){
		return 2*(i+1);
	}

	public static void BuildHeap(int[]A){

		for(int i=0; i<Math.floor(A.length/2); i++)
		{
			heapify(A,i);
		}
	}

}


public class InsertionSort {
	
	public static void insertion(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > current) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = current;
			for(int k:arr) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 29, 14, 15, 94};
		InsertionSort.insertion(arr);

	}

}

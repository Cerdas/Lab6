
public class SelectionSort {

	public static void selection(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int current = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[current]) {
					current = j;
				}
			}
			int temp = arr[current];
			arr[current] = arr[i];
			arr[i] = temp;
			for(int k = 0; k<arr.length;k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 29, 14, 15, 94};
		SelectionSort.selection(arr);

	}

}


public class BinarySearch {

	public static int binarySearch(int arr[], int a, int b, int x) {
		if (b >= 1) {
			int mid = a + (b - a) / 2;
			if (arr[mid] == x) {
				return arr[mid];
			}
			if (arr[mid] > x) {
				System.out.println(arr[a] + " " + arr[mid] + " " + arr[b]);
				return binarySearch(arr, a, mid - 1, x);
			}
			else {
				System.out.println(arr[a] + " " + arr[mid] + " " + arr[b]);
				return binarySearch(arr, mid + 1, b, x);			}
			}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 14, 15, 24, 55, 59, 73, 90, 94, 99 };
		int n = arr.length;
		int x = 73;
		System.out.println(binarySearch(arr, 0, n -1, x));

	}

}

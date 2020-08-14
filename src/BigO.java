import java.util.Scanner;

public class BigO {

	public static int bigO(int value) {
		int count = 0;
		for (int i = 1; i <= value; i++) {
			for (int j = 1; j <= value; j++) {
				for (int k = 1; k <= value; k++) {
					count++;
				}
			}
		}
		return count;
	}

	public static int foo(int N) {
		int result = 0;
		for (int i = 0; i < N; i++)
			result++;
		for (int j = 0; j < 1000000; j++)
			result += j;

		return result;
	}

	public static int bar(int N) {
		int result = 1;
		for (int i = 1; i < N; i *= 2)
			result += 2;

		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value and get the O(N^3) in return: ");
		int value = scan.nextInt();
		System.out.println(bigO(value));
		System.out.println(foo(value));
		System.out.println(bar(value));
		scan.close();
	}
}
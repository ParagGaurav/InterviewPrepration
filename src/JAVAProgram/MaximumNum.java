package JAVAProgram;

public class MaximumNum {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7 };

		int b = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {

			if (a[i] > b) {

				b = a[i];

			}

		}
		int h = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {

			if (a[i] > h && b != a[i]) {

				h = a[i];

			}
		}

		System.out.println(h);
	}
	
	

}

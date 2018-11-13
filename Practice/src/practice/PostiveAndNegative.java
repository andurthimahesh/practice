package practice;

public class PostiveAndNegative {
	public void postivenegative(int[] ar) {

		int a = 0;
		int b = 0;
		int length1 = 0;
		int length2 = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > 0) {
				a++;

			} else {
				b++;
			}
		}

		int postive[] = new int[a];
		int negative[] = new int[b];
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] > 0) {
				postive[length1] = ar[i];
				length1++;

			} else {
				negative[length2] = ar[i];
				length2++;
			}

		}
		for (int j = 0; j < postive.length - 1; j++) {
			System.out.print(postive[j] + " ");
		}
		System.out.println();
		for (int k = 0; k < negative.length - 1; k++) {
			System.out.print(negative[k] + " ");
		}
	}

	public static void main(String[] args) {
		int a[] = { -33, 1, 6, 8, -1, -8, 27, -44 };
		PostiveAndNegative pn = new PostiveAndNegative();
		pn.postivenegative(a);

	}

}

package ArrayList;

public class array_2dimensionen {

	public static void main(String[] args) {
		// int[][] ifeld = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] ifeld = new int[3][6];
		for (int i = 0; i < ifeld.length; i++) {
			for (int j = 0; j < ifeld[i].length; j++) {
				ifeld[i][j] = i * ifeld.length + j + 1;
				System.out.println();
			}
		}

		System.out.println("\nMehrdimensionales Array");
		for (int[] iZeile : ifeld) {
			for (int i : iZeile)
				System.out.print(i + "*");
			System.out.println();
		}

	}

}

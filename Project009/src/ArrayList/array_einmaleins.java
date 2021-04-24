package ArrayList;

public class array_einmaleins {

	public static void main(String[] args) {
		int[][] ifeld = new int[5][5];
		for (int i = 0; i < ifeld.length; i++) {
			for (int j = 0; j < ifeld[i].length; j++) {
				ifeld[i][j] = (i + 1) * (j + 1);
			}
		}

		System.out.println("\nMehrdimensionales Array");
		for (int i = 0; i < ifeld.length; i++) {
			for (int j = 0; j < ifeld[i].length; j++)
				System.out.printf("%2d*%2d=%3d ", i + 1, j + 1, ifeld[i][j]);
			System.out.println();
		}

	}

}

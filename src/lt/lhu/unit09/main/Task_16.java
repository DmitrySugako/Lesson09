package lt.lhu.unit09.main;

public class Task_16 {

	public static void main(String[] args) {
		int[][] mas = new int[10][10];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					mas[i][j] = (i + 1) * (j + 2);
				}
				System.out.printf("[%3d]", mas[i][j]);
			}
			System.out.println();
		}
	}
}
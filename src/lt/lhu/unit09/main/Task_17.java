package lt.lhu.unit09.main;

public class Task_17 {

	public static void main(String[] args) {
		int[][] mas = new int[10][10];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == 0 || j == 0 || i == mas.length - 1 || j == mas.length - 1) {
					mas[i][j] = 1;
				}
				System.out.printf("[%1d]", mas[i][j]);
			}
			System.out.println();
		}
	}
}

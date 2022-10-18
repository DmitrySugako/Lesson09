package lt.lhu.unit09.main;

public class Task_22 {

	public static void main(String[] args) {
		int mas[][] = new int[10][10];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = i + j + 1;
				System.out.printf("[%2d]", mas[i][j]);
			}
			System.out.println();
		}
	}
}
package lt.lhu.unit09.main;

import java.util.Random;

public class Task_09 {

	public static void main(String[] args) {

		int[][] mas = new int[5][5];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = arrayFiling();
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					System.out.println(mas[i][j]);
				}
			}
		}
	}

	public static int arrayFiling() {
		Random rand = new Random();
		int x = rand.nextInt(1000);
		if (x % 2 == 0) {
			x = -x;
		}
		return x;
	}
}

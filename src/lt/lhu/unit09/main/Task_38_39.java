package lt.lhu.unit09.main;

import java.util.Random;

public class Task_38_39 {

	public static void main(String[] args) {
		int[][] mas = new int[5][5];
		int[][] array = new int[5][5];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = arrayFiling();
				array[i][j] = arrayFiling();
				System.out.printf("[%3d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("(%3d)", array[i][j]);
			}
			System.out.println();
		}
		System.out.println("SUM=");
		int[][] sum = new int[5][5];
		int[][] multiply = new int[5][5];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				sum[i][j] = mas[i][j] + array[i][j];
				multiply[i][j] = mas[i][j] * array[i][j];
				System.out.printf("{%4d}", sum[i][j]);
			}
			System.out.println();
		}
		System.out.println("MULTIPLY=");
		for (int i = 0; i < multiply.length; i++) {
			for (int j = 0; j < multiply[i].length; j++) {
				System.out.printf("{%5d}", multiply[i][j]);
			}
			System.out.println();
		}

	}

	public static int arrayFiling() {
		Random rand = new Random();
		int x = rand.nextInt(100);
		if (x % 2 == 0) {
			x = -x;
		}
		return x;
	}
}

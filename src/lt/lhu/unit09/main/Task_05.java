//5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.
package lt.lhu.unit09.main;

import java.util.Random;

public class Task_05 {

	public static void main(String[] args) {
		int[][] mas = new int[7][7];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = arrayFilling();
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		for (int i = 1; i < mas.length; i += 2) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
	}

	public static int arrayFilling() {
		Random rand = new Random();
		int x = rand.nextInt(1000);
		if (x % 2 == 0) {
			x = -x;
		}
		return x;
	}
}

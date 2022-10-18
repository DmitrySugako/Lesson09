// 6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
package lt.lhu.unit09.main;

import java.util.Random;

public class Task_06 {

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

		for (int j = 0; j < mas[0].length; j += 2) {
			if (mas[0][j] > mas[mas.length - 1][j]) {
				for (int i = 0; i < mas.length; i++) {
					System.out.printf("[%4d]\n", mas[i][j]);
				}
				System.out.println();
			}
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

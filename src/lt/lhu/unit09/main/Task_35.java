//35. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
package lt.lhu.unit09.main;

import java.util.Random;

public class Task_35 {

	public static void main(String[] args) {
		int[][] mas = new int[5][5];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = arrayFilling();
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		maxElement(mas);
		System.out.println("Max= " + maxElement(mas));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] % 2 != 0) {
					mas[i][j] = maxElement(mas);
				}
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
	}

	public static int maxElement(int array[][]) {
		int max = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (max < array[i][j]) {
					max = array[i][j];
				}
			}
		}

		return max;
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

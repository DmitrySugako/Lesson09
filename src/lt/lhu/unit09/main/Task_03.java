// 3. Дана матрица. Вывести на экран первый и последний столбцы.
package lt.lhu.unit09.main;

import java.util.Random;

public class Task_03 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[][] mas = new int[5][5];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(1000);
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		for (int i = 0, j = 0; i < mas.length; i++) {
			System.out.printf("[%4d]", mas[i][0]);
			System.out.printf("[%4d]", mas[i][mas.length - 1]);
			System.out.println();
		}

	}

}

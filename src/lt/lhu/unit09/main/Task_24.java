package lt.lhu.unit09.main;

import java.util.Scanner;

public class Task_24 {

	public static void main(String[] args) {
		System.out.println("Enter n:");
		int n = scan();
		System.out.println("Enter x:");
		int x = scan();
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) Math.pow(x, i + 1);
				System.out.printf("[%5d]", mas[i][j]);
			}
			System.out.println();
		}

	}

	public static int scan() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		return x;
	}
}
package lt.lhu.unit09.main;

import java.util.Scanner;

public class Task_12 {

	public static void main(String[] args) {
		int n = scan();
		int[][] mas = new int[n][n];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					mas[i][j] = i;
				}
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}

	}

	public static int scan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matrix size");
		int x = sc.nextInt();
		return x;
	}

}

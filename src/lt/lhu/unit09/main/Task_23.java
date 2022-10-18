package lt.lhu.unit09.main;

import java.util.Scanner;

public class Task_23 {

	public static void main(String[] args) {
		int n = scan();
		int count = 0;
		double[][] mas = new double[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
				System.out.printf("[%.2f]", mas[i][j]);
				if (mas[i][j] > 0) {
					count++;
				}
			}
			System.out.println();
		}
		System.out.println("count="+count);
	}

	public static int scan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matrix size");
		int x = sc.nextInt();
		return x;
	}
}
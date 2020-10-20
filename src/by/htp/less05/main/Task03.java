package by.htp.less05.main;

/*3. Дана последовательность действительных чисел а1 а2 ,..., аn . 
* Выяснить, будет ли она возрастающей.*/

import java.util.Random;
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		int j = 0;
		int n;
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите длинну последовательности:");
		while (!sc.hasNextInt()) {
			sc.next();
		}

		n = sc.nextInt();
		int[] mas = new int[n];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rd.nextInt(5);
			System.out.print(mas[i] + " ");
		}
		
		int max = mas[0];
		System.out.println();
		
		for (int i = 1; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
				j++;
			}
		}
		
		if (j == (n - 1)) {
			System.out.print("Последовательность возрастающая.");
		} else {
			System.out.print("Последовательность не возрастающая.");
		}

	}

}

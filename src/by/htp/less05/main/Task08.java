package by.htp.less05.main;

/*8. Даны целые числа а1 ,а2 ,..., аn . 
Вывести на печать только те числа, для которых аi > i.*/

import java.util.Random;
import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {

		int n;
		// int i;
		int numb = 0;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.print("Введите количество элементов в последовательности:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		n = sc.nextInt();

		int[] mas = new int[n];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rd.nextInt(10);
			System.out.print(mas[i] + " ");

		}

		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				System.out.print(mas[i] + " ");

			}
		}

	}

}

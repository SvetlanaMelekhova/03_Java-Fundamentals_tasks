package by.htp.less05.main;

/*4. Дана последовательность натуральных чисел а1 , а2 ,..., ап. 
Создать массив из четных чисел этой последовательности.
Если таких чисел нет, то вывести сообщение об этом факте.*/

import java.util.Random;
import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		int n;
		int sum = 0;

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите длинну последовательности:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		n = sc.nextInt();

		int[] mas = new int[n];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rd.nextInt(1000);
			System.out.print(mas[i] + " ");
			if (mas[i] % 2 == 0) {
				sum = sum + 1;
			}
		}
		System.out.println();

		int[] mas2 = new int[sum];
		int j = 0;
		if (sum > 0) {
			for (int i = 0; i < mas.length; i++) {
				if (mas[i] % 2 == 0) {

					mas2[j] = mas[i];
					System.out.print(mas2[j] + " ");
					j++;
				}

			}

		} else {

			System.out.print("В данной последовательности нет четных элементов.");
		}
	}
}

package by.htp.less05.main;
/*6. Дана последовательность действительных чисел а1 ,а2 ,..., ап. 
Заменить все ее члены, большие данного Z, этим числом.
Подсчитать количество замен.*/

import java.util.Random;
import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		int n;
		int Z;
		int numb = 0;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.print("Введите количество элементов в последовательности:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		n = sc.nextInt();

		int[] mas = new int[n];

		System.out.print("Введите число Z:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		Z = sc.nextInt();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rd.nextInt(1000);
			// System.out.print(mas[i] + " ");
			if (mas[i] > Z) {
				mas[i] = Z;
				numb = numb + 1;
			}
		}
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		
		System.out.println();
		System.out.print("Количество замен = " + numb);
	}

}

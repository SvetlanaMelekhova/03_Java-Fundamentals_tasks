package by.htp.less05.main;

import java.util.Scanner;
import java.util.Random;

public class Task10 {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.print("Введите длину последовательности, кратную 2:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		n = sc.nextInt();
		
		int[] mas = new int[n];
		for (int i = 0; i<mas.length; i++) {
			mas[i]=rd.nextInt(100);
			System.out.print(mas[i] + " ");
		}
		System.out.println();
		int max=mas[0];
		
		for (int i=0, j = mas.length-1; i<mas.length/2; i++, j--) {
			mas[i]=mas[i]+mas[j];
			System.out.print(mas[i]+ " ");
			
			if (mas[i]>max) {
				max=mas[i];
			}
			
		}
		System.out.println();
		System.out.print("Максимальное значение в последовательности - " + max);
	}

}

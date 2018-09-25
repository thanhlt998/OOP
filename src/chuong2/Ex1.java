package chuong2;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		int h;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Nhap vao so nguyen h voi 2 <= h <= 10: ");
			h = Integer.parseInt(scanner.nextLine());
		}
		while(h < 2 || h > 10);
		
		for(int i = 1; i <= h; i++) {
			for(int j = 0; j < h - i; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j < 2 * i - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

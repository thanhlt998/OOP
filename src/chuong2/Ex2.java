package chuong2;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Nhap vao so nguyen n voi 3 <= n <= 8: ");
			n = Integer.parseInt(scanner.nextLine());
		}
		while(n < 3 || n > 8);
		
		int[][] array = new int[n][n];
		
		int top = 0, left = 0, right = n - 1, bottom = n - 1;
		int number = 1;
		while (left <= right && top <= bottom) {
			
			for(int i = left; i <= right; number++, i++) {
				array[top][i] = number;
			}
			top++;
			
			for(int i = top; i <= bottom; number++, i++) {
				array[i][right] = number;
			}
			right--;
			
			for(int i = right; i >= left; number++, i--) {
				array[bottom][i] = number;
			}
			bottom--;
			
			for(int i = bottom; i >= top; number++, i--) {
				array[i][left] = number;
			}
			left++;
			
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

package chuong2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		ArrayList<Integer> numList = new ArrayList<>();
		
		System.out.print("Nhap so n tu ban phim: ");
		n = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Nhap " + n + " so tu ban phim: ");
		
		for(int i = 0; i < n; i++) {
			numList.add(new Integer(Integer.parseInt(scanner.nextLine())));
		}
		
		System.out.println("Danh sach ban nhap: ");
		for(Integer num: numList) {
			System.out.print(num + " ");
		}
		
		int choice;
		do {
			System.out.println("Nhap vao lua chon sap xep: \n1. Tang dan\n2. Giam dan");
			choice = Integer.parseInt(scanner.nextLine());
		}
		while(choice != 1 && choice != 2);
		
		if(choice == 1) {
			Collections.sort(numList);
		}
		else {
			Collections.sort(numList, (num1, num2) -> {
				if(num1 == num2) {
					return 0;
				}
				else if(num1 <= num2) {
					return 1;
				}
				else return -1;
			});
		}
		
		System.out.println("Day sau khi sap xep: ");
		for(Integer num: numList) {
			System.out.print(num + " ");
		}
	}
}

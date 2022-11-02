package chapter6;

import java.util.Scanner;

public class FunStarPrint {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("자연수 n을 입력하세요");
		int n = scan.nextInt();
		StarPrint(n);
	}
	public static void StarPrint(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

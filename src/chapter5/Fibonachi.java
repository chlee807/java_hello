package chapter5;

import java.util.Scanner;

public class Fibonachi {
	public static void main(String[]args) {
		long f_n = 1;
		long f_n_1 = 1;
		long temp;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 번째 항까지를 출력할지 입력하세요");
		int k = scan.nextInt();
		
		if (k == 1 || k == 2) {
			for (int i = 1; i <= k; i++) {
				System.out.println(i+"번째 항은 1입니다");
			}
		} else {
			for (int i = 1; i <= 2; i++) {
				System.out.println(i+"번째 항은 1입니다");
			}
			for (int i = 3; i <= k; i++) {
				temp = f_n_1;
				f_n_1 = f_n + f_n_1;
				f_n = temp;
				System.out.println(i+"번째 항은 "+f_n_1+"입니다");
			}
		}
	}
}

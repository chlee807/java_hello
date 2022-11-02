package chapter5;

public class Star3 {
	public static void main(String[]args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4+i; j++) {
				if (j <= 5-i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

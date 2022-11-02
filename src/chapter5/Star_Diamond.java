package chapter5;

public class Star_Diamond {
	public static void main(String[]args) {
		int n = 5;
		int l = 2*n-1;
		for (int i = 1; i <= l; i++) {
			if (i <= n) {
				for (int j = 1; j <= n-1+i; j++) {
					if (j <= n-i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			} 
			else {
				for (int j = 1; j <= l-(i-n); j++) {
					if (j <= (i-n)) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
	}
}

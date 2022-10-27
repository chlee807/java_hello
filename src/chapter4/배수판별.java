package chapter4;

public class 배수판별 {
	public static void main(String[]args) {
		/*
		 * int n = 77; if (((n % 7) == 0) && ((n % 11) == 0)) {
		 * System.out.println(n+"은 7의 배수 이고 11의 배수입니다"); } boolean bool = ((n % 2 == 0)
		 * && (n % 7 == 0) && (n % 11 == 0));
		 * System.out.println(n+"은 짝수이며 7의 배수이며 11의 배수인가? : "+bool);
		 */
		int num1 = 0;
		int num2 = 0;
		boolean result;
		result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
		System.out.println("result = "+result);
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		
		result = ((num1 += 10) > 0) || ((num2 += 10) > 0);
		System.out.println("result = "+result);
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
	}
}

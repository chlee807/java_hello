package chapter5;

public class CondOp {
	public static void main(String[]args) {
		int num1 = 50;
		int num2 = 100;
		
		int big;
		int diff;
		
		big = (num1 > num2) ? num1 : num2;
		
		/*
		 * if (num1 > num2) { big = num1; } else { big = num2; }
		 */
		
		System.out.println("큰수:"+big);

		/* diff = Math.abs(num1-num2); */
		diff = (num1 > num2) ? num1-num2 : num2 - num1;
		System.out.println("차이:"+diff);
	}
}

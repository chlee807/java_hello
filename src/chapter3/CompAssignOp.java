package chapter3;

public class CompAssignOp {
	public static void main(String[]ars) {
		/*
		 * char ch = 32; short sh = 100; int result = ch + sh;
		 * System.out.println((char)result); System.out.println(ch);
		 */ 
		
		
		/*
		 * float fl = 0.8f; long l = 10L; float result = fl + l;
		 * System.out.println(result);
		 */ 
		
		
		/*
		 * char sh1 = 'A'; short sh2 = 1; char sh3 = (char) (sh1+sh2);
		 * System.out.println(sh3);
		 */
		
		/*
		 * int a = 3; int b = 4; double c = (double)a/b; System.out.println(c);
		 */
		
		/*
		 * int kor,eng,math; int total; double avg;
		 * 
		 * kor = 80; eng = 73; math = 95;
		 * 
		 * total = kor+eng+math; avg = total/3.0;
		 * 
		 * System.out.println(total); System.out.println(avg);
		 */
		
		short num = 10;
		num = (short)(num+77L);		// 형 변환 필요
		int rate = 3;
		rate = (int)(rate * 3.5);	// 형 변환 필요
		System.out.println(num);
		System.out.println(rate);
		
		// 복합대입연산자에 한해서는 형 변환이 필요하지 않다
		num = 10;
		num += 77L;		// 형 변환 필요하지 않다
		rate = 3;
		rate *= 3.5;	// 형 변환 필요하지 않다
		System.out.println(num);
		System.out.println(rate);
	}
}

package chapter5;

public class Mul{
	public static void main(String[]args) {
        int k = 25;
        int cnt = 0;
        int target = 0;
    	for (int i = 1; i <= 1000; i++) {
        	if (i % 3 == 0 && i % 5 == 0) {
            	cnt++;
                if (cnt == k) {
                	target = i;
                    break;
                }
            }
        }
        System.out.println(target);
    }
}

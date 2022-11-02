package chapter5;

public class Star4{
	public static void main(String[]args) {
    	for(int i = 1; i <= 4; i++) {
        	int cnt = 0;
        	for(int j = 1; j <= 2*(4-i)+1; j++) {
            	System.out.print("*");
                cnt++;
            }
            System.out.println("("+cnt+")");
        }
    }
}

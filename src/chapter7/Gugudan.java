package chapter7;

public class Gugudan{
	void printGugu(int n) {
    	for(int i = 1; i <= n; i++) {
        	for(int j = 1; j <= 9; j++) {
            	System.out.println(i+" * "+j+" = "+(i * j));
            }
            System.out.println();
        }
    }
}

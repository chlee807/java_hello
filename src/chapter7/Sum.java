package chapter7;

public class Sum {
	int num;
	
	public Sum(int num){
		this.num = num;
	}
	
	int sumNum() {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum +=i;
		}
		return sum;
	}
}

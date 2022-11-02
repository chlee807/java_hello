package chapter7;

public class StarPrint {
	int num;
	
	StarPrint(){
		
	}
	
	StarPrint(int num){
		this.num = num;
	}
	
	void getPrint() {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void getPrint(int num) {
		for (int i = 1; i <= num; i++) {	//num 대신 this.num을 넣으면 매개변수대신 객체의 num을 사용한다.
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

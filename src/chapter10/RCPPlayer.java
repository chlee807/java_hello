package chapter10;

import java.util.Scanner;

public class RCPPlayer {
	String checkX;
	String rcp;
	public String valueRCP() {
		Scanner scan = new Scanner(System.in);
		String rcp;
		for (;;) {
			if (checkX.equals("X")) {
				rcp = checkX;
				break;
			}
			System.out.println("가위, 바위, 보 중 하나를 입력하세요. (단, X를 입력하시면 기권됩니다.)");
			rcp = scan.nextLine();
			if (rcp.equals("X")) {
				checkX = this.rcp = rcp;
				break;
			}
			else if ((rcp.equals("가위")) || (rcp.equals("바위")) || (rcp.equals("보"))) {
				this.rcp = rcp;
				break;
			}
		}
		return rcp;
	}
	
}

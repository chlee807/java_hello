package chapter8;

import java.util.Scanner;

public class RCPPlayer {
	public String valueRCP() {
		Scanner scan = new Scanner(System.in);
		String rcp;
		for (;;) {
			System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
			rcp = scan.nextLine();
			if ((rcp.equals("가위")) || (rcp.equals("바위")) || (rcp.equals("보"))) {
				break;
			}
		}
		return rcp;
	}
}

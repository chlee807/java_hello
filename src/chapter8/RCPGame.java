package chapter8;

import java.util.Scanner;

public class RCPGame {
	
	public void GamePlay(){
		RCPPlayer player = new RCPPlayer();
		RCPcpu cpu = new RCPcpu();
		Scanner scan = new Scanner(System.in);
		String confirmMessage;
		for(;;) {
			String playerValue = player.valueRCP();
			String cpuValue = cpu.trans();
			System.out.println(cpuValue);
			if (playerValue.equals(cpuValue)) {
				System.out.println("비겼습니다");
			}
			else if ((playerValue.equals("가위") && cpuValue.equals("바위")) || (playerValue.equals("바위") && cpuValue.equals("보")) || (playerValue.equals("보") && cpuValue.equals("가위"))) {
				System.out.println("졌습니다");
			}
			else {
				System.out.println("이겼습니다");
			}
			System.out.println("계속하시겠습니까?(Y/N)");
			confirmMessage = scan.nextLine();
			if (confirmMessage.equals("n")) {
				break;
			}
		}
	}
}

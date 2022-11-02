package chapter10;

import java.util.Arrays;
import java.util.Scanner;

public class RCPGame {
	
	public void GamePlay(){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("플레이어 수를 입력하세요");
		final int PLAYER_NUM = scan.nextInt();
		RCPPlayer[] player = new RCPPlayer[PLAYER_NUM];
		for (int i = 0; i < player.length; i++) {
			player[i] = new RCPPlayer();
		}
		
		System.out.println("cpu 수를 입력하세요");
		final int CPU_NUM = scan.nextInt();
		RCPcpu[] cpu = new RCPcpu[CPU_NUM];
		for (int i = 0; i < cpu.length; i++) {
			cpu[i] = new RCPcpu();
		}
		
		String[] valueStore = new String[PLAYER_NUM+CPU_NUM];
		Arrays.fill(valueStore,"초기화");
		String confirmMessage;
		for(;;) {
			for (int i = 0; i < player.length; i++) {
				if (valueStore[i].equals("X")) {
					continue;
				}
				System.out.println(i+"번째 플레이어 차례입니다");
				valueStore[i] = player[i].valueRCP();
			}
			
			for (int i = 0; i < cpu.length; i++) {
				if (valueStore[i].equals("X")) {
					continue;
				}
				valueStore[i+player.length] = cpu[i].trans();
			}
			
			int cntR, cntS, cntP;
			cntR = cntS = cntP = 0;
			
			for (int i = 0; i < valueStore.length; i++) {
				if (valueStore[i].equals("바위")) {
					cntR++;
				}
				if (valueStore[i].equals("가위")) {
					cntS++;
				}
				if (valueStore[i].equals("보")) {
					cntP++;
				}
			}
			if ((cntR > 0 && cntS > 0 && cntP > 0) || (cntR == 0 && cntS == 0) || (cntR == 0 && cntP == 0) || (cntS == 0 && cntP == 0)) {
				System.out.println("비겼습니다");
			}
			
			else if (cntR == 0) {
				for (int i = 0; i < player.length; i++) {
					System.out.println(i+"번째 플레이어: "+valueStore[i]);
				}
				for (int i = 0; i < cpu.length; i++) {
					System.out.println(i+"번째 cpu: "+valueStore[i+player.length]);
				}
				
				for (int i = 0; i < player.length; i++) {
					if (player[i].rcp.equals("가위")) {
						continue;
					}
					player[i].checkX = valueStore[i] = "X";
				}
				
				for (int i = 0; i < cpu.length; i++) {
					if (cpu[i].rcp.equals("가위")) {
						continue;
					}
					cpu[i].checkX = valueStore[i+player.length] = "X";
				}
				
				for (int i = 0; i < player.length; i++) {
					if (player[i].checkX.equals("X")) {	//조심
						continue;
					}
					System.out.println(i+"번째 플레이어가 이겼습니다");
				}
				
				for (int i = 0; i < cpu.length; i++) {
					if (cpu[i].checkX.equals("X")) {
						continue;
					}
					System.out.println(i+"번째 cpu가 이겼습니다");
				}
			}
			
			else if (cntS == 0) {
				for (int i = 0; i < player.length; i++) {
					System.out.println(i+"번째 플레이어: "+valueStore[i]);
				}
				for (int i = 0; i < cpu.length; i++) {
					System.out.println(i+"번째 cpu: "+valueStore[i+player.length]);
				}
				
				for (int i = 0; i < player.length; i++) {
					if (player[i].rcp.equals("보")) {
						continue;
					}
					player[i].checkX = valueStore[i] = "X";
				}
				
				for (int i = 0; i < cpu.length; i++) {
					if (cpu[i].rcp.equals("보")) {
						continue;
					}
					cpu[i].checkX = valueStore[i+player.length] = "X";
				}
				
				for (int i = 0; i < player.length; i++) {
					if (player[i].checkX.equals("X")) {	//조심
						continue;
					}
					System.out.println(i+"번째 플레이어가 이겼습니다");
				}
				
				for (int i = 0; i < cpu.length; i++) {
					if (cpu[i].checkX.equals("X")) {
						continue;
					}
					System.out.println(i+"번째 cpu가 이겼습니다");
				}
			}
			
			else if (cntP == 0) {
				for (int i = 0; i < player.length; i++) {
					System.out.println(i+"번째 플레이어: "+valueStore[i]);
				}
				for (int i = 0; i < cpu.length; i++) {
					System.out.println(i+"번째 cpu: "+valueStore[i+player.length]);
				}
				
				for (int i = 0; i < player.length; i++) {
					if (player[i].rcp.equals("바위")) {
						continue;
					}
					player[i].checkX = valueStore[i] = "X";
				}
				
				for (int i = 0; i < cpu.length; i++) {
					if (cpu[i].rcp.equals("바위")) {
						continue;
					}
					cpu[i].checkX = valueStore[i+player.length] = "X";
				}
				
				for (int i = 0; i < player.length; i++) {
					if (player[i].checkX.equals("X")) {	//조심
						continue;
					}
					System.out.println(i+"번째 플레이어가 이겼습니다");
				}
				
				for (int i = 0; i < cpu.length; i++) {
					if (cpu[i].checkX.equals("X")) {
						continue;
					}
					System.out.println(i+"번째 cpu가 이겼습니다");
				}
			}
			
			
			System.out.println("계속하시겠습니까?(Y/N)");
			confirmMessage = scan.nextLine();
			if (confirmMessage.equals("n")) {
				break;
			}
		}
	}
}

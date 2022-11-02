package chapter8;

public class RCPcpu {
	private String rcp;
	
	String checkX;
	
	public String trans() {
		int num = (int)Math.floor(3*Math.random());
		switch (num) {
		case 0:
			this.rcp = "가위";
			break;
		case 1:
			this.rcp = "바위";
			break;
		case 2:
			this.rcp = "보";
			break;
		default:
			break;
			}
		return rcp;
	}
}

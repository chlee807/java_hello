package chapter8;

public class Grade {
	private int math;
	private int science;
	private int english;
	
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public double average() {
		int total = math + science + english;
		double avg = total / 3.0;
		return avg;
	}
	
	public String getGrade() {
		if (average() >= 90) {
			return "수 입니다";
		}
		else if (average() >= 80) {
			return "우 입니다";
		}
		else if (average() >= 70) {
			return "미 입니다";
		}
		else if (average() >= 60) {
			return "양 입니다";
		}
		else
			return "우 입니다";
	}
}

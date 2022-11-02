package chapter6;

public class GradeByAvg {
	public static void main(String[]args) {
		System.out.println(grade(avg(100,70,30)));
	}
	public static double avg(int kor, int eng, int math) {
		int sum = kor+eng+math;
		return sum/3.0;
	}
	public static char grade(double avg) {
		if (avg >= 90) {
			return '수';
		}
		else if (avg >= 80) {
			return '우';
		}
		else if (avg >= 70) {
			return '미';
		}
		else if (avg >= 60) {
			return '양';
		}
		else {
			return '가';
		}
	}
}

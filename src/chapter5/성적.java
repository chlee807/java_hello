package chapter5;

import java.util.Scanner;

public class 성적 {
	public static void main(String[]args) {
		int kor;
		int eng;
		int math;
		int total;
		double avg;
		
		System.out.println("점수를 입력하세요(국어,영어,수학 순서)");
		Scanner scan = new Scanner(System.in);
		kor = scan.nextInt();
		System.out.println("국어점수는"+kor+"점 입니다");
		eng = scan.nextInt();
		System.out.println("영어점수는"+eng+"점 입니다");
		math = scan.nextInt();
		System.out.println("수학점수는"+kor+"점 입니다");
		
		total = kor + eng + math;
		avg = total/3.0;
		
		if (avg >= 90) {
			System.out.println("수");
		} else if (avg >= 80) {
			System.out.println("우");
		} else if (avg >= 70) {
			System.out.println("미");
		} else if (avg >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
	}
}

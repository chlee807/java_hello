package chapter7;

public class Circle {
	double radius;
	
	Circle(){
		
	}
	
	Circle(double radius) {
		this.radius =  radius;
	}
	
	double getArea(){
		return Math.PI * Math.pow(radius, 2);
	}
	
	double getArea(double radius){
		return Math.PI * Math.pow(radius, 2);
	}
}

package chapter7;

public class Rectangle {
	
	double width;
	double height;
	
	Rectangle(){
		
	}
	
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return width*height;
	}
	
	double getArea(double width, double height) {
		return width*height;
	}
}


public class Implementatio {

public class Circle {  // Save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   private String color;
   
   // The default constructor with no argument.
   // It sets the radius and color to their default value.
   public Circle() {
      radius = 1.0;
      setColor("red");
   }
   
   // 2nd constructor with given radius, but color default
   public Circle(double r) {
      radius = r;
      setColor("red");
   }
   
   // A public method for retrieving the radius
   public double getRadius() {
     return radius; 
   }
   
   // A public method for computing the area of circle
   public double getArea() {
      return radius*radius*Math.PI;
   }

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}
}
}

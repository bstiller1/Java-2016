
public class CustomException extends Exception {
private double radius;

public CustomException(double radius){
	super("Invalid input" + radius);
	this.radius = radius;
}
	public double getRadius(){
		return radius;
	}

}

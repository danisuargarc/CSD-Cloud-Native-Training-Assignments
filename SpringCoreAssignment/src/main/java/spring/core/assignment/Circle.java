package spring.core.assignment;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Required;

public class Circle {
	
	//@Inject
	private Point center;
	
	public Point getCenter() {
		return center;
	}
	@Required
	//@Resource(name="center")
	public void setCenter(Point center) {
		this.center = center;
	}
	public void draw() {
		System.out.println("Drew circle with center at (" + center.getX() + ", " + center.getY() + ")");
	}
	
}

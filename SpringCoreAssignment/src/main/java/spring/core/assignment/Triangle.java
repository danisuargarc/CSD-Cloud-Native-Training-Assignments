package spring.core.assignment;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;
	
	
	public Point getPointA() {
		return pointA;
	}


	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	public Point getPointB() {
		return pointB;
	}


	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	public Point getPointC() {
		return pointC;
	}


	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


	public void draw() {
		System.out.println("Drew triangle with points");
		System.out.println("(" + pointA.getX() + ", " + pointA.getY() + ")");
		System.out.println("(" + pointB.getX() + ", " + pointB.getY() + ")");
		System.out.println("(" + pointC.getX() + ", " + pointC.getY() + ")");
	}


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = context;
	}


	@Override
	public void setBeanName(String name) {
		System.out.println("(!) Bean Name: " + name);
	}
	
}

package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto12 {
private int height;
public Punto12() {
	// TODO Auto-generated constructor stub
}

public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}

public double CalculateTime() {
	
	return Math.sqrt((height * 2) / 9.81);
}
}
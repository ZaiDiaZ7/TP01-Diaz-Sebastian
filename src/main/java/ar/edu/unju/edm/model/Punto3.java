package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto3 {

	private int num;
	public Punto3() {
		// TODO Auto-generated constructor stub
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public boolean IsEven() {
		return (num%2 == 0);
	}
}
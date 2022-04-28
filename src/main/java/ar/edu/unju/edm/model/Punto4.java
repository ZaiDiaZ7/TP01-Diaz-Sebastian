package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto4 {

	private int num;

	public Punto4() {
	// TODO Auto-generated constructor stub

	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public boolean IsMonth() {
		if(num>0 && num<13)
			return true;
		else
			return false;
	}
}
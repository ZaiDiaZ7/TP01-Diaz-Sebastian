package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto6 {

	private int num;
	public Punto6() {
		// TODO Auto-generated constructor stub
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String StatuStudent() {
		
		String status=null;
		boolean aux=true;
		while(aux == true)
		{
			if(num == 6)
				status="Alumno Regulariza";
			if(num >= 7 && num<=10)
				status="El alumno promociona";
			if(num<6 && num>=1)
				status="El alumno desaprueba";
			if(num<=0 || num>10)
				status="Valor no permitido";
			aux=false;
		}
		return status;
	}
}
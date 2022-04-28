package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto2 {

	private int year;
	public Punto2() {
		// TODO Auto-generated constructor stub
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	// un año es bisiesto si es multiplo de 4 
	//los multiplos de 100 no son bisiestos, salvo que sean multiplos de 400
	// por ej 2000 si es bisiesto, pero 1800 no
	public boolean IsLeapYear() { //esbuena practica devolver un solo retorno, pq sigue evaluando
		
		boolean leap;
		if (year%4 == 0)
		{
			if(year%400 == 0)
				leap=true;
			else
			{
				if(year%100 == 0)
					leap=false;
				else
					leap=true;
			}
		}else
			leap=false;
		
return leap;
	}
}
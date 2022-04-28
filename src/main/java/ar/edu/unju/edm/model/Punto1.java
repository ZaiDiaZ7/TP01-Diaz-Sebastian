package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;



@Component
public class Punto1 {
	
	private int number;
	
	
	public Punto1() {
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
public int SolveFact(){ 
		
		int result=1;
		if (number==0)
		{
			if(number==0 || number==1)
			{
				return result;
			}
			else
			{
				result=number;
				for(int i=number-1; i>0; i--)
				{
					result=result*i;
				}
				return result;
			}
		}else
			return 0;
	}
		

}
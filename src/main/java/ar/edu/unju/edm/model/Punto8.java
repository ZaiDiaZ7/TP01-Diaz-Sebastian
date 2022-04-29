package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto8 { // hacer para cualquier numero no solo 4

	private int ocup;
	public Punto8() {
		// TODO Auto-generated constructor stub
	}
	
	public int[] SeqMultiples4() {
		int i=4;
		int seq[] = new int[25];
		ocup=0;
		do {
			seq[ocup]=i;
			ocup++;
			i=i+4;
		}while(i<=100);
		
		return seq;	
	}
	
	public void PrintSeqMult(int array[]) {
		int i;
		  for(i=0;i<ocup;i++)
			  System.out.print(array[i]+ " ");
		
	}
	
	
}
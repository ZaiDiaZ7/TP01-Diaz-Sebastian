package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto9 {

	private int ocup;
	public Punto9() {
		// TODO Auto-generated constructor stub
	}
	
	public int[] CountBackwardsFor() {
		ocup=0;
		int seq[] =new int[9];
		int j;
		for(j=320;j>=160;j=j-20)
		{
			seq[ocup] = j;
			ocup++;
		}
		return seq;
	}
	
	public void PrintSeq(int array[]) {
		int i;
		  for(i=0;i<ocup;i++)
			  System.out.print(array[i]+ " ");
		
	}
	
}
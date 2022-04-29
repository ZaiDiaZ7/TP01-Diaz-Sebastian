package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto11 {
private int ocup;
public Punto11() {
	// TODO Auto-generated constructor stub
}

public int[] CountBackwardsDoWhile() {
	ocup=0;
	int seq[] =new int[9];
	int j=320;
	do{
		seq[ocup] = j;
		j=j-20;
		ocup++;
	}while(j>=160);
	
	return seq;
}
public void PrintSeq(int array[]) {
	int i;
	  for(i=0;i<ocup;i++)
		  System.out.print(array[i]+ " ");
	
}
}
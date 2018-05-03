package Expresiones;

import java.util.Scanner;

public class LaTiendaDeLaEsquina {

	private String vueltas(int cost, int paid) {
		int vuelta=paid-cost;
		int[] monedas= {200,100,50,20,10,5,2,1};
		String resultado="";

		for(int i=0;i<monedas.length;i++){
			if(i<7) {
			resultado=resultado+vuelta/monedas[i]+" ";}
			else {
				resultado=resultado+vuelta/monedas[i];
			}
			vuelta=vuelta%monedas[i];
			
		}
		return resultado;
	}
	public static void main(String[] args) {
		
		LaTiendaDeLaEsquina objeto= new LaTiendaDeLaEsquina() ;
		Scanner sc=new Scanner(System.in);

		String p=sc.nextLine();
		String[] casos=p.split(" ");
		int pruebas=Integer.parseInt(casos[0]);
		
		int a=0;
		while(a<pruebas) {

			String entrada=sc.nextLine();

			String[] data = entrada.split(" ");

			int coste=Integer.parseInt(data[0]);

			int pago=Integer.parseInt(data[1]);

			if(coste>pago) {
				System.out.println("DEBE "+(coste-pago));
			}
			else {
				System.out.println(objeto.vueltas(coste, pago));
			}

			a++;
		}

	}
}



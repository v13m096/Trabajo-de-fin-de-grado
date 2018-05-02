package Expresiones;

import java.util.Scanner;

public class Cenicienta {
	private int horas_a_segundosTarea(String t) {
		String[] data = t.split(":");
		int total=0;
		int horas = Integer.parseInt(data[0])*3600;
	
		int minutos = Integer.parseInt(data[1])*60;
	
		int segundos = Integer.parseInt(data[2]);
		
		total= horas+minutos+segundos;
		return total;
	}
	private int horas_a_segundosLimite(String t) {
		String[] data = t.split(":");
		int total=0;
		int dias = Integer.parseInt(data[0])*3600*24;
		int horas = Integer.parseInt(data[1])*3600;
		
		int minutos = Integer.parseInt(data[2])*60;

		int segundos = Integer.parseInt(data[3]);

		total= dias+horas+minutos+segundos;
		return total;
		}
	
	

	public static void main(String[] args) {
		Cenicienta objeto= new Cenicienta() ;
		Scanner sc=new Scanner(System.in);
		
	
		int pruebas=Integer.parseInt(sc.nextLine());

		int a=0;
		while(a<pruebas) {
			int suma=0;
			String tiempolimite=sc.nextLine();
			
			String tiempotareas=sc.nextLine();
			String[] data = tiempotareas.split(" ");
			int[] totales=new int[data.length];
			for (int i=0;i<data.length;i++) {
				totales[i]=objeto.horas_a_segundosTarea(data[i]);
			}
			for (int i=0;i<data.length;i++) {
				suma=suma+totales[i];
			}
			int limite=objeto.horas_a_segundosLimite(tiempolimite);
			
			if(suma<limite) {
				System.out.println("SI");
			}
			else {
				System.out.println("NO");
			}
			a++;
		}

	}

}

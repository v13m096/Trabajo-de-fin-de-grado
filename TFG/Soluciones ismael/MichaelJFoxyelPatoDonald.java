package BuclesAnidados;

import java.util.Scanner;

public class MichaelJFoxyelPatoDonald {
	public int[][] vectorDIAyMES(String[] entrada){
		int[][] salida=new int[entrada.length][2];
		String[] v;
		for(int i=0;i<entrada.length;i++) {
			v= entrada[i].split("/");
			salida[i][0]= Integer.parseInt(v[0]);
			salida[i][1]= Integer.parseInt(v[1]);	
		}
		return salida;

	}

	public String comprobadordeCumples(int[][] entrada) {
		String resultado="NO";
		for(int i=0;i<entrada.length;i++) {
			for(int e=i;e<entrada.length;e++) {
				if(entrada[i][0]==entrada[e][0]&&i!=e) {
					if(entrada[i][1]==entrada[e][1]){
						resultado="SI";

					}
				}
			}

		}
		return resultado;

	}
	public static void main(String[] args) {

		MichaelJFoxyelPatoDonald objeto= new MichaelJFoxyelPatoDonald() ;

		Scanner sc=new Scanner(System.in);

		int control=0;
		while(control==0) {
			String fin=sc.nextLine();
			if(Integer.parseInt(fin)==0) {
				control=1;
			}
			else {

				String entrada=sc.nextLine();
				String[] cumples = entrada.split(" ");


				System.out.println(objeto.comprobadordeCumples(objeto.vectorDIAyMES(cumples)));


			}
		}

	}
}



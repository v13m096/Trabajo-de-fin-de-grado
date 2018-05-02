package Expresiones;
import java.util.*;
public class LosProblemasDeSerRico {
	//
	private int numeroLitros(int compartimentos, int capacidadmax, int diferencia) {

		int suma=0;
		int a=0;
		while(a<compartimentos){
			suma=suma+capacidadmax-a*(diferencia);
			a++;
		}
		return suma;
	}

	public static void main(String[]args) {
		LosProblemasDeSerRico objeto= new LosProblemasDeSerRico() ;
		Scanner sc=new Scanner(System.in);
		String cadena=sc.nextLine();
		int a=0;
		while(a<Integer.parseInt(cadena)) {
			String acuario=sc.nextLine();
			String[] data = acuario.split(" ");
			int compartimentos = Integer.parseInt(data[0]);
			int capacidadmax = Integer.parseInt(data[1]);
			int diferencia = Integer.parseInt(data[2]);

			System.out.println(objeto.numeroLitros(compartimentos, capacidadmax, diferencia));
			a++;
		}

	}
}

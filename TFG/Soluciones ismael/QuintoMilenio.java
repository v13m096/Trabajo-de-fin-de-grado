
import java.util.*;
import java.util.Scanner;

public class QuintoMilenio {

	public static String filtrado(String mensaje) {

		String resultado="";
		for (int i=0;i<mensaje.length();i++) {
			if(mensaje.charAt(i)!=' ') {
				resultado=resultado+mensaje.charAt(i);
			}
		}


		return resultado;


	}

	public static String setevalaolla(String texto, String mensajefiltrado) {
		String resultado="NO";
		String copia="";
		boolean flag=false;
		int z=0;
		int i=0;
		boolean mensajecompleto=false;
		
		while(z<mensajefiltrado.length()&&i<texto.length()&&!mensajecompleto) {
			if(mensajefiltrado.charAt(z)==texto.charAt(i)) {

				copia=copia+texto.charAt(i);
				z++;
				if(copia.equals(mensajefiltrado)) {
					mensajecompleto=true;
				}
			}
			i++;


		}
		if(mensajecompleto) {
			resultado="SI";
		}

		return resultado;
	}

	public static void main(String [] args) {
		QuintoMilenio objeto= new QuintoMilenio();
		Scanner sc=new Scanner(System.in);
		int a=0;
		String cadena=sc.nextLine();
		while(a<Integer.parseInt(cadena)) {

			String texto=sc.nextLine();
			texto=texto.toLowerCase();

			String mensaje=sc.nextLine();
			mensaje=mensaje.toLowerCase();
			
			String mensajefiltrado=QuintoMilenio.filtrado(mensaje);
			
			System.out.println(QuintoMilenio.setevalaolla(texto,mensajefiltrado));
			
			a++;
		}


	}
}

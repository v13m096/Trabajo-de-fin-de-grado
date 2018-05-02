package Expresiones;
import java.util.*;
public class CodigosDeBarras {
	/*  Funcion que recibe un codigo de 3 digitos(funcion comprobador) y que devuelve el pais al que corresponde
	    ese codigo o un "Desconocido" en caso de que su codigo no coincida con el de ningun pais.

	    PLANTEAMIENTO: Aprovechando que la longitud del codigo inicial es de 3, primero comprobamos si este coincide con alguno
	    de los paises que tienen un codigo de 3 cifras. Si no es así, nos quedamos con las dos primeras cifras del codigo y 
	    realizamos una comprobacion con los paises con codigo de dos cifras. Finalmente, si tampoco el codigo coincidia con los paises con 
	    codigo de dos cifras, se reduce a una y si no matchea con EEUU, se  trata de un pais desconocido*/

	public String pais(String cod) {
		String resultado;
		switch(cod) {

		case("380"):resultado= "Bulgaria";
		break;
		case("539"):resultado= "Irlanda";
		break;
		case("560"):resultado= "Portugal";
		break;
		case("759"):resultado= "Venezuela";
		break;
		case("850"):resultado= "Cuba";
		break;
		case("890"):resultado= "India";
		break;
		default: 
			String cod2=cod.substring(0,2);
			switch(cod2) {
			case("70"):resultado= "Noruega";
			break;
			case("50"):resultado= "Inglaterra";
			break;
			default:
				String cod3=cod.substring(0,1);
				switch(cod3) {
				case("0"):resultado= "EEUU";
				break;
				default: resultado= "Desconocido";}

			}
		}
		return resultado;
	}
	/* Funcion que dado un codigo: primero analiza si se trata de un codigo EAN-8 o EAN-13 y luego comprueba
	 * si el codigo es correcto.
	 * 
	 * PLANTEAMIENTO: Primero nos aseguramos de que la cadena introducida tenga 8 0 13 cifras añadiendo ceros delante.
	 * 				  Una vez que sabemos el EAN al que corresponde, afronta sus pruebas especificas.
	 * 				 -Caso EAN-8:  nos creamos 2 varibles: impares y pares. Impar lleva la cuenta de los calculos
	 * 				  respectivos a las cifras que ocupan un lugar impar, que son miltiplicar por 3 cada cifra e ir sumandolas a modo
	 * 				  de contador. Par solo suma las cifras en una posicion par. Luego se suman y se les añade el ultimo digito, si 
	 * 				  aplicando modulo 10 el resultado es 0, el codigo esta bien.
	 * 				 -Caso EAN-13:igual que el anterior(teniendo en cuenta que ahora son 13 cifras) hasta el momento en el que sabemos si está correcto o no. 
	 * 				  Si lo es, pasamos las tres primeras cifras al metodo pais y añadimos a "SI" el pais correspondiente.
	 */
	
	public String comprobador(String cad) {
		
		String solucion="";
		/* Primero ajustamos los numeros con ceros delante hasta que la longitud de la 
		   cadena introducida sea de 8 0 13 cifras*/
		if(cad.length()<8) {
			while(cad.length()<8) {
				cad="0"+cad;
			}
		}
		else if(cad.length()>8 && cad.length()<13) {
		
			while(cad.length()<13) {
				cad="0"+cad;
			}
		}

		// A continuacion vemos si se trata de un codigo EAN-8 o EAN-13 y comprobamos si esta bien

		if (cad.length()==8) {
			int par=0;
			int impar=0;
			
			for (int i=0;i<=6;i=i+2) {
				par = par + Character.getNumericValue(cad.charAt(i))*3;
			}
			for (int i=1;i<=6;i=i+2) {
				impar= impar+Character.getNumericValue(cad.charAt(i));
			}
			
			if((par+impar + Character.getNumericValue(cad.charAt(cad.length()-1))) % 10 == 0 ) {
				solucion="SI";	}
			else solucion= "NO";	

		}
		
		//else if(cad.length()==13) {
			else {
			int par=0;
			int impar=0;
			
			String cpais=cad.substring(0,3);
			for (int i=1;i<=11;i=i+2) {
				par = par + Character.getNumericValue(cad.charAt(i))*3;
			}
			for (int i=0;i<=11;i=i+2) {
				impar= impar+Character.getNumericValue(cad.charAt(i));
			}
			
			if((par+impar + Character.getNumericValue(cad.charAt(cad.length()-1)))%10 == 0 ) {
				solucion="SI"+" "+pais(cpais);	}
			else solucion= "NO";
		}
		return solucion;

	}


	public static void main(String [] args) {
		
			
		CodigosDeBarras objeto= new CodigosDeBarras();
		Scanner sc=new Scanner(System.in);

		String cadena=sc.nextLine();
		while(!cadena.equals("0")) {
			System.out.println(objeto.comprobador(cadena));
			cadena=sc.nextLine();
		}

		
	}
}

import java.util.Scanner;

public class PixelArt {


	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		int i=0;
		String cadena=sc.nextLine();
		while(i<Integer.parseInt(cadena)) {

			String texto=sc.nextLine();
			String resultado="SI";
			String[] data=texto.split(" ");
			int magenta=Integer.parseInt(data[0]);
			int amarillo=Integer.parseInt(data[1]);
			int cian=Integer.parseInt(data[2]);
			String casos=data[3];
			int limite=casos.length();
			
			int a=0;
			while(a<limite&&magenta!=-1&&amarillo!=-1&&cian!=-1) {
				if(casos.charAt(a)=='M') {magenta--;}
				else if(casos.charAt(a)=='A') {amarillo--;}
				else if(casos.charAt(a)=='C') {cian--;}
				else if(casos.charAt(a)=='R') {amarillo--;magenta--;}
				else if(casos.charAt(a)=='N') {amarillo--;magenta--;cian--;}
				else if(casos.charAt(a)=='V') {amarillo--;cian--;}
				else if(casos.charAt(a)=='L') {magenta--;cian--;}
				a++;
				
			}
			
			if(magenta<0||amarillo<0||cian<0) {
				resultado= "NO";
			}
			else {
				resultado=resultado+" "+magenta+" "+amarillo+" "+cian;
			}
			System.out.println(resultado);
			
			i++;
		}


	}
	}


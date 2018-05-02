import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LP {

	private static int numViajes (int lPiscina, int lCubo){
		int nv = lPiscina / lCubo;
		if (lPiscina % lCubo != 0) nv++;
		return nv;
	}


	public static void main(String[] args) throws IOException {
		boolean fin = false;
		String line;
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in), 70);
		while ((line = rd.readLine()) != null && !fin) {
			String[] data = line.split(" ");
			if (data[0].equals("0") || data[3].equals("0")) fin = true;
			else{
				int lPiscina1 = Integer.parseInt(data[0]);
				int lCubo1 = Integer.parseInt(data[1]);
				int lPer1 = Integer.parseInt(data[2]);
				int lPiscina2 = Integer.parseInt(data[3]);
				int lCubo2 = Integer.parseInt(data[4]);
				int lPer2 = Integer.parseInt(data[5]);

				int cap1 = lCubo1 - lPer1;
				int cap2 = lCubo2 - lPer2;
				int nv1 = -1;
				int nv2 = -1;

				int ganador = -1;


				if (lCubo1 >= lPiscina1) 
					nv1 = 1;
				else 
					if (cap1 <= 0){
						ganador = 2; //gana el vecino
						if (lCubo2 >= lPiscina2)
							nv2 = 1;
						else
							nv2 = numViajes(lPiscina2-lPer2, cap2);
					}
					else
						nv1 = numViajes(lPiscina1-lPer1, cap1);

				if (lCubo2 >= lPiscina2)
					nv2 = 1;
				else 
					if (cap2 <= 0){
						ganador = 1; //gano yo
						if (lCubo1 >= lPiscina1)
							nv1 = 1;
						else
							nv1 = numViajes(lPiscina1 - lPer1, cap1);
					}
					else
						nv2 = numViajes(lPiscina2 - lPer2, cap2);

				if (ganador == 1)
					System.out.println( "YO " + nv1);
				else if (ganador == 2)
					System.out.println("VECINO " + nv2);
				else if (nv1 == nv2)
					System.out.println("EMPATE " + nv1);
				else if (nv1 < nv2)
					System.out.println("YO " + nv1);
				else
					System.out.println("VECINO " + nv2);
			}
		}
	}
}

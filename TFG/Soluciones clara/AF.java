import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AF {


	public static void main(String[] args) throws IOException {
		String line;
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in), 70);
		line = rd.readLine();
		int num = Integer.parseInt(line);
		for (int i = 0; i < num; i++){
			line = rd.readLine();
			String[] data = line.split(" ");
			int n =  Integer.parseInt(data[1]);
			if (n == 1)
				System.out.println("FALSA");
			else{
				boolean ultimo = true;
				int j = 2;
				while (!data[j].equals(data[0]) && j <= n)
					j++;
				if (j == n + 1 && data[n+1].equals(data[0]))
					System.out.println("VERDADERA");
				else
					System.out.println("FALSA");
			}
		}
	}
}

package Cenicienta;
import java.io.*;
import java.util.concurrent.TimeUnit;
public class EjecutadorCenicienta {
		public static String finresult = "";
        public static String SistemaOperativo(String rutacompleta) {
		String resultado="";

		int longitud=rutacompleta.length()-1;
		
		while((int)rutacompleta.charAt(longitud)!=92&&longitud>=0){
			longitud--;}
                if(longitud>0){
                    resultado="windows";
                }
                else{
                    longitud=rutacompleta.length()-1;
		
                    while((int)rutacompleta.charAt(longitud)!=47&&longitud>=0){
			longitud--;}
                if(longitud>0){
                    resultado="ubuntu";
                }
                else{
                    resultado="Sistema operativo incompatible";}
                }
		return resultado;
	}    
                
	public static String[] DirectorioyNombredelprogramaWindows(String rutacompleta) {
		String[] resultado=new String[2];

		int longitud=rutacompleta.length()-1;
		int finalpos=rutacompleta.length();
		while((int)rutacompleta.charAt(longitud)!=92){
			longitud--;}

		resultado[0]=rutacompleta.substring(0,longitud);
		resultado[1]=rutacompleta.substring(longitud+1,finalpos-5);
		return resultado;
	}
        public static String[] DirectorioyNombredelprogramaUbuntu(String rutacompleta) {
		String[] resultado=new String[2];

		int longitud=rutacompleta.length()-1;
		int finalpos=rutacompleta.length();
		while((int)rutacompleta.charAt(longitud)!=47){
			longitud--;}

		resultado[0]=rutacompleta.substring(0,longitud);
		resultado[1]=rutacompleta.substring(longitud+1,finalpos-5);
		return resultado;
	}
	/*
	 * Este metodo lo que hace basicamente es probar que el codigo proporcionado por el alumno se puede compilar
	 * Con dos variables controla las posibles salidas de error o de terminación del proceso
	 */ 
	public static String compilador(String fileName){
		int flag=0;
		String resultado="";

		try
		{
			System.out.println("Compilando el archivo");

			Process processCompile = Runtime.getRuntime().exec("javac "+fileName);

			BufferedReader brCompileError = new BufferedReader(new InputStreamReader(processCompile.getErrorStream()));

			String errorCompile ;
			while((errorCompile = brCompileError.readLine())!=null)
			{flag=1;}
			if(flag==1)
			{resultado="Fallo en la compilacion";}


			BufferedReader brCompileRun = new BufferedReader(new InputStreamReader(processCompile.getErrorStream()));
			String outputCompile ;
			while((outputCompile = brCompileRun.readLine())!=null)
			{flag=1;}
                        
			if(flag==1)
                        {resultado="Fallo en la compilacion";
                        }
			else{
                                
				resultado="Correcto";}
                        //Process taskmanager = Runtime.getRuntime().exec("Taskkill /IM java(1).exe /F");
                        return resultado;
                        
				

		} catch (Exception e)
		{

			return resultado="Fallo en la compilacion: "+ e.getMessage();
		}
	}
        



	public static String runFileWindows(String ruta,String[] prueba,int timeout)
	{
		String[] pathandnameclass=DirectorioyNombredelprogramaWindows(ruta);
		String resultado="";

		try
		{
                        
			System.out.println("Ejecutando la Prueba");

			//ProcessBuilder pRun = new ProcessBuilder("cmd");

			//pRun.directory(new File(pathandnameclass[0]));
                        
                        Runtime runtime=Runtime.getRuntime();
                        //System.out.println(pathandnameclass[0]);
                        //System.out.println(pathandnameclass[1]);
                                        
                        //Process processRun= runtime.exec("java -cp "+pathandnameclass[0]+" "+pathandnameclass[1]);
                        Process processRun= runtime.exec("cmd");
			//Process processRun= pRun.start();
			OutputStream out = processRun.getOutputStream();
			PrintStream ps= new PrintStream(out);
			//ps.println("java "+pathandnameclass[1]);
                        ps.println("java -cp "+pathandnameclass[0]+" "+pathandnameclass[1]);
                        
                        
                        
			for(int i=0;i<prueba.length;i++) {
				ps.println(prueba[i]);
			}
			ps.flush();
			ps.close();

			if(processRun.waitFor(timeout, TimeUnit.MILLISECONDS)) {
				BufferedReader brResult = new BufferedReader(new InputStreamReader(processRun.getInputStream()));
				String outputRun;
				int contador=0;
                                while( (outputRun = brResult.readLine())!=null)
				{
                                    contador++;
				    if (contador>4&&contador<5+((prueba.length-1)/2)){
					resultado=resultado+outputRun+" ";}
                                }
				brResult.close();
			}
                        else if(processRun.waitFor(10000, TimeUnit.MILLISECONDS)) {
				
					resultado="Tiempo limite excedido";
                                        processRun.destroyForcibly();
                        }


			else {
				resultado="Bucle";
				try {   
                                        processRun.destroy();
				}
				catch (Exception e) {
					System.out.println("Excepcion al intentar matar al proceso mediante el administrador de tareas");
				}

			}

			return resultado;}

		catch (Exception e)
		{
			return resultado="Excepcion lanzada";
		}


	}
        public static void matarHijosWindows() {
		try {
                    
                    
                        Runtime runtime=Runtime.getRuntime();
                        //System.out.println(pathandnameclass[0]);
                        //System.out.println(pathandnameclass[1]);
                                        
                        //Process processRun= runtime.exec("java -cp "+pathandnameclass[0]+" "+pathandnameclass[1]);
                        Process taskkill= runtime.exec("taskkill /f /fi \"imagename eq java.exe\"");
                        /*
			ProcessBuilder tasklist = new ProcessBuilder("cmd");
			Process lista= tasklist.start();
			OutputStream salida = lista.getOutputStream();
			PrintStream ps1= new PrintStream(salida);
			ps1.println("tasklist /fi \"imagename eq java.exe\"");
			ps1.flush();
			ps1.close();
			BufferedReader brResult1 = new BufferedReader(new InputStreamReader(lista.getInputStream()));
			String outputRun1;
			String resultado="";
                        while( (outputRun1 = brResult1.readLine())!=null)
			{
				resultado=resultado+outputRun1;}
			brResult1.close();
			String[] data = resultado.split("java.exe");
                        String[] pid1=data[2].split(" Console");
			String[] pid2=data[3].split(" Console");
			Process taskmanager = Runtime.getRuntime().exec("taskkill /f /pid"+pid1[0]);*/
			System.out.println("Proceso huerfano eliminado");
		}
			catch(Exception e){}

		}
        public static String runFileUbuntu(String ruta,String[] prueba,int timeout)
	{
		String[] pathandnameclass=DirectorioyNombredelprogramaUbuntu(ruta);
		String resultado="";

		try
		{

			System.out.println("Ejecutando la Prueba");
			Process processRun = Runtime.getRuntime().exec("java -cp "+pathandnameclass[0]+" "+pathandnameclass[1]);

			
			OutputStream out = processRun.getOutputStream();
			PrintStream ps= new PrintStream(out);
			
			for(int i=0;i<prueba.length;i++) {
				ps.println(prueba[i]);

			}
			ps.flush();
			ps.close();
			

			if(processRun.waitFor(timeout, TimeUnit.MILLISECONDS)) {
				BufferedReader brResult = new BufferedReader(new InputStreamReader(processRun.getInputStream()));
				String outputRun;
				while( (outputRun = brResult.readLine())!=null)
				{
					resultado=resultado+outputRun+" ";
				}
				brResult.close();
			}
                        else if(processRun.waitFor(10000, TimeUnit.MILLISECONDS)) {
				
					resultado="Tiempo limite excedido";
                                        processRun.destroyForcibly();
                        }


			else {
				resultado="Bucle";
				processRun.destroyForcibly();
			}

			return resultado;}

		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Exception ");
			System.out.println(e.getMessage());
			finresult="Exception " + e.getMessage();

			return resultado="excepcionlanzada";
		}
	}
        



}

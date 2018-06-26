package Juez;

import java.util.Scanner;

public class Sudokus {
	public static String esCorrecto(int[][] matriz) {
		String resultado="SI";
		boolean siguiente=true;
		int a=0;

		int suma=0;


		//suma horizontal
		int i=0;
		
		while(i<9&&siguiente) {

			suma=0;
			int[] vector= {0,1,2,3,4,5,6,7,8,9};
			for(int z=0;z<9;z++) {
				if(matriz[i][z]!=vector[matriz[i][z]]) {
					siguiente=false;
				}
				else {
					vector[matriz[i][z]]=0;
				}
			}

			i++;
		}
		
		if(!siguiente) {
			resultado="NO";
		}
		else {
			//suma vertical
			i=0;
			
			while(i<9&&siguiente) {
				int[] vectorv= {0,1,2,3,4,5,6,7,8,9};
				for(int z=0;z<9;z++) {
					if(matriz[z][i]!=vectorv[matriz[z][i]]) {
						siguiente=false;
					}
					else {
						vectorv[matriz[z][i]]=0;
					}
				}
				i++;
			}
			
			if(!siguiente) {
				resultado="NO";
			}
			else {

				suma=0;
				// primera region (0,2)x(0,2)
				i=0;
				int[] vector1= {0,1,2,3,4,5,6,7,8,9};
				while(i<3&&siguiente) {
					for(int z=0;z<3;z++) {
						if(matriz[i][z]!=vector1[matriz[i][z]]) {
							siguiente=false;
						}
						else {
							vector1[matriz[i][z]]=0;
						}
					}

					i++;
				}
				
				if(!siguiente) {
					resultado="NO";

				}
				else {
					i=0;
					suma=0;
					int[] vector2= {0,1,2,3,4,5,6,7,8,9};
					// segunda region(0,2)x(3,5)
					while(i<3&&siguiente) {
						for(int z=3;z<6;z++) {
							if(matriz[i][z]!=vector2[matriz[i][z]]) {
								siguiente=false;
							}
							else {
								vector2[matriz[i][z]]=0;
							}
						}

						i++;
					}
					
					if(!siguiente) {
						resultado="NO";

					}
					else {
						i=0;
						suma=0;
						// tercera region(0,2)x(6,8)
						int[] vector3= {0,1,2,3,4,5,6,7,8,9};
						while(i<3) {


							for(int z=6;z<9;z++) {
								if(matriz[i][z]!=vector3[matriz[i][z]]) {
									siguiente=false;
								}
								else {
									vector3[matriz[i][z]]=0;
								}
							}

							i++;
						}
						
						if(!siguiente) {
							resultado="NO";

						}
						else {
							i=3;
							suma=0;
							// cuarta region(3,5)x(0,2)
							int[] vector4= {0,1,2,3,4,5,6,7,8,9};
							while(i<6) {


								for(int z=0;z<3;z++) {
									if(matriz[i][z]!=vector4[matriz[i][z]]) {
										siguiente=false;
									}
									else {
										vector4[matriz[i][z]]=0;
									}
								}

								i++;
							}
							
							if(!siguiente) {
								resultado="NO";

							}


							else {
								i=3;
								suma=0;
								// quinta region(3,5)x(3,5)
								int[] vector5= {0,1,2,3,4,5,6,7,8,9};
								while(i<6) {


									for(int z=3;z<6;z++) {
										if(matriz[i][z]!=vector5[matriz[i][z]]) {
											siguiente=false;
										}
										else {
											vector5[matriz[i][z]]=0;
										}
									}

									i++;
								}
								
								if(!siguiente) {
									resultado="NO";

								}


								else {
									i=3;
									suma=0;
									// sexta region(3,5)x(6,8)
									int[] vector6= {0,1,2,3,4,5,6,7,8,9};
									while(i<6) {


										for(int z=6;z<9;z++) {
											if(matriz[i][z]!=vector6[matriz[i][z]]) {
												siguiente=false;
											}
											else {
												vector6[matriz[i][z]]=0;
											}
										}

										i++;
									}
									
									if(!siguiente) {
										resultado="NO";

									}


									else {
										i=6;
										suma=0;
										// septima region (6,8)x(0,2)
										int[] vector7= {0,1,2,3,4,5,6,7,8,9};
										while(i<9) {


											for(int z=0;z<3;z++) {
												if(matriz[i][z]!=vector7[matriz[i][z]]) {
													siguiente=false;
												}
												else {
													vector7[matriz[i][z]]=0;
												}
											}

											i++;
										}
										
										if(!siguiente) {
											resultado="NO";

										}


										else {
											i=6;
											suma=0;
											// octava region(6,8)x(3,5)
											int[] vector8= {0,1,2,3,4,5,6,7,8,9};
											while(i<9) {


												for(int z=3;z<6;z++) {
													if(matriz[i][z]!=vector8[matriz[i][z]]) {
														siguiente=false;
													}
													else {
														vector8[matriz[i][z]]=0;
													}
												}

												i++;
											}
											
											if(!siguiente) {
												resultado="NO";

											}


											else {
												i=6;
												suma=0;
												// novena region (6,8)x(6,8)
												int[] vector9= {0,1,2,3,4,5,6,7,8,9};
												while(i<9) {


													for(int z=6;z<9;z++) {
														if(matriz[i][z]!=vector9[matriz[i][z]]) {
															siguiente=false;
														}
														else {
															vector9[matriz[i][z]]=0;
														}
													}

													i++;
												}
											
												if(!siguiente) {
													resultado="NO";

												}

											}

										}
									}

								}


							}
						}
					}
				}
			}
		}

		return resultado;
	}

	public static void main(String [] args) {

		Scanner sc=new Scanner(System.in);
		int a=0;
		String cadena=sc.nextLine();
		int dimension=Integer.parseInt(cadena);
		while(a<dimension) {
			String cadena1=sc.nextLine();
			String cadena2=sc.nextLine();
			String cadena3=sc.nextLine();
			String cadena4=sc.nextLine();
			String cadena5=sc.nextLine();
			String cadena6=sc.nextLine();
			String cadena7=sc.nextLine();
			String cadena8=sc.nextLine();
			String cadena9=sc.nextLine();
			int[][] matriz=new int[9][9];
			String[][] data=new String[9][9];
			data[0]=cadena1.split(" ");
			data[1]=cadena2.split(" ");
			data[2]=cadena3.split(" ");
			data[3]=cadena4.split(" ");
			data[4]=cadena5.split(" ");
			data[5]=cadena6.split(" ");
			data[6]=cadena7.split(" ");
			data[7]=cadena8.split(" ");
			data[8]=cadena9.split(" ");
			for(int i=0;i<9;i++) {
				for(int z=0;z<9;z++) {
					matriz[i][z]=Integer.parseInt(data[i][z]);

				}

			}

			Sudokus objeto= new Sudokus();

			System.out.println(objeto.esCorrecto(matriz));
			a++;

		}
	}
}

package Principal;

import java.io.*;

public class ID3 {
	int nAtt = 12;
	double[][] datos=new double[4898][nAtt];
	double [] entropia = new double[nAtt];
	private static BufferedReader br;
	static String[] line;
	public void llenaArreglo() throws IOException{
		 File file = new File(".\\wine.txt");

		 
		  br = new BufferedReader(new FileReader(file));
		  int cont=0;
		  String st;
		  
		  while ((st = br.readLine()) != null){
			line=st.split(";");
			for (int i=0; i<nAtt;i++){
				datos[cont][i]=Double.parseDouble(line[i]);
				
				//if(cont==0)
					//System.out.println(datos[i][cont]);
			}
		  	cont+=1;
		  }
		  System.out.println(cont);
	}
	
	public void calculaEntropia(){
		for(int i = 0; i==10; i++ ){
			for(int j=0; j<nAtt;){
				//entropia[i] += datos[i][nAtr]
			}
		}
	}
	public void imprimeMatriz(){
		for (int i = 0; i < datos.length; i++) {
		    for (int j = 0; j < datos[i].length; j++) {
		        System.out.print(datos[i][j] + " ");
		    }
		    System.out.println();
		}
	}
	 

	
	
	public static void main(String[] args) throws IOException {
			ID3 a=new ID3();
			a.llenaArreglo();
			a.imprimeMatriz();
		

	}

}

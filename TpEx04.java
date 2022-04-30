/**

FABRICIO CARLOS GUIMARAES CB3014886
LETICIA VITORIA

4. Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela. 


 */
import java.util.Scanner;


public class TpEx04{
public static void main(String args[]){

int[][] matriz= {{0,0,0},{0,0,0}};

Scanner scan= new Scanner(System.in); 


	for (int i=0;i<2;i++){
		for(int j=0;j<3;j++){
		
			int n = scan.nextInt();
			matriz[i][j] = n;	
		}
	}
		
		for (int i=0;i<2;i++){
		System.out.println();
			for(int j=0;j<3;j++){
				System.out.print(matriz[i][j]);
				System.out.print("-");
		}
		
	}
	
	
}
	
}


/**

FABRICIO CARLOS GUIMARAES CB3014886
LETICIA VITORIA

5. Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.


 */
import java.util.Scanner;


public class TpEx05{
public static void main(String args[]){

int matriz[][] = new int [3][2];

Scanner scan= new Scanner(System.in); 


	for (int i=0;i<3;i++){
		for(int j=0;j<2;j++){
		
			int n = scan.nextInt();
			matriz[i][j] = n;	
		}
	}
		
		for (int i=0;i<3;i++){
		System.out.println();
			for(int j=0;j<2;j++){
				System.out.print(matriz[i][j]);
				System.out.print("-");
		}
		
	}
	
	
}
	
}

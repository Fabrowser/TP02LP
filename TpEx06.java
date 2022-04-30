/**

FABRICIO CARLOS GUIMARAES CB3014886
LETICIA VITORIA

6. Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela. 


 */
import java.util.Scanner;


public class TpEx06{
public static void main(String args[]){

String matriz[][] = new String[2][3];

Scanner scan= new Scanner(System.in); 


	for (int i=0;i<2;i++){
		for(int j=0;j<3;j++){
		
			String nome = scan.nextLine();
			matriz[i][j] = nome;	
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

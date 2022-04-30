/**

FABRICIO CARLOS GUIMARAES CB3014886
LETICIA VITORIA

8. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
colunas

 */
import java.util.Scanner;


public class TpEx08{
public static void main(String args[]){

double matriz[][] = new double[3][4];

Scanner scan= new Scanner(System.in); 


	for (int i=0;i<3;i++){
		for(int j=0;j<4;j++){
			System.out.print("Digite um valor: ");
			double n = scan.nextInt();
			matriz[i][j] = n;	
		}
	}
	
	
			System.out.print("Digite o valor da constante multiplicativa: ");
			double c = scan.nextInt();
			
			double matriz_2[][] = new double[3][4];
			
			for (int i=0;i<3;i++){
				for(int j=0;j<4;j++){
				double x = c*matriz[i][j];
				matriz_2[i][j] = x;	
		}
	}
	
	System.out.print("\n");
	System.out.print("MATRIZ 1 ");
	System.out.print("\n");
		for (int i=0;i<3;i++){
		System.out.println();
			for(int j=0;j<4;j++){
				System.out.print(matriz[i][j]);
				System.out.print("-");
		}
		
	}
		System.out.print("\n");
		System.out.print("\n");	
		
		
		System.out.print("MATRIZ 2 ");
		System.out.print("\n");
		for (int i=0;i<3;i++){
		System.out.println();
			for(int j=0;j<4;j++){
				System.out.print(matriz_2[i][j]);
				System.out.print("-");
		}
		
	}
	
	
}
	
}
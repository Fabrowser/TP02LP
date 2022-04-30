/**

FABRICIO CARLOS GUIMARAES CB3014886
LETICIA VITORIA

9. Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
elementos, calcular e exibir a matriz transposta. 


 */
import java.util.Scanner;


public class TpEx09{
public static void main(String args[]){


 // Solicitando valores da MAtriz ao usuario
 
	Scanner scan= new Scanner(System.in); 
	System.out.print("Digite um valor de Linhas: ");
	int linhas = scan.nextInt();

	System.out.print("Digite um valor de Colunas: ");
	int colunas = scan.nextInt();
	
	if(linhas<=10 && colunas<=10){
		

			int matriz[][] = new int[linhas][colunas];


				System.out.print("\n");
				System.out.print("\n");
				System.out.print("Preencher a Matriz");
				System.out.print("\n");

				for (int i=0;i<linhas;i++){
					for(int j=0;j<colunas;j++){
						System.out.print("Digite um valor: ");
						int n = scan.nextInt();
						matriz[i][j] = n;	
					}
				}
			
			
				int matriz_trans[][] = new int[colunas][linhas];	
				
				
				for (int i=0;i<linhas;i++){
					for(int j=0;j<colunas;j++){
					matriz_trans[j][i] = matriz[i][j];

				}
				
			}
			
			
			
			
			System.out.print("\n");
			System.out.print("Matriz Normal:  ");
				System.out.print("\n");

				for (int i=0;i<linhas;i++){
				System.out.println();
					for(int j=0;j<colunas;j++){
						System.out.print(matriz[i][j]);
						System.out.print("-");
				}
				
			}
			
			
				System.out.print("\n");
				System.out.print("Matriz Transposta:  ");
				System.out.print("\n");

				for (int i=0;i<colunas;i++){
				System.out.println();
					for(int j=0;j<linhas;j++){
						System.out.print(matriz_trans[i][j]);
						System.out.print("-");
				}
				
			}
			
	}else
				
			{
				System.out.print("Matriz Invalida, nao pode ser superior a ordem 10");
				System.exit(0);
				
			}
	
	
}
	
}
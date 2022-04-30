/**

FABRICIO CARLOS GUIMARAES CB3014886
LETICIA VITORIA

7. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes. 


 */
import java.util.Scanner;


public class TpEx07{
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
			
			for (int i=0;i<3;i++){
				for(int j=0;j<4;j++){
				double x = c*matriz[i][j];
				matriz[i][j] = x;	
		}
	}
	
	
	
		
		for (int i=0;i<3;i++){
		System.out.println();
			for(int j=0;j<4;j++){
				System.out.print(matriz[i][j]);
				System.out.print("-");
		}
		
	}
	
	
}
	
}
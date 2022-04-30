/*

FABRICIO CARLOS GUIMARAES CB3014886
LETICIA VITORIA

2. Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
erro, se necessário. Após a digitação, exibir:
 */

import java.util.Scanner;


public class TpEx02{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); 
double n=0, soma=0, maior=0;
double media=0;

for(int i=0; i<10;i++){
	
		System.out.println("Digite o valor:  ");
		n = scan.nextInt();

		if(i==0){
			
			maior = n;
			
		}else if (n>maior) {
			
			maior = n;	

					}
			
			soma = soma+n;
			
			media = soma/10;
			System.out.println(media);
		
		}	
	
		
		System.out.println("A - O Maior valor e: " + maior + "\n"+
							"B - A soma dos valores e: " + soma  + "\n"+
							"C - A média aritmetica dos valores e: " + media);
	
}
}

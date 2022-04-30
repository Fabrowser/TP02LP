
/**
FABRICIO CARLOS GUIMARAES CB3014886
LETICIA VITORIA

3. Entrar via teclado com N valores quaisquer. O valor N(que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos N valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos;
Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do
programa. Consistir a resposta no sentido de aceitar somente S ou N e encerrar o
programa em função dessa resposta


 */
import java.util.Scanner;


public class TpEx03{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); 

int q=0, maior=0, menor=0, soma=0, n=0;
double media=0, qnegativos=0, qpositivos=0;
String opcao2="S";
	
	while (opcao2.equals("S"))
	{
		q=0;
		maior=0;
		menor=0;
		soma=0;
		n=0;
		media = 0.0;
		qnegativos=0;
		qpositivos=0;
		
		
	System.out.println("Digite a quantidade de valores:  ");
	q = scan.nextInt();
	if(q >0 && q <=20){
			for(int i=0;i<q;i++){
				System.out.println("Digite o valor:  ");
				n = scan.nextInt();
						if(i==0){
						maior = n;
						menor = n;}
						if(n>maior) 
						{maior=n;}
						if(n<menor) 
						{menor=n;}
						if(n<0){qnegativos=qnegativos+1;}
						if(n>0){qpositivos=qpositivos+1;}
			
						 soma = soma+n;
						 } 			
						media = soma/q;						  	
					}
						double perc_p = ((qpositivos/q)*100);
						double perc_n = ((qnegativos/q)*100);
						System.out.println("O maior valor e: " + maior);
						System.out.println("O menor valor e: " + menor);
						System.out.println("A soma dos valores e:  " + soma);
						System.out.println("A média aritmetica dos valores e:  " + media);
						System.out.println("A porcentagem dos POSITIVOS e:  " + (perc_p) + "%");	
						System.out.println("A porcentagem dos NEGATIVOS e:  " + (perc_n) + "%");	
	
						//FIM DA EXECUÇÃO
						
						
						//OPÇÃO PARA INICIAR O PROGRAMA NOVAMENTE
						
						System.out.println("Deseja executar o programa novamente? [S]");
						Scanner scan2= new Scanner(System.in); 
						opcao2 = scan2.nextLine();	
						
							while(opcao2.equals("S")==false){
								
								if(opcao2.equals("N")){
									System.exit(0);
													}
								System.out.println("Deseja executar o programa novamente? [S]");
								scan2= new Scanner(System.in); 
								opcao2 = scan2.nextLine();		
							}
	}	
}
}

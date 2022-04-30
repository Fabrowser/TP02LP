/*

FABRICIO CARLOS GUIMARAES CB3014886
LETICIA VITORIA

1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
Caso contrário solicitar novamente apenas o segundo valor.

 */

import java.util.Scanner;


public class TpEx01{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); 

System.out.println("Digite o primeiro valor:  ");
int n1 = scan.nextInt();

System.out.println("Digite o segundo valor:  ");
int n2 = scan.nextInt();


while (n2<n1){

System.out.println("Digite o segundo valor:  ");
 n2 = scan.nextInt();

}



System.out.println("Segundo Valor maior que o primeiro!!");


}
}

/* Guilherme David Niza
4. Criar um algoritmo que leia o sexo (M ou F), a idade e o tempo de carteira de habilitação de várias pessoas. Ao final, apresentar
na tela a quantidade de mulheres (F) com idade entre 24 e 30 anos com tempo de carteira de habilitação superior a 3 anos.
Para encerrar a entrada de dados o usuário deve digitar uma idade menor ou igual a zero.
*/

package ado2;
 
import java.util.Scanner;

public class Ex4 {
 
    public static void main(String[] args) {
    
    System.out.println("Bem vindo ao sistema de habilitação!");
    
    System.out.println ("Digite o sexo (M/F), idade da pessoa, e o tempo de habilitação do mesmo!");
    
    System.out.println("No final mostraremos a quantidade de mulheres entre 24 e 30 anos com tempo de habilitação de no minimo 3 anos!");
    
    System.out.println("Para encerrar a entrada de valores, em idade, digite 0 ou um número negativo!");
    
    System.out.println("*___________________________________________________________*");
            
    Scanner leitor = new Scanner (System.in);   
    
    char sexo;
    
    int idade = 1, tempcart, totalf = 0;
    
        while (idade > 0) {
        
            System.out.print("Sexo (F/M): ");
            sexo = leitor.next().charAt(0);
            
            System.out.print("Idade: ");
            idade = leitor.nextInt();
        
            System.out.print("Tempo de habilitação: ");
            tempcart = leitor.nextInt();
    
            switch (sexo) {
                case 'M':
                    
                 default:
              
                        System.out.println("Resposta invalida! favor responder com (F ou M)");   
                case 'F':
                    
                    if (idade >= 24 && idade <= 30 && tempcart >= 3){
                        
                        totalf += 1 ;
                            break;
             
              
                             
                           
                    } 
            } 
            
        }
            System.out.println("O número de mulhres com a idade entre 24 e 30 anos e com no minimo 3 anos de habilitação é de: " +totalf);
            System.out.println("Obrigado, volte sempre!");
    } 
}

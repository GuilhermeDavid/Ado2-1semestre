/* Guilherme David Niza
3. Criar um algoritmo que leia a idade e o peso de 15 pessoas e apresente na tela a média dos pesos das pessoas da mesma faixa
etária. As faixas etárias são: de 1 a 10 anos, de 11 a 20 anos, de 21 a 30 anos e maiores de 30 anos
 */

package ado2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Esse programa recolherá o peso e idade de 15 pessoas e mostrará a media de pesos por pessoas da mesma faixa etária");
        
        System.out.println("*___________________________________________________________*");
        
        float md1 = 0, md2 = 0, md3 = 0, md4 = 0, soma = 0, media = 0; 
        
        int contador = 1, peso, idade;
        
            while (contador <= 15 ) {
            
                System.out.print("Peso: ");
                 peso = leitor.nextInt();
            
                System.out.print("Idade: ");
                 idade = leitor.nextInt();
            
                 contador = contador + 1;
        
                    if (idade >= 1 && idade <= 10) {
                        media += 1;
                        soma += peso;
                        md1 = soma/media;
            
                    } if (idade >= 11 && idade <= 20) {
                        media += 1;
                        soma += peso;
                        md2 = soma/media;
           
                    } if (idade >= 21 && idade <= 30) {
                        media += 1;
                        soma += peso;
                        md3 = soma/media;
            
                    } if (idade > 30) {
                        media += 1;
                        soma += peso;
                        md4 = soma/media;
             
                    }        
            }   
            System.out.println("*___________________________________________________________*");
            
            System.out.println("O peso medio entre as pessoas com 1 ano até 10 anos é de: " + md1);
            
            System.out.println("O peso medio entre as pessoas com 11 ano até 20 anos é de: " + md2);
            
            System.out.println("O peso medio entre as pessoas com 21 ano até 30 anos é de: " + md3); 
            
            System.out.println("O peso medio entre as pessoas com mais de 30 anos é de: " + md4);
            
            System.out.println("Fim");
    } 
    
}
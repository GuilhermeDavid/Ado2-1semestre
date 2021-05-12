/* Guilherme David Niza
5. Uma loja está levantando o valor total de todas as mercadorias em estoque. Criar um algoritmo que leia o valor da mercadoria
e pergunte “Mais Mercadorias (S/N)?”. Ao final, apresentar na tela o total em estoque e a média de valores das mercadorias
em estoque.
 */

package ado2;

import java.util.Scanner;

public class Ex5 {
 
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in); 
        
        System.out.println ("Bem vindo ao sistema do mercado!");
        
        System.out.println("Quando informado digite (S ou N) para continuar informando valor e quantidade de mercadorias!");
        
        System.out.println("Ao final mostraremos a media de valor das mercadorias e a quantidade maxima de mercadoria!");
        
        System.out.println("*___________________________________________________________*");
        
        int produtos , produtosfinal = 0;
        
        char simnao;
        
        float preco, valor = 0; 
        
        boolean x = true;
        
            while (x) {
           
                System.out.print("Mais mercadorias? (S/N): ");
                 simnao = leitor.next().charAt(0);                 
                                                  
                switch (simnao) {
                    
                    case 'N':
                        
                        x = false; 
                            
                        break;
                
                    case 'S': 
                        
                        System.out.print("Valor da mercadoria R$: ");
                         preco = leitor.nextFloat();
           
                        System.out.print("Quantidade dessa mesma mercadoria: ");
                         produtos = leitor.nextInt();                     
                                       
                        valor += preco;
                    
                        produtosfinal += produtos;
                            
                        break;
                        
                    default:
              
                        System.out.println("Resposta invalida! favor responder com (S ou N)");
                }
        }
         System.out.println("Média de valores R$: " + valor / produtosfinal);
        
         System.out.println("Total de produtos: " + produtosfinal);
    }   
}
/*  Guilherme David Niza
2. O número 3025 possui a seguinte característica: 30 + 25 = 55 e 552 = 3025. Criar um algoritmo que apresente na tela todos
os números positivos de quatro algarismos que possuem a característica citada
 */
package ado2;

public class Ex2 {
    
    public static void main(String[] args) {
    
      int num = 1000;
      
      System.out.println ("Esse programa mostra quais numero de 4 digitos tem a seguinte caracteristica: 3025 = 30 + 25 = 55 e 552 = 3025. ");
      
      System.out.println("*___________________________________________________________*");
      
        while (num <=9999) {
          
            if(num == (((num / 100) + (num % 100))  *  ((num / 100) + (num % 100))))  
             
             System.out.println(num);
             
             num += 1;
        }
        System.out.println("Fim");
    }
}
    

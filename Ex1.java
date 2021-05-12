/* Guilherme David Niza
1. Criar um programa que leia um número inteiro N maior do que zero e calcule o fatorial desse número. Fatorial de N é
representado por N! e calculado da seguinte maneira:
N! = N ∗ (N − 1) ∗ (N − 2) ∗ ... ∗ 3 ∗ 2 ∗ 1
 */

package ado2;

import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);   
        
        System.out.println("Coloque um numero e mostraremos seu fatorial!");
        
        System.out.println("*___________________________________________________________*");
        
        System.out.print("Numero: ");
        
        int num = leitor.nextInt(), fat = 1;
        
        for (int i = 1; i <= num; i++) {
           
            fat = fat * i;
          
        }
            System.out.println( num + "!= " + fat);
    }
}

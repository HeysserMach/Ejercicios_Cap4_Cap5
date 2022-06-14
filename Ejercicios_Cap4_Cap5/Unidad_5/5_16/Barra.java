/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Barra {
    public static void main(String[] args) {
    System.out.print("\nIntroduce cinco enteros entre 1 y 30");
  

        Scanner Input = new Scanner(System.in);

        int numero;
        int contador = 1;

        while ( contador <= 5 )
        {         
        System.out.printf("\nPor favor introduzca el numero %d:\n ", contador);
        numero = Input.nextInt();

        if ((5 <= numero) && ( 30 >= numero))
        {     

        for ( int i = 1; i <= numero; i++ )
        System.out.print("*");

       System.out.println();

       contador++;
      }
    }
  }
}

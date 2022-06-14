/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Factorial {
    public static void main(String[] args) {
    for ( int i = 1; i <= 20; i++ )
    {
  
    float factor = 1;
    float numero = i;

    while ( 0 < numero )
    {
    factor *= numero--;
    } 

    System.out.printf("\nEl factorial de %d es: %.1f\n", i, factor );


    }
  } 
}

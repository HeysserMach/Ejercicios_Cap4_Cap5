/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Misterio3 {
    public static void main(String[] args){
        
    int fila = 10;
    
    while (fila >= 1)
    {
    int columna = 1 ;
    
    while (columna<=10)
    {
        System.out.print(fila % 2 == 1 ? "<" : ">");
        ++columna;
    }
    
    --fila;
    System.out.println();
    }
  }
}

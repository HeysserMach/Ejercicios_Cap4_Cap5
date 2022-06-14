/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Interes {
public static void main(String[] args)  {

    double monto; // monto depositado al final de cada año
    double principal = 1000.0;// monto inicial antes de los intereses// tasa de interés

    for (double tasa = 0.05; tasa <=0.10; tasa += 0.01){
    
    System.out.printf("\n%s%20s", "Anio", "Monto en deposito");
    System.out.printf("para una tasa igual a: %.2f\n", tasa);
    for (int anio = 1; anio <=10; ++anio)     
    {
    // calcula el nuevo monto para el año especificado
    monto = principal * Math.pow(1.0+ tasa, anio);
    // muestra el año y el monto
    System.out.printf("%4d%,20.2f%n", anio, monto);
    } 

  } 
}
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class PruebaComisiones {
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
     int Contador = 0;
     double Total = 0;
     int Codigo;
     double Precio;
     String idVendedor;
     String NombreVendedor;
     
        System.out.print("Id Del Vendedor: ");
        idVendedor = input.nextLine();
        
        
        System.out.print("Nombre del Vendedor: ");
        NombreVendedor = input.nextLine();
        System.out.println("");
    
        System.out.print("Codigo del Articulo: ");
        Codigo = input.nextInt();
        
        while(Codigo !=-1)
        {
        
        System.out.print("Precio del Articulo: ");
        Precio = input.nextDouble();
        System.out.println("");
        
        System.out.print("Codigo del Articulo: ");
        Codigo = input.nextInt();
        
        
        Total = Total + Precio;
        Contador = Contador + 1;
        }
    
        
        if (Contador !=0)
                {
                 double Comision = Total * 0.09;
                 double Ingreso = Comision + 200;
        System.out.println("");
        System.out.println("***************************COMISIONES***********************************************");
        System.out.println("************************************************************************************");
        System.out.printf("Id del Vendedor: %s", idVendedor);
        System.out.printf("                               Nombre del Vendedor: %s%n", NombreVendedor);
        System.out.println("************************************************************************************");
        System.out.printf("Por %d articulos, El total de la venta fue: %.2f%n", Contador, Total);
        System.out.printf("Su comision semanal es: %.2f%n", Comision);
        System.out.printf("Su pago semanal es: %.2f", Ingreso);
                } 
        else
        {
            System.out.println("---------------------------No se Introdujeron datos-----------------------------");
        }
}
}

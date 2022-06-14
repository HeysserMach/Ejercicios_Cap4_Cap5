/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class PruebaSalario {
    public static void main(String[] args) {
        
        int z = 0;
        
        Salario f = new Salario();
        //f.DatosEmpleado();
        Scanner input = new Scanner(System.in);
        
        while (z == 0){       
        f.DatosEmpleado();
        System.out.println("Desea Agregar otro Empleado: ");
        System.out.print("SI (0)  NO(1)");
        z = input.nextInt();
        }     
        
        f.Imprimir();
    }
}

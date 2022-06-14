/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Salario {
        
        /*private String IdEmpleado;
        private String Nombre;
        private double CuotaH; // cuota por hora
        private double HoraTrab; //horas tabajadas*/
        
        Empleado[] empleado = new Empleado[3];
        int pos = 0;
        
        Scanner input = new Scanner(System.in);
        
        public void DatosEmpleado(){
        
        
        empleado[pos] = new Empleado();
        
        System.out.print("Id del empleado: ");
        String IdEmpleado = input.next();
        empleado[pos].setIdEmpleado(IdEmpleado);
    
        System.out.print("Nombre del Empleado: ");
        String Nombre = input.next();
        empleado[pos].setNombre(Nombre);
        
        System.out.print("Cuota por Hora: ");
        double CuotaH = input.nextDouble();
        empleado[pos].setCuotaH(CuotaH);
        
        System.out.print("Horas Trabajadas: ");
        double HoraTrab = input.nextDouble();
        empleado[pos].setHoraTrab(HoraTrab);
        
        pos++;           
    }
        
        public void Imprimir(){
            
        System.out.println("***************************Salarios********************************");
        System.out.println("**************************Semanales********************************");
        for (int i=0; i<pos; i++){        
        System.out.printf("Id: # %s", empleado[i].getIdEmpleado());
        System.out.printf("                               Nombre: %s%n", empleado[i].getNombre());
        System.out.printf("Cuota por hora: %.2f%n", empleado[i].getCuotaH());
        System.out.printf("Horas Trabajadas: %.2f%n", empleado[i].getHoraTrab());
        System.out.printf("Horas Extras: %.0f%n", empleado[i].getHorasEx());
        System.out.println("********************************************************************");
        System.out.printf("Pago Normal: %.2f%n", empleado[i].getPagoNormal());
        System.out.printf("Pago Extra: %.2f%n", empleado[i].getPagoEx());
        System.out.printf("Pago Total: %.2f%n", empleado[i].getPagoNormal() + empleado[i].getPagoEx());
        System.out.println("********************************************************************");
      }
    }
}

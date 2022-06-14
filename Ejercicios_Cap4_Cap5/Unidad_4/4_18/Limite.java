/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Limite {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int Contador = 0;
        String NumCuenta = "";
        double SaldoI = 0; //saldo inicial
        double Cargos = 0;
        double Creditos = 0;
        double Limite = 0;
        double SaldoN = 0;//Saldo Nuevo
        
        System.out.print("Desea Iniciar(si o no): ");
        char R;
        R = input.next().charAt(0);
        
        while(R == 's'||R == 'S')
        {
        System.out.print("Numero de Cuenta del Cliente: ");
        NumCuenta = input.next();
        
        System.out.print("Saldo Inicial de la Cuenta: ");
        SaldoI = input.nextDouble();
        System.out.println("");
        
        System.out.print("Nuevos Cargos a la Cuenta: ");
        Cargos = input.nextDouble(); 
        System.out.println("");
     
        System.out.print("Credito a la Cuenta: ");
        Creditos = input.nextDouble();
        System.out.println("");
        
        System.out.print("Limite de credito de la cuenta: ");
        Limite = input.nextDouble();
        System.out.println("");
        
        System.out.print("Ingrese cualquier letra para terminar: ");
        R = input.next().charAt(0);
        
        SaldoN = (SaldoI + Cargos - Creditos);
        Contador = Contador + 1;
        }
        
        if (Contador !=0)
                {
        System.out.println("");
        System.out.println("***************************Creditos***********************************************");
        System.out.println("************************************************************************************");
        System.out.printf("Numero de Cuenta: %s%n", NumCuenta);
        System.out.printf("El Limite de Credito de tu cuenta es: %.2f%n", Limite);
        System.out.printf("Saldo Inicial: %.2f%n", SaldoI);
        System.out.printf("Nuevos cargos a tu cuenta: %.2f%n", Cargos);
        System.out.println("************************************************************************************");
        System.out.printf("Creditos aplicados a tu cuenta: %.2f%n", Creditos);
        System.out.printf("Tu nuevo saldo es: %.2f%n", SaldoN);
                            if (SaldoN > Limite)
                            System.out.println("Se excedio el limite de su credito");
                } 
        else
        {
            System.out.println("---------------------------No se Introdujeron datos-----------------------------");
        }
    }
}

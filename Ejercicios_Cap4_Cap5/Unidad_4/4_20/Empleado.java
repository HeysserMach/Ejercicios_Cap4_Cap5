/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Empleado {
    private String IdEmpleado;
    private String Nombre;
    private double CuotaH; // cuota por hora
    private double HoraTrab;
    private double HorasEx;
    private double PagoNormal;
    private double PagoEx;
    private double PagoTot;
    
    //set
    public void setIdEmpleado(String IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void setCuotaH(double CuotaH) {
        this.CuotaH = CuotaH;
    }
    
    public void setHoraTrab(double HoraTrab) {
        this.HoraTrab = HoraTrab;
    }
    
    //get
    
    public String getIdEmpleado() {
        return IdEmpleado;
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    public double getCuotaH() {
        return CuotaH;
    }
    
    public double getHoraTrab() {
        return HoraTrab;
    }
    
    public double getHorasEx() {
        return HoraTrab - 40;
    }
    
    public double getPagoNormal() {
    return CuotaH * HoraTrab - CuotaH * HorasEx;
    }
    
    public double getPagoEx() {
    return CuotaH * HorasEx / 2;
    }
    
    public double getPagoTot() {
    return PagoNormal + PagoEx;
    }
    
}

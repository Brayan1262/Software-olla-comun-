/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


public class Cliente {
    private String nombre;
    private String apellido;
    private int DNI;
    private double montopago;

    public Cliente(String nombre, String apellido, int DNI, double montopago) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.montopago = montopago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getMontopago() {
        return montopago;
    }

    public void setMontopago(double montopago) {
        this.montopago = montopago;
    }
}

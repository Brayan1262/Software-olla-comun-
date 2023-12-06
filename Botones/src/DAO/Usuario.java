/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


public class Usuario {
    public String nombreUsuario;
    public String contraseña;

    public Usuario(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public String setNombreUsuario(){
        this.nombreUsuario = nombreUsuario;
        return null;
    }
    public boolean verificarContraseña(String contraseña) {
        return this.contraseña.equals(contraseña);
    }
}

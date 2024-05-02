/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author vcarl
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String cedula;

    public Cliente(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public Cliente() {
        nombre = "Jose Horteda";
        apellido = "Ramirez Catillo";
        cedula = "13039321";
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public String toString(){
        return "\n-Informacion cliente: \nNombre del cliente: " + nombre + 
                "\nApellido del Cliente: " + apellido 
                + "\nCedula del Cliente: " + cedula;
    }
    
}

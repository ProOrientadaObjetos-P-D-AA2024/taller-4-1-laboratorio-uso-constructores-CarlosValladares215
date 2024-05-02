/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author vcarl
 */
public class Banco {
    private String nombreBanco;
    private String numeroSucursales;

    public Banco(String nombreBanco, String numeroSucursales) {
        this.nombreBanco = nombreBanco;
        this.numeroSucursales = numeroSucursales;
    }

    public Banco() {
        nombreBanco = "Banco de Loja";
        numeroSucursales = "7";
    }

    
    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getNumeroSucursales() {
        return numeroSucursales;
    }

    public void setNumeroSucursales(String numeroSucursales) {
        this.numeroSucursales = numeroSucursales;
    }
    
    public String toString(){
        return "-Banco: \nNombre del Banco: " + nombreBanco + 
                "\nNumero de Sucursales: " + numeroSucursales;
    }
    
}

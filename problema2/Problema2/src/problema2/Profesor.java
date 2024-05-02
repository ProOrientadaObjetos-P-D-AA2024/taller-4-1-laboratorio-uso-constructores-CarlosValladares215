/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

public class Profesor {

    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldoBasico;
    private double sueldoTotal;
    private Provincia provincia;

    public Profesor(String nombre, String apellido, String cedula,
            double sueldoBasico, Provincia provincia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sueldoBasico = sueldoBasico;
        this.provincia = provincia;
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

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public void calcularSueldoTotal() {
        this.sueldoTotal = (sueldoBasico * 0.2) + sueldoBasico;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nSueldo Básico: " + sueldoBasico +
               "\nSueldo Total: " + sueldoTotal + "\nCédula: " + cedula + "\n" + provincia.toString();
    }

}

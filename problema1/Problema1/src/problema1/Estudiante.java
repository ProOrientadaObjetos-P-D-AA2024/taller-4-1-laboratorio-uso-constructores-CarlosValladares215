/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

public class Estudiante {

    private String nombre;
    private double caliMateria1;
    private double caliMateria2;
    private double caliMateria3;
    private double promedioCalificaciones;
    private Universidad universidad;

    public Estudiante(String nombre, double caliMateria1, double caliMateria2,
            double caliMateria3, Universidad universidad) {
        this.nombre = nombre;
        this.caliMateria1 = caliMateria1;
        this.caliMateria2 = caliMateria2;
        this.caliMateria3 = caliMateria3;
        this.universidad = universidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCaliMateria1() {
        return caliMateria1;
    }

    public void setCaliMateria1(double caliMateria1) {
        this.caliMateria1 = caliMateria1;
    }

    public double getCaliMateria2() {
        return caliMateria2;
    }

    public void setCaliMateria2(double caliMateria2) {
        this.caliMateria2 = caliMateria2;
    }

    public double getCaliMateria3() {
        return caliMateria3;
    }

    public void setCaliMateria3(double caliMateria3) {
        this.caliMateria3 = caliMateria3;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public double getPromedioCalificaciones() {
        return promedioCalificaciones;
    }

    public void calcularPromedioCalificaciones() {
        this.promedioCalificaciones = (caliMateria1 + caliMateria2 + caliMateria3) / 3;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nCalificación Materia 1: " + caliMateria1
                + "\nCalificación Materia 2: " + caliMateria2 + "\nCalificación Materia 3: "
                + caliMateria3 + "\nPromedio de Calificaciones: " + promedioCalificaciones
                + "\n" + universidad.toString();
    }

}

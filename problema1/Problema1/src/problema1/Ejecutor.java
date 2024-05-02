/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    public static void main(String[] args) {

        Universidad universidad = new Universidad("Universidad UTP",
                "Calle 123, Ciudad ABC");

        Estudiante estudiante1 = new Estudiante("Juan", 8.5,
                9.5, 8.75, universidad);

        Estudiante estudiante2 = new Estudiante("María", 7.4,
                9.0, 8.5, universidad);

        estudiante1.calcularPromedioCalificaciones();
        estudiante2.calcularPromedioCalificaciones();
        
        System.out.println("-------------------------------------------------");
        System.out.println("Datos del Estudiante:");
        System.out.println("-------------------------------------------------");
        System.out.println(estudiante1.toString());
        System.out.println("-------------------------------------------------");
        
        System.out.println("-------------------------------------------------");
        System.out.println("\nDatos del Estudiante:");
        System.out.println("-------------------------------------------------");
        System.out.println(estudiante2.toString());
        System.out.println("-------------------------------------------------");
    }
}

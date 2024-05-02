/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

public class Ejecutor {

    public static void main(String[] args) {
        Provincia provincia1 = new Provincia("Loja", 1500000);

        Profesor profesor1 = new Profesor("Carlos", "González",
                "123456789",1500, provincia1);
        
        Profesor profesor2 = new Profesor("Ana", "Martínez",
                "987654321",2500, provincia1);
        
        profesor1.calcularSueldoTotal();
        profesor2.calcularSueldoTotal();
        
        System.out.println("-------------------------------------------------");
        System.out.println("Datos");
        System.out.println("-------------------------------------------------");
        System.out.println(profesor1.toString());
        System.out.println("-------------------------------------------------");
        
        System.out.println("-------------------------------------------------");
        System.out.println(profesor2.toString());
        System.out.println("-------------------------------------------------");

    }
}

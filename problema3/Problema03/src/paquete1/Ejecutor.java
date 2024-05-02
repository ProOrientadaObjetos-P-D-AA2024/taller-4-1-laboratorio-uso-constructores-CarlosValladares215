package paquete1;

import paquete2.Automotor;
import paquete2.Fabricante;

public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String cedulaD = "135768523";

        // objeto 1
        Automotor automotor1 = new Automotor();
        Fabricante fabricante1 = new Fabricante();

        automotor1.setCedulaPropietario(cedulaD);
        automotor1.calcularAntiguedadVehiculo();
        automotor1.calcularValorMatricula();

        System.out.println("---------------Vehículo 1------------------------");
        System.out.println(automotor1.toString() + fabricante1.toString());

        // objeto 2
        Automotor automotor2 = new Automotor(2017, 30000);
        Fabricante fabricante2
                = new Fabricante("Armando Herrera", "Quito");

        cedulaD = "17541516";

        automotor2.setCedulaPropietario(cedulaD);
        automotor2.calcularAntiguedadVehiculo();
        automotor2.calcularValorMatricula();

        System.out.println("---------------Vehículo 2------------------------");
        System.out.println(automotor2.toString() + fabricante2.toString());

    }

}

package paquete1;

import paquete2.Banco;
import paquete2.Cheque;
import paquete2.Cliente;

public class Ejecutor {

    public static void main(String[] args) {

        // objeto 1
        Cheque cheque01 = new Cheque();
        Banco banco01 = new Banco();
        Cliente cliente01 = new Cliente();

        cheque01.CalcularComision();

        System.out.println("------------------Cheque #01-------------------- ");
        System.out.printf(banco01.toString());
        System.out.printf(cliente01.toString());
        System.out.printf(cheque01.toString());

        // objeto 2
        Cheque cheque02 = new Cheque(4300);
        Banco banco02
                = new Banco("Banco del Pichincha", "5");
        Cliente cliente02
                = new Cliente("Maria Fernanda", "Quizpe Armijos", "103930202");

        cheque02.CalcularComision();

        System.out.println("------------------Cheque #02-------------------- ");
        System.out.printf(banco02.toString());
        System.out.printf(cliente02.toString());
        System.out.printf(cheque02.toString());
    }

}

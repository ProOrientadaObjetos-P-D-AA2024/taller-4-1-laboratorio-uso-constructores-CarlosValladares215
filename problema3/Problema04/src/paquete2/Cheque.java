/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author utpl
 */
public class Cheque {
    private double valorCheque;
    private double comision;

    public Cheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }

    public Cheque() {
        valorCheque = 3000;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }

    public double getComision() {
        return comision;
    }

    public void CalcularComision() {
        comision = valorCheque + ((valorCheque * 0.003 / 100));
    }
    
    public String toString(){
        return "\n-Cheque: \nValor Cheque: " + valorCheque + "\nComision del Banco: " 
                + comision + "\n";
    }
}

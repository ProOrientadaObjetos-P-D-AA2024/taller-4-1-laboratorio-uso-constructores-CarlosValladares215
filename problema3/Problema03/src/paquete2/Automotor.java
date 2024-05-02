package paquete2;


public class Automotor {
    
    private String cedulaPropietario;
    private Fabricante nombreFabricante;
    private Fabricante ciudadOrigen;
    private int fechaFabricacion;
    private int antiguedadVehiculo;
    private int valorVehiculo;
    private double valorMatricula;

    public Automotor(int fechaFabricacion, int valorVehiculo) {
        this.fechaFabricacion = fechaFabricacion;
        this.valorVehiculo = valorVehiculo;
    }


    public Automotor() {
        fechaFabricacion = 2020;
        valorVehiculo = 15000;
    }
    
    public int getAntiguedadVehiculo() {
        return antiguedadVehiculo;
    }

    public void calcularAntiguedadVehiculo() {
        antiguedadVehiculo = 2024 - fechaFabricacion;
    }
    
    
    public String getCedulaPropietario() {
        return cedulaPropietario;
    }

    public void setCedulaPropietario(String cedulaPropietario) {
        this.cedulaPropietario = cedulaPropietario;
    }

    public int getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(int fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public int getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(int valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void calcularValorMatricula() {
        valorMatricula = ((valorVehiculo * 0.002 )/100) + valorVehiculo;
        valorMatricula = valorMatricula * antiguedadVehiculo;
    }
    
    public String toString(){
        return "Cédula del dueño: " + cedulaPropietario + "\nAño de fabricación: " 
                + fechaFabricacion + "\nValor de Vehículo: " + valorVehiculo 
                + "\nValor de Matricula: "+ valorMatricula;
        
    }
    
}

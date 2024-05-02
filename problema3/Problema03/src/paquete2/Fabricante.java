package paquete2;

public class Fabricante {
    private String nombreFabricante;
    private String ciudadOrigen;

    public Fabricante(String nombreFabricante, String ciudadOrigen) {
        this.nombreFabricante = nombreFabricante;
        this.ciudadOrigen = ciudadOrigen;
    }

    public Fabricante() {
        nombreFabricante = "Ana Maria";
        ciudadOrigen = "Loja";
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }
    
    public String toString(){
         return "\n- Datos del Fabricante: " + "\nFabricante: "
                + nombreFabricante + "\nCiudad de Origen: " + 
                ciudadOrigen;
    }
}

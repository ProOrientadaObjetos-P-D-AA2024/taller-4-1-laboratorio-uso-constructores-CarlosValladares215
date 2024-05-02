/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

public class Provincia {
    private String provincia;
    private int habitantes;

    public Provincia(String provincia, int habitantes) {
        this.provincia = provincia;
        this.habitantes = habitantes;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }
    
        @Override
    public String toString() {
        return "Provincia: " + provincia + ", Habitantes: " + habitantes;
    }
    
}

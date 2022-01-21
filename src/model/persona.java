package model;

public class persona {
    //Definimos una clase en JAVA
    
    private int numPersona; // ID persona
    private String nombre;  // Nombre persona
    private double sueldo;  // Sueldo persona

    public persona(int numPersona, String nombre, double sueldo) {
        this.numPersona = numPersona;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getNumPersona() {
        return numPersona;
    }

    public void setNumPersona(int numPersona) {
        this.numPersona = numPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString(){
        return "persona{NumPersona: " + numPersona + ", Nombre: " + nombre + ", Sueldo:$" + sueldo + "}";
    }
}

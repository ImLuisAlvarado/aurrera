/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.aurrera.entities.aurrera;

/**
 *
 * @author alumnog
 */
public class Articulos {

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the tasaIva
     */
    public double getTasaIva() {
        return tasaIva;
    }

    /**
     * @param tasaIva the tasaIva to set
     */
    public void setTasaIva(int tasaIva) {
        this.tasaIva = tasaIva;
    }
    private String codigo;
    private String nombre;
    private double precio;
    private double tasaIva;
}

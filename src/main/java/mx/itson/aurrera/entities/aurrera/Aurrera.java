/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.aurrera.entities.aurrera;

import com.google.gson.Gson;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alumnog
 */
public class Aurrera {

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the atendidoPor
     */
    public String getAtendidoPor() {
        return atendidoPor;
    }

    /**
     * @param atendidoPor the atendidoPor to set
     */
    public void setAtendidoPor(String atendidoPor) {
        this.atendidoPor = atendidoPor;
    }

    /**
     * @return the articulos
     */
    public List<Articulos> getArticulos() {
        return articulos;
    }

    /**
     * @param articulos the articulos to set
     */
    public void setArticulos(List<Articulos> articulos) {
        this.articulos = articulos;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the sucursal
     */
    public Sucursal getSucursal() {
        return sucursal;
    }

    /**
     * @param sucursal the sucursal to set
     */
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    private Date fecha;
    private String atendidoPor;
    private List<Articulos> articulos;
    private Cliente cliente;
    private Sucursal sucursal;
    
    
    public Aurrera deserializar (String json){
        Aurrera aurrera = new Aurrera();
        try{
             aurrera = new Gson().fromJson(json, Aurrera.class);
        }catch(Exception ex){
            System.err.println("Ocurrió un error al deserializar");
    }
        return aurrera;
}}

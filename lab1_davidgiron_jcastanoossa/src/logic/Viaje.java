package logic;

import java.util.Date;

/**
 * Clase abstracta de Viaje
 * @author Jeferson Castano Ossa <jcastanoossa@unicauca.edu.co>
 * @author David Santiago Giron Munoz <davidgiron@unicauca.edu.co>
*/
public abstract class Viaje {

    protected String origen;
    protected String destino;
    protected int costo;
    protected Date fechaSalida;
    protected Date fechaLlegada;
    
    /**
     * Constructor parametrizado de Viaje
     * @param origen origen del viaje
     * @param destino destino del viaje
     * @param costo costo del viaje
     * @param fechaSalida fecha de salida del viaje
     * @param fechaLlegada fecha de llegada del viaje
     */
    public Viaje(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }
    
    /**
     * Metodo abstracto
     * @return Descripcion del viaje
     */
    public abstract String descripcion();
    
    /**
     * @return Cadena del metodo 1
     */
    public String cualquierMetodo() {
        return  "Cualquier método implementado en la clase base";
    }
    
    /**
     * @return Cadena del metodo 2
     */
    public String cualquierMetodo2() {
        return  "Cualquier método2 implementado en la clase base";
    }
    
    //getters and setters
    
    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the costo
     */
    public int getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
     * @return the fechaSalida
     */
    public Date getFechaSalida() {
        return fechaSalida;
    }

    /**
     * @param fechaSalida the fechaSalida to set
     */
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * @return the fechaLlegada
     */
    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    /**
     * @param fechaLlegada the fechaLlegada to set
     */
    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }
}
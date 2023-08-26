package logic;

import java.util.Date;

/**
 * Especializacion de la clase abstracta Viaje para un viaje de tipo familiar
 * @author Jeferson Castano Ossa <jcastanoossa@unicauca.edu.co>
 * @author David Santiago Giron Munoz <davidgiron@unicauca.edu.co>
*/
public class ViajeFamiliar extends Viaje {
    /**
    * Cantidad de integrantes de la familia
    */
    private int familia;
    
    /**
     * Constructor parametrizado de ViajeFamiliar
     * @param origen origen del viaje
     * @param destino destino del viaje
     * @param costo costo del viaje
     * @param fechaSalida fecha de salida del viaje
     * @param fechaLlegada fecha de llegada del viaje
     * @param familia cantidad de integrantes de la familia
     */
    public ViajeFamiliar(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, int familia) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.familia = familia;
    }
    
    /**
     * @return Descripcion del viaje familiar
     */
    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia";
    }
    
    /**
     * @return Cadena sobreescrita del metodo 2 
     */
    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje familiar";
    }
    
    //getters and setters
    
    /**
     * @return the familia
     */
    public int getFamilia() {
        return familia;
    }

    /**
     * @param familia the familia to set
     */
    public void setFamilia(int familia) {
        this.familia = familia;
    }
}

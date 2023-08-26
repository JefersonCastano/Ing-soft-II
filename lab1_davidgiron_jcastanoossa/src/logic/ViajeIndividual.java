package logic;

import java.util.Date;

/**
 * Especializacion de la clase abstracta Viaje para un viaje individual
 * @author Jeferson Castano Ossa <jcastanoossa@unicauca.edu.co>
 * @author David Santiago Giron Munoz <davidgiron@unicauca.edu.co>
*/
public class ViajeIndividual extends Viaje {
    
    /**
     * Constructor parametrizado de ViajeIndividual
     * @param origen origen del viaje
     * @param destino destino del viaje
     * @param costo costo del viaje
     * @param fechaSalida fecha de salida del viaje
     * @param fechaLlegada fecha de llegada del viaje
     */
    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }
    
    /**
     * @return Descripcion del viaje individual
     */
    @Override
    public String descripcion() {
        return "Disfruta tu viaje individual";
    }
    
    //No se sobreescribe cualquierMetodo2()
}
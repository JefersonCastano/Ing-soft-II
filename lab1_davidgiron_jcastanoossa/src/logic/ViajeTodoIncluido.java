package logic;

import java.util.Date;

/**
 * Especializacion de la clase abstracta Viaje para un viaje todo incluido
 * @author Jeferson Castano Ossa <jcastanoossa@unicauca.edu.co>
 * @author David Santiago Giron Munoz <davidgiron@unicauca.edu.co>
*/
public class ViajeTodoIncluido extends Viaje {

    /**
     * Constructor parametrizado de ViajeTodoIncluido
     * @param origen origen del viaje
     * @param destino destino del viaje
     * @param costo costo del viaje
     * @param fechaSalida fecha de salida del viaje
     * @param fechaLlegada fecha de llegada del viaje
     */
    public ViajeTodoIncluido(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }
    
    /**
     * @return Descripcion del viaje todo incluido
     */
    @Override
    public String descripcion() {
        return "Disfruta tu viaje todo incluido";
    }
    
    //No se sobreescribe cualquierMetodo2()
}
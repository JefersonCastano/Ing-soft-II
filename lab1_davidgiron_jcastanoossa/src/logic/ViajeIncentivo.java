package logic;

import java.util.Date;

/**
 * Especializacion de la clase abstracta Viaje para un viaje de incentivo
 * @author Jeferson Castano Ossa <jcastanoossa@unicauca.edu.co>
 * @author David Santiago Giron Munoz <davidgiron@unicauca.edu.co>
*/
public class ViajeIncentivo extends Viaje {
    /**
    * Empresa que patrocina el viaje al empleado
    */
    private String empresa;
    
    /**
     * Constructor parametrizado de ViajeIncentivo
     * @param origen origen del viaje
     * @param destino destino del viaje
     * @param costo costo del viaje
     * @param fechaSalida fecha de salida del viaje
     * @param fechaLlegada fecha de llegada del viaje
     * @param empresa empresa que patrocina el viaje
     */
    public ViajeIncentivo(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, String empresa) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.empresa = empresa;
    }
    
    /**
     * @return Descripcion del viaje de incentivo
     */
    @Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa " + getEmpresa();
    }
    
    /**
     * @return Cadena sobreescrita del metodo 2 
     */
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje de incentivo";
    }
    
    //getters and setters
    
    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}

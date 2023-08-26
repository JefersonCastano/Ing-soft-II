package logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import logic.Viaje;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas para la clase abstracta de Viaje
 * @author Jeferson Castano Ossa <jcastanoossa@unicauca.edu.co>
 * @author David Santiago Giron Munoz <davidgiron@unicauca.edu.co>
*/
public class ViajeTest {
    /**
     * Objetos de viajes para realizar pruebas
     */
    Viaje viaje1;
    Viaje viaje2;
    Viaje viaje3;
    Viaje viaje4;
    

    public ViajeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @After
    public void tearDown() {
    }
    
    /**
     * Instanciar viaje1, viaje2, viaje3, viaje4 antes de ejecutar cada prueba
     */
    @Before
    public void setUp() throws ParseException {
        viaje1 = new ViajeFamiliar("Popayán", "Bogotá", 1250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"), 5);
        viaje2 = new ViajeIncentivo("Popayán", "Medellin", 2100000, new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), "Emtel");
        viaje3 = new ViajeIndividual("Popayán", "San Andres", 4250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
        viaje4 = new ViajeTodoIncluido("Popayán", "Cartagena", 7350000, new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
    }
    
    /**
     * El metodo descripcion al ser abstracto se debe implementar 
     * en cada clase hija por separado y al ser diferentes tipos de 
     * viaje, deberan tener diferentes tipos de descripciones
     */
    @Test
    public void testDescripcion() throws ParseException {
        
        assertNotEquals(viaje1.descripcion(), viaje2.descripcion());
        assertNotEquals(viaje2.descripcion(), viaje3.descripcion());
        assertNotEquals(viaje3.descripcion(), viaje4.descripcion());
    }

    /**
     * El metodo cualquierMetodo no se sobreescribe en ninguna clase,
     * por lo que debe retornar lo implementado en la clase abstracta 
     * para todas
     */
    @Test
    public void testCualquierMetodo() throws ParseException {
        
        assertEquals(viaje1.cualquierMetodo(), viaje2.cualquierMetodo());
        assertEquals(viaje2.cualquierMetodo(), viaje3.cualquierMetodo());
        assertEquals(viaje3.cualquierMetodo(), viaje4.cualquierMetodo());
    }

    /**
     * El metodo cualquierMetodo2 se sobreescribe en las clases
     * ViajeFamiliar y ViajeIncentivo, pero en las clases ViajeIndividual
     * y ViajeTodoIncluido tienen la implementacion de la clase abstracta
     */
    @Test
    public void testCualquierMetodo2() throws ParseException {
        
        assertNotEquals(viaje1.cualquierMetodo2(), viaje3.cualquierMetodo2());
        assertNotEquals(viaje2.cualquierMetodo2(), viaje3.cualquierMetodo2());
    
        assertEquals(viaje3.cualquierMetodo2(), viaje4.cualquierMetodo2());
    }

    /**
     * Test of getOrigen method, of class Viaje.
     */
    @Test
    public void testGetOrigen() throws ParseException {

        String expResult = "Popayán";
        String result = viaje1.getOrigen();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setOrigen method, of class Viaje.
     */
    @Test
    public void testSetOrigen() throws ParseException {
        
        String origen = "Cali";
        viaje1.setOrigen(origen);
        
       assertEquals(origen, viaje1.getOrigen());
    }

    /**
     * Test of getDestino method, of class Viaje.
     */
    @Test
    public void testGetDestino() throws ParseException {

        String expResult = "Bogotá";
        String result = viaje1.getDestino();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setDestino method, of class Viaje.
     */
    @Test
    public void testSetDestino() throws ParseException {

        String destino = "Cali";
        viaje1.setDestino(destino);
        
       assertEquals(destino, viaje1.getDestino());
    }

    /**
     * Test of getCosto method, of class Viaje.
     */
    @Test
    public void testGetCosto() throws ParseException {

        int expResult = 1250000;
        int result = viaje1.getCosto();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setCosto method, of class Viaje.
     */
    @Test
    public void testSetCosto() throws ParseException {

        int costo = 2250000;
        viaje1.setCosto(costo);
        
       assertEquals(costo, viaje1.getCosto());
    }

    /**
     * Test of getFechaSalida method, of class Viaje.
     */
    @Test
    public void testGetFechaSalida() throws ParseException {

        Date expResult = new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019");
        Date result = viaje1.getFechaSalida();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setFechaSalida method, of class Viaje.
     */
    @Test
    public void testSetFechaSalida() throws ParseException {

        Date fechaSalida = new SimpleDateFormat("dd/MM/yyyy").parse("03/05/2019");
        viaje1.setFechaSalida(fechaSalida);
        
       assertEquals(fechaSalida, viaje1.getFechaSalida());
    }

    /**
     * Test of getFechaLlegada method, of class Viaje.
     */
    @Test
    public void testGetFechaLlegada() throws ParseException {
 
        Date expResult = new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019");
        Date result = viaje1.getFechaLlegada();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setFechaLlegada method, of class Viaje.
     */
    @Test
    public void testSetFechaLlegada() throws ParseException {
   
        Date fechaLlegada = new SimpleDateFormat("dd/MM/yyyy").parse("07/05/2019");
        viaje1.setFechaLlegada(fechaLlegada);
        
       assertEquals(fechaLlegada, viaje1.getFechaLlegada());
    }
}
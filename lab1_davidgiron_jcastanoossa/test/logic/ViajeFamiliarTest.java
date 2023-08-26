package logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;

/**
 * Pruebas para la clase ViajeFamiliar
 * @author Jeferson Castano Ossa <jcastanoossa@unicauca.edu.co>
 * @author David Santiago Giron Munoz <davidgiron@unicauca.edu.co>
*/
public class ViajeFamiliarTest {
    /**
     * Objeto de Viaje para realizar pruebas
     */
    ViajeFamiliar viaje1;
    
    public ViajeFamiliarTest() {
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
     * Instanciar viaje1 antes de ejecutar cada prueba
     */
    @Before
    public void setUp() throws ParseException {
        viaje1 = new ViajeFamiliar("Popayán", "Bogota", 1250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"), 5);
    }
    
    /**
     * Test of ViajeFamiliar method, of class ViajeFamiliar.
     */
    @Test
    public void testViajeFamiliar() throws ParseException {
        
        assertEquals(viaje1.getOrigen(), "Popayán");
        assertEquals(viaje1.getDestino(), "Bogota");
        assertEquals(viaje1.getCosto(), 1250000);
        assertEquals(viaje1.getFechaSalida(),new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"));
        assertEquals(viaje1.getFechaLlegada(),new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"));
        assertEquals(viaje1.getFamilia(), 5);

    }
    /**
     * Test of descripcion method, of class ViajeFamiliar.
     */
    @Test
    public void testDescripcion() throws ParseException {
        
        String expResult = "Viaje para disfrutar con toda tu familia";
        String result = viaje1.descripcion();
        assertEquals(expResult, result);
    }

    /**
     * Test of cualquierMetodo2 method, of class ViajeFamiliar.
     */
    @Test
    public void testCualquierMetodo2() throws ParseException {

        String expResult = "Método implementado en la clase hija viaje familiar";
        String result = viaje1.cualquierMetodo2();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFamilia method, of class ViajeFamiliar.
     */
    @Test
    public void testGetFamilia() throws ParseException {

        int expResult = 5;
        int result = viaje1.getFamilia();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setFamilia method, of class ViajeFamiliar.
     */
    @Test
    public void testSetFamilia() throws ParseException {

        int familia = 6;
        viaje1.setFamilia(familia);
        
       assertEquals(familia, viaje1.getFamilia());
    }
    
}

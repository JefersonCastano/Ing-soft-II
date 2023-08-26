package logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas para la clase ViajeIndividual
 * @author Jeferson Castano Ossa <jcastanoossa@unicauca.edu.co>
 * @author David Santiago Giron Munoz <davidgiron@unicauca.edu.co>
*/
public class ViajeIndividualTest {
    /**
     * Objeto de ViajeIndividual para realizar pruebas
     */
    ViajeIndividual viaje3;
    
    public ViajeIndividualTest() {
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
     * 
     * Instanciar viaje3 antes de ejecutar cada prueba
     */
    @Before
    public void setUp() throws ParseException {
        viaje3 = new ViajeIndividual("Popayán", "San Andres", 4250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
    }

    /**
     * Test of descripcion method, of class ViajeIndividual.
     */
    @Test
    public void testViajeIndividual() throws ParseException {
        assertEquals(viaje3.getOrigen(), "Popayán");
        assertEquals(viaje3.getDestino(), "San Andres");
        assertEquals(viaje3.getCosto(), 4250000);
        assertEquals(viaje3.getFechaSalida(),new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"));
        assertEquals(viaje3.getFechaLlegada(),new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
    }
    
    /**
     * Test of descripcion method, of class ViajeIndividual.
     */
    @Test
    public void testDescripcion() {
        String expResult = "Disfruta tu viaje individual";
        String result = viaje3.descripcion();
        assertEquals(expResult, result);
    }
    
}

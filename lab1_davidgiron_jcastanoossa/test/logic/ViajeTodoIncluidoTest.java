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
 * Pruebas para la clase ViajeTodoIncluido
 * @author Jeferson Castano Ossa <jcastanoossa@unicauca.edu.co>
 * @author David Santiago Giron Munoz <davidgiron@unicauca.edu.co>
*/
public class ViajeTodoIncluidoTest {
    /**
     * Objeto de ViajeTodoIncluido para realizar pruebas
     */
    ViajeTodoIncluido viaje4;
    
    public ViajeTodoIncluidoTest() {
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
     * Instanciar viaje4 antes de ejecutar cada prueba
     */
    @Before
    public void setUp() throws ParseException {
        viaje4 = new ViajeTodoIncluido("Popayán", "Cartagena", 7350000, new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
    }

    /**
     * Test of descripcion method, of class ViajeTodoIncluido.
     */
    @Test
    public void testViajeTodoIncluido() throws ParseException {
        
        assertEquals(viaje4.getOrigen(), "Popayán");
        assertEquals(viaje4.getDestino(), "Cartagena");
        assertEquals(viaje4.getCosto(), 7350000);
        assertEquals(viaje4.getFechaSalida(),new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"));
        assertEquals(viaje4.getFechaLlegada(),new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));

    }
    
    /**
     * Test of descripcion method, of class ViajeTodoIncluido.
     */
    @Test
    public void testDescripcion() {
        String expResult = "Disfruta tu viaje todo incluido";
        String result = viaje4.descripcion();
        assertEquals(expResult, result);
    }
}

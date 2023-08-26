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
 * Pruebas para la clase ViajeIncentivo
 * @author Jeferson Castano Ossa <jcastanoossa@unicauca.edu.co>
 * @author David Santiago Giron Munoz <davidgiron@unicauca.edu.co>
*/
public class ViajeIncentivoTest {
    /**
     * Objeto de ViajeIncentivo para realizar pruebas
     */
    ViajeIncentivo viaje2;
    
    public ViajeIncentivoTest() {
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
     * Instanciar viaje2 antes de ejecutar cada prueba
     */
    @Before
    public void setUp() throws ParseException {
        viaje2 = new ViajeIncentivo("Popayán", "Medellin", 2100000, new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), "Emtel");
    }
    
    /**
     * Test of testViajeIncentivo method, of class ViajeIncentivo.
     */
    @Test
    public void testViajeIncentivo() throws ParseException {

        assertEquals(viaje2.getOrigen(), "Popayán");
        assertEquals(viaje2.getDestino(), "Medellin");
        assertEquals(viaje2.getCosto(), 2100000);
        assertEquals(viaje2.getFechaSalida(),new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"));
        assertEquals(viaje2.getFechaLlegada(),new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"));
        assertEquals(viaje2.getEmpresa(),"Emtel");
    }
    
    /**
     * Test of descripcion method, of class ViajeIncentivo.
     */
    @Test
    public void testDescripcion() {
        String expResult = "Viaje incentivo que te envia la empresa " + viaje2.getEmpresa();
        String result = viaje2.descripcion();
        assertEquals(expResult, result);
    }

    /**
     * Test of cualquierMetodo2 method, of class ViajeIncentivo.
     */
    @Test
    public void testCualquierMetodo2() {
        String expResult = "Método implementado en la clase hija viaje de incentivo";
        String result = viaje2.cualquierMetodo2();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmpresa method, of class ViajeIncentivo.
     */
    @Test
    public void testGetEmpresa() {
        String expResult = "Emtel";
        String result = viaje2.getEmpresa();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmpresa method, of class ViajeIncentivo.
     */
    @Test
    public void testSetEmpresa() {
        String empresa = "Avianca";
        viaje2.setEmpresa(empresa);
        
       assertEquals(empresa, viaje2.getEmpresa());
    } 
}

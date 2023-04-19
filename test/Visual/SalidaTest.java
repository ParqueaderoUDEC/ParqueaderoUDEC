import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SalidaTest {

    @Test
    public void testInitComponents() {
        Salida salida = new Salida();
        salida.initComponents();
        assertNotNull(salida.jTextField1);
        assertNotNull(salida.jButton2);
        assertNotNull(salida.jLabel1);
        assertNotNull(salida.jTextField2);
        assertNotNull(salida.jLabel2);
        assertNotNull(salida.jButton1);
        assertNotNull(salida.jScrollPane1);
        assertNotNull(salida.jTextArea1);
        assertNotNull(salida.jButton3);
    }

    @Test
    public void testJButton3ActionPerformed() {
        Salida salida = new Salida();
        Portada portada = new Portada();
        salida.jButton3.doClick();
        assertFalse(salida.isVisible());
        assertTrue(portada.isVisible());
    }
}

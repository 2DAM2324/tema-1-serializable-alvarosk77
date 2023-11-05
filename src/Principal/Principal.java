
package Principal;

import Interfaz.Ventana1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.NotSerializableException;
import org.xml.sax.SAXException;

/**
 *
 * @author alvar
 */
public class Principal {
    
    public static void main(String avgr[]) throws IOException, FileNotFoundException, ClassNotFoundException, NotSerializableException, SAXException{
        
        Ventana1 prueba = new Ventana1();
        prueba.setVisible(true);
    
    }
}

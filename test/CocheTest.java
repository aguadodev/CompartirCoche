
package compartircoche;

import org.junit.Test;
import static org.junit.Assert.*;

public class CocheTest {
    
    public CocheTest() {
    }

@Test
public void validarMatricula(){
    assertFalse(Coche.validarMatricula("123"));
    assertFalse(Coche.validarMatricula("1234BBBB"));
    assertFalse(Coche.validarMatricula("12A4BBB"));
    assertFalse(Coche.validarMatricula("12.4BBB"));
    assertFalse(Coche.validarMatricula("1234BAB"));
    assertFalse(Coche.validarMatricula("1234BB."));
    assertFalse(Coche.validarMatricula("1234B5B"));
    assertFalse(Coche.validarMatricula("1234BúB"));
    assertFalse(Coche.validarMatricula("1234BÚB"));
    assertFalse(Coche.validarMatricula("1234BñB"));
}        
    
}
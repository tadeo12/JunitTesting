
import org.example.FuncionesVarias;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionesVariasTest {

    //tests esPar

    @Test
    public void esParCeroTest(){
        boolean result = FuncionesVarias.esPar(0);
        assertTrue(result);
    }
    @Test
    public void esParConPositivoParTest(){
        boolean result = FuncionesVarias.esPar(6);
        assertTrue(result);
    }
    @Test
    public void esParConPositivoImparParTest(){
        boolean result = FuncionesVarias.esPar(5);
        assertFalse(result);
    }
    @Test
    public void esParConNegativoParTest(){
        boolean result = FuncionesVarias.esPar(-2);
        assertTrue(result);
    }
    @Test
    public void esParConNegativoImparParTest(){
        boolean result = FuncionesVarias.esPar(-1);
        assertFalse(result);
    }

    //test factorial
    @Test
    public void factorialPositivoTest(){
        int result=FuncionesVarias.factorial(5);
        assertEquals(120,result);
    }
    @Test
    public void factorialNegativoTest(){
        int result=FuncionesVarias.factorial(-4);
        assertEquals(-1,result);
    }
    @Test
    public void factorialDeCeroTest(){
        int result=FuncionesVarias.factorial(0);
        assertEquals(1,result);
    }
    @Test
    public void factorialDeUnoTest(){
        int result=FuncionesVarias.factorial(1);
        assertEquals(1,result);
    }

    //tests esPrimo
    @Test
    public void esDosPrimoTest(){
        assertTrue(FuncionesVarias.esPrimo(2));
    }
    @Test
    public void esPrimoNegativoTest(){
        assertFalse(FuncionesVarias.esPrimo(-6));
    }
    @Test
    public void esPrimoAltoTest(){
        assertTrue(FuncionesVarias.esPrimo(99991));
    }
    @Test
    public void esPrimoAltoNoPrimoTest(){
        assertFalse(FuncionesVarias.esPrimo(99995));
    }

    @Test
    public void esOncePrimoTest(){
        assertTrue(FuncionesVarias.esPrimo(11));
    }

}

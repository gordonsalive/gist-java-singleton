package playground;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void singletonShouldHaveCountOf1() {
        assertEquals("Hello! count=1", Singleton.getSingleton().sayHello() );
        assertEquals("Hello! count=1", Singleton.getSingleton().sayHello() );
    }
}

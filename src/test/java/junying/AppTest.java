package junying;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.slf4j.Logger;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    private final Logger log = getLogger(getClass());

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        log.info("Hello World");
        assertTrue( true );
    }
}

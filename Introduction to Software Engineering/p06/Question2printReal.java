import io.ConsoleRedirect;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class Question2printReal
{
  @Before
  public void setup()
  {
    printRealTest();
  }

  @Test
  public void printRealTest()
  {
    String num;
    int decimalPlaces;
    ConsoleRedirect.captureOutput();
    MiscUtils2.printReal(4.0567, 2);
    num = ConsoleRedirect.getCapturedOutput();
    assertEquals("4.06", num);

    ConsoleRedirect.captureOutput();
    MiscUtils2.printReal(4.0567, 0);
    num = ConsoleRedirect.getCapturedOutput();
    assertEquals("4", num);

    ConsoleRedirect.captureOutput();
    MiscUtils2.printReal(4.1, 4);
    num = ConsoleRedirect.getCapturedOutput();
    assertEquals("4.1000", num);
  }
  public void tearDown()
  {
    ConsoleRedirect.restoreInput();
    ConsoleRedirect.restoreOutput();
  }
}
    
    
    
    
    

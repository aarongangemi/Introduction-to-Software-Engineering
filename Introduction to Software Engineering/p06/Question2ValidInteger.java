import io.ConsoleRedirect;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class Question2ValidInteger
{
  @Before
  public void setup()
  {
    ConsoleRedirect.captureOutput();
  }
  @Test
  public void readValidInt()
  {
    int result;
    String x;
    ConsoleRedirect.fakeInput("25");
    result =  MiscUtils2.readValidInt();
    x = ConsoleRedirect.getCapturedOutput();
    assertEquals(25, result);
    assertEquals(x, "Enter a valid integer:");

    ConsoleRedirect.fakeInput("2x");
    result = MiscUtils2.readValidInt();
    x = ConsoleRedirect.getCapturedOutput();
    assertEquals(-1, result);
    assertEquals(x, "Enter a valid integer:");

    ConsoleRedirect.fakeInput("");
    result = MiscUtils2.readValidInt();
    x = ConsoleRedirect.getCapturedOutput();
    assertEquals(-1, result);
    assertEquals(x, "Enter a valid integer:");
  }
  @After
  public void tearDown()
  {
    ConsoleRedirect.restoreInput();
    ConsoleRedirect.restoreOutput();
  }
}
    

import io.ConsoleRedirect;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class Question1Max
{ 
  @Test
  public void testMax()
  {
    String actual;
    String s = "Enter first integer: Enter second integer: The maximum is ";
    ConsoleRedirect.fakeInput("2\n5");
    ConsoleRedirect.captureOutput();
    Max.max();
    actual = ConsoleRedirect.getCapturedOutput();
    assertEquals(s + "5", actual);

    ConsoleRedirect.fakeInput("6\n2");
    ConsoleRedirect.captureOutput();
    Max.max();
    actual = ConsoleRedirect.getCapturedOutput();
    assertEquals(s + "6", actual); 
   
    ConsoleRedirect.fakeInput("5\n5");
    ConsoleRedirect.captureOutput();
    Max.max();
    actual = ConsoleRedirect.getCapturedOutput();
    assertEquals(s + "5", actual);

    ConsoleRedirect.restoreInput();
    ConsoleRedirect.restoreOutput();
  }
}


import java.util.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
public class MiscUtilsTest
{
    @Test
    public void testMax()
    {
     int actual;
     actual = MiscUtils.max(6, 5);
     assertEquals("max6,5", 6, actual);

     actual = MiscUtils.max(5, 7);
     assertEquals("max7,6", 7, actual);

     actual = MiscUtils.max(6,6);
     assertEquals("max6,6" , 6, actual);

     
    }
    @Test
    public void testcalcGrade()
    {
       
     String mark;
     mark = MiscUtils.calcGrade(49);
     assertEquals("GradeF", "F", mark); 

     mark = MiscUtils.calcGrade(51);
     assertEquals("Score50's","5", mark); 

     mark = MiscUtils.calcGrade(61);
     assertEquals("Score60's", "6", mark);
     
     mark = MiscUtils.calcGrade(71);
     assertEquals("Score70's", "7", mark);

     mark = MiscUtils.calcGrade(81);
     assertEquals("Score80's", "8", mark);

     mark = MiscUtils.calcGrade(91);
     assertEquals("Score90's", "9", mark);

     mark = MiscUtils.calcGrade(-23);
     assertEquals ("ScoreNothing", "", mark);
    }
    @Test
    public void testroomArea()
    {
     int calcArea;
     calcArea = MiscUtils.roomArea(3,2);
     assertEquals("InvalidRoomArea",0,calcArea);

     calcArea = MiscUtils.roomArea(5,15);
     assertEquals("validRoomArea",75,calcArea);

     calcArea = MiscUtils.roomArea(30, 5);
     assertEquals("InvalidRoomArea",0,calcArea);

     calcArea = MiscUtils.roomArea(-40, -1);
     assertEquals("InvalidRoomArea",0,calcArea);

     calcArea = MiscUtils.roomArea(-4, -12);
     assertEquals("InvalidRoomArea",0,calcArea);

     calcArea = MiscUtils.roomArea(-3, -20);
     assertEquals("InvalidRoomArea",0,calcArea);
    }
}

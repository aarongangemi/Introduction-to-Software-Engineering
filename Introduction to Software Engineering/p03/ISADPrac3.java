import java.util.*;
public class ISADPrac3
{
    public static void main(String[] args)
    {
     testMax();
     testcalcGrade();
     testroomArea();

    }

    public static void testMax()
    {
     int port;
     int actual;
     actual = MiscUtils.max(6,5);
     assert 6 == actual: "6 is greater than 5";

     actual = MiscUtils.max(5,7);
     assert 7 == actual: "7 is greater than 5";

     actual = MiscUtils.max(6,6);
     assert 6 == actual: "6 is equal to 6";
    }
   
    public static void testcalcGrade()
    {
       
     String mark;
     mark = MiscUtils.calcGrade(49);
     assert ("F".equals(mark)): "49 is less than 50";

     mark = MiscUtils.calcGrade(51);
     assert ("5".equals(mark)): "51 is equal to 5";

     mark = MiscUtils.calcGrade(61);
     assert ("6".equals(mark)): "61 is equal to 6";
     
     mark = MiscUtils.calcGrade(71);
     assert("7".equals(mark)): "71 is equal to 7";

     mark = MiscUtils.calcGrade(81);
     assert("8".equals(mark)): "81 is equal to 8";

     mark = MiscUtils.calcGrade(91);
     assert("9".equals(mark)): "91 is equal to 9";

     mark = MiscUtils.calcGrade(-23);
     assert("".equals(mark)): "Empty String ";
    }

    public static void testroomArea()
    {
     int calcArea;
     calcArea = MiscUtils.roomArea(2,3);
     assert 0 == calcArea: "length is less than width";

     calcArea = MiscUtils.roomArea(5,15);
     assert 75 == calcArea: "Calculated Room Area";

     calcArea = MiscUtils.roomArea(30, 5);
     assert 0 == calcArea: "length is greather than 3 times the width";

     calcArea = MiscUtils.roomArea(-40, -1);
     assert 0 == calcArea: "Length is greater than width";

     calcArea = MiscUtils.roomArea(-4, -12);
     assert 0 == calcArea: "length is negative";

     calcArea = MiscUtils.roomArea(-3, -20);
     assert 0 == calcArea: "length is less than 3 times width";
    }
}

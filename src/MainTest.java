import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest extends CoreTestCase
{
    @Before
    public void textStartTest()
    {
        System.out.println("Start test");
    }
    @After
    public void textStopTest()
    {
        System.out.println("Stop test");
    }
    @Test
    public void myFirstTest()
    {
    System.out.println("First test");
    }
    @Test
    public void mySecondTest()
    {
        System.out.println("Second test");
    }
}






//    @Test
//    public void myFirstTest() {
//        int expected = 25;
//        int actual = 5 * 5;
//
//        Assert.assertTrue("5 * 5 != 25",actual == expected);
//    }
//}



//{
//    public void typeStartMessage()
//    {
//        super.typeStartMessage();
//        System.out.println("Current class is MainTest");
//    }
//    @Test
//    public void myFirstTest(){
//        this.typeStartMessage();
//    }
//    @Test
//    public void mySecondTest(){
//        this.typeStartMessage();
//    }
//}


//public class MainTest extends CoreTestCase{
//    MathHelper Math = new MathHelper();
//
//    @Test
//    public void myFirstTest() {
//        int result = Math.calc(131332, 12, '*');
//        System.out.println(result);
//    }
//}
//
//public class MainTest extends CoreTestCase {
//    @Test
//    public void myFirstTest() {
//        System.out.println("First test : Before changing static_int: " + MathHelper.static_int);
//        MathHelper.static_int = 8;
//        MathHelper mathObject = new MathHelper();
//        System.out.println("First test : Before changing static_int: " + mathObject.simple_int);
//        mathObject.simple_int = 8;
//    }
//    @Test
//    public void mySecondTest() {
//        System.out.println("Second test : Before changing static_int: " + MathHelper.static_int);
//        MathHelper.static_int = 8;
//        MathHelper mathObject = new MathHelper();
//        System.out.println("Second test : Before changing static_int: " + mathObject.simple_int);
//        mathObject.simple_int = 8;
//    }
//}

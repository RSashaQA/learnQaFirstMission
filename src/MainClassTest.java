import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber() {
        Assert.assertTrue("Attention! " + getLocalNumber + " not equal to 14", getLocalNumber == 14);
    }

    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("Attention! " + getClassNumber() + " not more than 45", getClassNumber() > 45);
    }

    @Test
    public void testGetClassString() {
        Assert.assertTrue("Attention! " + getClassString() + " not contains 'hello' or 'Hello'", getClassString().contains("hello") || getClassString().contains("Hello"));
    }
}
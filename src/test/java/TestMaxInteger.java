import org.junit.Assert;
import org.junit.Test;

public class TestMaxInteger {
    MaxInteger maxIntegerObj = new MaxInteger();

    // Test Case 1.1
    @Test
    public void checkMaxValueAt_First_Position(){
        int maxIntegerResult = maxIntegerObj.checkMaxInteger(15,12,10);
        Assert.assertSame(maxIntegerObj.firstValue, maxIntegerResult);

    }

    // Test Case 1.2
    @Test
    public void checkMaxValueAt_Second_Position(){
        int maxIntegerResult = maxIntegerObj.checkMaxInteger(15,20,10);
        Assert.assertSame(maxIntegerObj.secondValue, maxIntegerResult);
    }

    // Test Case 1.3
    @Test
    public void checkMaxValueAt_Third_Position(){
        int maxIntegerResult = maxIntegerObj.checkMaxInteger(15,20,50);
        Assert.assertSame(maxIntegerObj.thirdValue, maxIntegerResult);
    }
}

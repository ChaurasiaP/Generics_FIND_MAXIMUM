import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestMaxDouble {
    MaxDouble call = new MaxDouble();

    @Test
    public void checkMaxDoubleAt_First_Position(){
        double result = call.checkMaxDouble(8.25, 6.48, 7.54);
        Assertions.assertEquals(8.25,result);
    }

    @Test
    public void checkMaxDoubleAt_Second_Position(){
        double result = call.checkMaxDouble(8.25, 9.48, 7.54);
        Assertions.assertEquals(9.48,result);
    }

    @Test
    public void checkMaxDoubleAt_Third_Position(){
        double result = call.checkMaxDouble(8.25, 6.48, 12.54);
        Assertions.assertEquals(12.54,result);
    }
}

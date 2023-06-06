import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestMaxFloat {
    MaxFloat call = new MaxFloat();

    @Test
    public void checkMaxFloatAt_First_Position(){
        float result = call.checkMaxFloat(8.25f, 6.48f, 7.54f);
        Assertions.assertEquals(8.25f,result);
    }

    @Test
    public void checkMaxFloatAt_Second_Position(){
        float result = call.checkMaxFloat(8.25f, 9.48f, 7.54f);
        Assertions.assertEquals(9.48f,result);
    }

    @Test
    public void checkMaxFloatAt_Third_Position(){
        Float result = call.checkMaxFloat(8.25F, 6.48F, 12.54F);
        Assertions.assertEquals(12.54f,result);
    }
}

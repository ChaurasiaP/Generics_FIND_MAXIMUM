import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestMaxString {
    MaxString call = new MaxString();

    @Test
    public void checkMaxStringAt_First_Position(){
        String result = call.checkMaxString("Peach", "Banana", "Apple");
        Assertions.assertEquals("Peach",result);
    }

    @Test
    public void checkMaxStringAt_Second_Position(){
        String result = call.checkMaxString("Ajay", "Pranshu", "Mohit");
        Assertions.assertEquals("Peach",result);
    }

    @Test
    public void checkMaxStringAt_Third_Position(){
        String result = call.checkMaxString("Niall", "Louis", "Zayn");
        Assertions.assertEquals("Peach",result);
    }
}

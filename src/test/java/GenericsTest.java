import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class GenericsTest <T extends Comparable> {

    GenericsMaximum<T> call = new GenericsMaximum<>();

    // GENERICS TEST METHOD FOR INTEGER
    @Test
    public void MAXIMUM_IntegerAt_FIRST_POSITION_TEST(){
        Assertions.assertSame(20,call.CheckMaxValues(20,12,10));
    }
    @Test
    public void MAXIMUM_IntegerAt_SECOND_POSITION_TEST(){
        Assertions.assertSame(22,call.CheckMaxValues(10,22,12));
    }
    @Test
    public void MAXIMUM_IntegerAt_THIRD_POSITION_TEST(){
        Assertions.assertSame(32,call.CheckMaxValues(10,12,32));
    }


    // GENERICS TEST METHOD FOR FLOAT
    @Test
    public void MAXIMUM_FloatAt_FIRST_MAXIMUM(){
        Assertions.assertEquals(8.54f, call.CheckMaxValues(8.54f,7.89f,8.0f));
    }
    @Test
    public void MAXIMUM_FloatAt_SECOND_MAXIMUM(){
        Assertions.assertEquals(12.54f, call.CheckMaxValues(8.54f,12.54f,8.0f));
    }
    @Test
    public void MAXIMUM_FloatAt_THIRD_MAXIMUM(){
        Assertions.assertEquals(15.6f, call.CheckMaxValues(8.54f,7.89f,15.6f));
    }


    // GENERICS TEST METHOD FOR STRING
    @Test
    public  void MAXIMUM_StringAt_FIRST_POSITION_TEST(){
        Assertions.assertSame("Hello",call.CheckMaxValues("Hello", "Bye", "Aye"));
    }
    @Test
    public  void MAXIMUM_StringAt_SECOND_POSITION_TEST(){
        Assertions.assertSame("Sayonara",call.CheckMaxValues("Hello", "Sayonara", "Joy"));
    }
    @Test
    public  void MAXIMUM_StringAt_THIRD_POSITION_TEST(){
        Assertions.assertSame("Zoo",call.CheckMaxValues("Twilight", "Thinker", "Zoo"));
    }
}

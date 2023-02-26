import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeetSizeEuropeCOnverterTest {

    @Test
    void should_throw_exception_numberOfFeetZero() {
        //given
        FeetSizeEuropeCOnverter cOnverter = new FeetSizeEuropeCOnverter();
        int numberProvided;

        //when


        //then
        Assertions.assertThrows(IllegalArgumentException.class,()->cOnverter.feetSizeConverter(0));

    }

    @Test
    void should_return_matchNumberOfFeet() {
        //given
        FeetSizeEuropeCOnverter cOnverter = new FeetSizeEuropeCOnverter();
        int numberProvided= 9;

        //when
        cOnverter.feetSizeConverter(numberProvided);


        //then
        Assertions.assertEquals(FeetSizeEurope.FEET_SIZE_EUROPE42.getValue(),9);


    }


}
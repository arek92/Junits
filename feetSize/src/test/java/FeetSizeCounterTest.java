import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentAccessException;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FeetSizeCounterTest {



    @Test
    void should_return_sizeOfFeet_basedOnfeetLengtNumber() {
        //given
        FeetSizeCounter counter = new FeetSizeCounter();
        int feetLenght = 26;

        //then
         counter.countFeetSize(feetLenght);

        //when
        Assertions.assertEquals(FeetSize.FEET_SIZE42.getFeetsSizesValue(),26);
    }

    @Test
    void should_throw_IllegalArgumentExceptionWhen0asArgument() {
        //given
        FeetSizeCounter counter = new FeetSizeCounter();
        int feetLenght = 0;

        //then
      //  counter.countFeetSize(feetLenght);

        //when
        Assertions.assertThrows(IllegalArgumentException.class,()-> counter.countFeetSize(feetLenght));
    }





}
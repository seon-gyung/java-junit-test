import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SachicTest {

    Sachic sachic = new Sachic();

    @Test
    public void add_test(){
        // given
        int x = 1;
        int y = 1;

        // when
        int addResult = sachic.add(x, y);

        // then
        assertEquals(addResult, x+y);
    }

    @Test
    public void sub_test(){
        // given
        int x = 1;
        int y = 1;

        // when
        int subResult = sachic.sub(x, y);

        // then
        assertEquals(subResult, x-y);
    }

    @Test
    public void mul_test(){
        // given
        int x = 2;
        int y = 2;

        // when
        int mulResult = sachic.mul(x, y);

        // then
        assertEquals(mulResult, x*y);
    }

    @Test
    public void div_test(){
        // given
        int x = 6;
        int y = 2;

        // when
        int divlResult = sachic.div(x, y);

        // then
        assertEquals(divlResult, x/y);
    }
    
}

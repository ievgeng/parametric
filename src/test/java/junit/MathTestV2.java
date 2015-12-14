package junit;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

/**
 * Created by ievgeng on 12/14/2015
 */
@RunWith(Theories.class)
public class MathTestV2 {

    @DataPoints
    public static Object[][] data(){
        Object[][] a = {{1,2,3}, {3,5,8},{6,7,13}};
        return a;
    }

    @DataPoint
    public static int slog1;
    public static int slog2;
    public static int sum;

    public MathTestV2(int slog1, int slog2, int sum){
        this.slog1 = slog1;
        this.slog2 = slog2;
        this.sum = sum;
    }

    @Theory
    public void plusTest(){
        assertEquals(sum, Math2.plus(slog1,slog2));
    }
}

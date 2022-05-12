import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class CheckHighestLowestTest {
    
    CheckHighestLowest checkHighestLowest = new CheckHighestLowest();

    @Test
    public void getHighestLowestTest_EmptyInput(){
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = checkHighestLowest.getHighestLowest("");
        assertEquals(expected, actual);
    }
    @Test
    public void getHighestLowestTest_NullInput(){
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = checkHighestLowest.getHighestLowest(null);
        assertEquals(expected, actual);
    }
    @Test
    public void getHighestLowest_ShouldReturnTheListOfHighestAndLowest()
    {
        List<Integer> expected = new ArrayList<Integer>(){{add(123);add(2);}};
        List<Integer> actual = checkHighestLowest.getHighestLowest("23 3 32 67 123 2 ");
        assertEquals(expected, actual);

    }



}

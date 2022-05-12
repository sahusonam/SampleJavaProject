import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class NthOddElementTest {
    NthOddElement nthOddElement = new NthOddElement();
    @Test
    public void NthOddElementTest_null()
    {
        Integer expected = -1;
        Integer actual = nthOddElement.getNthOddInteger(0, null);
        assertEquals(expected, actual);
    }
    @Test
    public void NthOddElementTest_returnTheResult()
    {
        Integer expected = 27;
        List<Integer> listNumber = new ArrayList<Integer>(){{add(23); add(24);add(26);add(27);add(28);}};
        System.out.println(listNumber.size());
        Integer actual = nthOddElement.getNthOddInteger(1, listNumber);
        assertEquals(expected, actual);
    }
    
}

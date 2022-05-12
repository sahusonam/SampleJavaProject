import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ConvertToUpperCaseTest {

    ConvertToUpperCase convertToUpperCase = new ConvertToUpperCase();
    @Test
    public void convertToUpperCaseTest_NullCheck(){

        List<String> expected = new ArrayList<>();
        //List<String> input = new ArrayList<String>(){{add("sonam"); add("daughter"); }};
        List<String> actual = convertToUpperCase.getUpperCaseStrings(null);
        assertEquals(expected, actual);
    }

    @Test
    public void convertToUpperCaseTest_returnTheListOfUpperCaseString(){
        List<String> expected = new ArrayList<>(){{add("SONAM"); add("DAUGHTER"); }};
        List<String> input = new ArrayList<String>(){{add("sonam"); add("daughter"); }};
        List<String> actual = convertToUpperCase.getUpperCaseStrings(input);
        assertEquals(expected, actual);
    }
    
}

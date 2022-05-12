
import static org.junit.Assert.*;

import org.junit.Test;

public class CheckVowelsTest{
    
    
    @Test
    public void testCheckVowelExists(){
        CheckVowels checkVowels = new CheckVowels();
        var actual = checkVowels.CheckVowelsExists("");
        assertEquals(actual,false);
    }  
    @Test
    public void testCheckVowelExistsShouldReturn(){
        CheckVowels checkVowels = new CheckVowels();
        var actual = checkVowels.CheckVowelsExists("Sonam");
        assertEquals(actual,true);
    }
    @Test
    public void testCheckVowelExistsShouldReturnTrueIFCapitalLetters(){
        CheckVowels checkVowels = new CheckVowels();
        var actual = checkVowels.CheckVowelsExists("SONAM");
        assertEquals(actual,true);
    }
}

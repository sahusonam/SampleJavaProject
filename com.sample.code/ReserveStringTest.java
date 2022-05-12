import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReserveStringTest {
    ReverseString reverseString = new ReverseString();
    @Test
    public void ReverseStringTest_empty()
    {
        String actual  = reverseString.getReverseString("");
        assertEquals("",actual);

    }
    @Test
    public void ReverseStringTest_NullInput()
    {
        String actual  = reverseString.getReverseString(null);
        assertEquals("",actual);

    }
    @Test
    public void ReverseStringTest_ShouldReturnReverseString()
    {
        String actual  = reverseString.getReverseString("yes");
        assertEquals("sey",actual);

    }
    @Test
    public void ReverseStringTest_ShouldReturnReverseStringForJavaInterview()
    {
        String actual  = reverseString.getReverseString("Java Interview");
        assertEquals("weivretnI avaJ",actual);

    }
}

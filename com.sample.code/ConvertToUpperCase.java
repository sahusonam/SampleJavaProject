import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCase {
    
    public List<String> getUpperCaseStrings(List<String> input)
    {
        List<String> result = new ArrayList<>();
        if(input != null)
        {
            result = input.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
        }
        return result;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CheckHighestLowest {
    public List<Integer> getHighestLowest(String input){
        List<Integer> result = new ArrayList<>();
        if(input != null && input != "")
        {
            List<Integer> numbersList = Arrays.asList(input.split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
            Collections.sort(numbersList);

            result.add(numbersList.get(numbersList.size() - 1));
            result.add(numbersList.get(0));
        }   
        return result;
    }
}

import java.util.List;
import java.util.stream.Collectors;

public class NthOddElement {
    public Integer getNthOddInteger(Integer n,List<Integer> list)
    {
        if(list == null || n > list.size())
            return -1;

        List<Integer> oddNumbersList = list.stream().filter(element -> (element%2 != 0)).collect(Collectors.toList());

        if(oddNumbersList.size() <= n){
            return -1;
        }

        return oddNumbersList.get(n);
    }
    
}

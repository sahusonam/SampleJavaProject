public class ReverseString {
    public String getReverseString(String input)
    {
        String reverseString = "";
        if(input!=null)
        {
            for(int i=input.length() -1;i>=0;i--)
            {
                reverseString += input.charAt(i);
            }
        }
        return reverseString;
    }
}

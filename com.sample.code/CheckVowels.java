
public class CheckVowels {

    public boolean CheckVowelsExists(String str)
    {
        boolean vowelsExists = false;
        if(str != null && str != "")
        {
            for(int i = 0;i<=str.length();i++)
            {
                if(isVowel(str.toLowerCase().charAt(i)))
                {
                    vowelsExists = true;
                    break;
                }
            }
        }        
        return vowelsExists;
    }

    private boolean isVowel(char c)
    {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        {
            return true;
        }
        return false;
        
    }



    
}

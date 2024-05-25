package proc;

import java.util.regex.*;

public class RegularExpressions {
    // Main Function
    public static void main(String[] args)
    {
        // Check if all elements are numbers
        System.out.println(Pattern.matches("\\d+", "1234"));
 
        // Check if all elements are non-numbers
        System.out.println(Pattern.matches("\\D+", "1234"));
 
        // Check if all the elements are non-numbers
        System.out.println(Pattern.matches("\\D+", "Gfg"));
 
        // Check if all the elements are non-spaces
        System.out.println(Pattern.matches("\\S+", "gfg"));
        
        String stringParam = "StephCurry30GSW";
        if (null != stringParam && stringParam.matches("[A-Za-z]+\\d{2}[A-Z]{3}$")) {
        	System.out.println("PATTERN MATCHES");
        } else {
        	System.out.println("PATTERN NOT MATCHES");
        }
    }
}
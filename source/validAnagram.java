package source;
//https://leetcode.com/problems/valid-anagram/

import java.util.HashSet;

public class validAnagram {
    public static void main(String[] args) 
    {
        String s = "rat";
        String t = "car";
        System.out.println(s.charAt(0) );
        System.out.println(isAnagram(s,t));  
    }

    public static boolean isAnagram(String s, String t) 
    {
        HashSet<String> mySet1 = new HashSet<>();

        mySet1.add(s);
        mySet1.add(t);

        // System.out.println(mySet1.contains(s));
        // System.out.println(mySet1.contains(t));

        if(mySet1.contains(s) && mySet1.contains(t)){
            return true;
        }

        return false;
        
    }
    
}

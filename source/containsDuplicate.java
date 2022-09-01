package source;

import java.util.HashSet;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] nums = {4,3,1,2};

        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        
        // to store each number in array
        HashSet<Integer> hset = new HashSet<>();

        for (int i = 0; i < nums.length; i++) 
        { 
            if(hset.contains(nums[i])){
                return true;
            }
            else{
                hset.add(nums[i]);
            }
            
        }
        return false; 
        
    }
    
}

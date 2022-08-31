package source;


public class linearSearch {
    public static void main(String[] args) 
    {
        int[] nums = {1,5,3,-10,6,46,7,8,9};
        int target = -10;
        int ans = lsearch(nums, target);
        System.out.println("Target number is " + ans);

        
    }

    static int lsearch(int[] arrs, int tgr)
    {
        if (arrs.length == 0) 
        {
            return -1;
        }

        for (int index = 0; index < arrs.length; index++) {
            int element = arrs[index];

            if(element == tgr)
            {
                return tgr;
            }
            
        }
        return -1;


    }



    
}

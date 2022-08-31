package source;

public class function {
    public static void main(String[] args) 
    {
        int[] arr = {18,12,9,14,77,50};
        int target = 7;

        int ans = linearSearch(arr, target); //The entire function will return 4 so need to store that in integer
        System.out.println("My taget elementis " +  ans);
        
        
        
        
    }

    static int linearSearch(int[] array, int target)
    {
        for (int i = 0; i < array.length; i++) {
            
            if(array[i] == target)
            {
                 return array[i];
            }
            
        }

        return Integer.MAX_VALUE;

    }

    
    
}

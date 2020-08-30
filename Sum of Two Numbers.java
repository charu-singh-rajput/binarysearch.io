import java.util.*;
class Solution {
    public boolean solve(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        
        for(int i:nums)
        {
            int difference=k-i;
            if(m.containsKey(difference))
            {
                return true;
            }
            m.put(i,i);    
        }
            
        return false;
    }
}


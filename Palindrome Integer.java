import java.util.*;


class Solution {
    public boolean solve(int num) {
       int reverse=0,copy=num;
       
    while(num>0)
    {
       int mod=num%10;
       reverse=reverse*10+mod;
       num/=10; 
    }
    if(reverse==copy)
        return true;
    else
        return false;
       
    }
}

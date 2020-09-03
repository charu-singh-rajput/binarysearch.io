import java.util.*;


class Solution {
    public int solve(String text, String word0, String word1) {
       int first=-1,second=-1,min=Integer.MAX_VALUE;
       String[] texts=text.split(" ");
       
       for(int i=0;i<texts.length;i++)
       {
           if(texts[i].equals(word0))
               first=i;
            if(texts[i].equals(word1))
                second=i;
            if(first!=-1 && second!=-1)
            {
               int difference=(int)Math.abs(first-second)-1;
                min=Math.min(min,difference);
            }
       }
       if(first==-1 || second==-1)
       {
          return -1; 
       }
       return min;
    }
}


/*Given the strings text, word0, and word1, return the smallest distance between any two occurrences of word0 and word1 in text, measured in number of words. If either word0 or word1 doesn't appear in text, return -1.

Constraints

word0 and word1 are different.
n ≤ 200,000 where n is the length of text.
Example 1
Input

text = "dog cat hello cat dog dog hello cat world"
word0 = "hello"
word1 = "world"
Output

1
*/
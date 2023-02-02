output status:
Correct Answer
Test Cases
11/11

import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findMinimumCost(String str) {
		// Write your code here
    if(str.length()%2==1)return -1;
    
    Stack<Character> st =new Stack<>();
    for(char ch:str.toCharArray()){
      if(ch=='{')st.push(ch);

      else{
        if(!st.isEmpty() && st.peek()=='{')st.pop();
        else st.push(ch);
      }
    }
    int a=0;
    int b=0;
    while(!st.isEmpty()){
      char ch=st.pop();
      if(ch=='{')a++;
      else b++;
    }

    return ((a+1)/2)+((b+1)/2);

    }
}

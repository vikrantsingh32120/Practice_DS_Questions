output status:
Correct Answer
Test Cases
11/11

import java.util.*;
import java.io.*;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // Write your code here.
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int[] ans=new int[n];
        
        for(int i=n-1;i>=0;i--){
            int curr=arr.get(i);
            while(st.peek()>=curr)st.pop();
            ans[i]=st.peek();
            st.push(curr);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i:ans)res.add(i);
        return res;
    }
}

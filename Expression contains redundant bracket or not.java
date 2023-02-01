output status:
Problem Solved Successfully
Test Cases Passed: 
1020 /1020
Total Points Scored: 
4 /4
Your Total Score: 
410
Total Time Taken: 
0.16
Your Accuracy: 
50%
Attempts No.: 
2

class Solution {
    public static int checkRedundancy(String s) {
        // code here
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                st.push(ch);
            }else{
                if(ch==')'){
                    boolean isRedundent=true;
                    while(st.peek()!='('){
                        char top=st.peek();
                        if(top=='+' || top=='-' || top=='*' || top=='/'){
                            isRedundent=false;
                        }
                        
                        st.pop();
                    }
                    if(isRedundent)return 1;
                    st.pop();
                    }
            }
        }
       
        return 0;
    }
}

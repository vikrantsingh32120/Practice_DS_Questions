Output status:
Output Window
Problem Solved Successfully
Test Cases Passed: 
100010 /100010
Total Points Scored: 
4 /4
Your Total Score: 
404
Total Time Taken: 
1.27
Your Accuracy: 
100%
Attempts No.: 
1

class Solution
{ 
    static void insertAtBottom(Stack<Integer> st, int x){
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        
        int num=st.pop();
        insertAtBottom(st,x);
        st.push(num);
    }
    
    static void reverse(Stack<Integer> st)
    {
        // add your code here
        // base case
        if(st.isEmpty())return;
        
        
        int num=st.pop();
        reverse(st);
        insertAtBottom(st,num);
    }
}

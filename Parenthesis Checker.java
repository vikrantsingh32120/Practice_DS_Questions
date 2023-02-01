Output:
Problem Solved Successfully
You get marks only for the first correct submission if you solve the problem without viewing the full solution.
Test Cases Passed: 
257 /257
Your Total Score: 
400
Total Time Taken: 
0.38
Correct Submission Count: 
5
Attempts No.: 
15


class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st=new Stack<Character>();
        
        for(char ch:x.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{')st.push(ch);
            else{
                if(!st.isEmpty()){
                    char top=st.peek();
                    if(top=='[' && ch==']' || top=='(' && ch==')' || top=='{' && ch=='}')st.pop();
                    else return false;
                }
                else return false;
            }
        }
        
        if(st.isEmpty())return true;
        else return false;
    }
}

output Status:
Problem Solved Successfully
You get marks only for the first correct submission if you solve the problem without viewing the full solution.
Test Cases Passed: 
100 /100
Your Total Score: 
406
Total Time Taken: 
0.51
Correct Submission Count: 
2
Attempts No.: 
2

class GfG{
    
    public void insertInSortedOrder(Stack<Integer> st,int x){
        if(st.isEmpty() || st.peek()<x){
            st.push(x);
            return;
        }
        int num=st.pop();
        insertInSortedOrder(st,x);
        st.push(num);
        
    }
    
    public void solve(Stack<Integer> st){
        if(st.isEmpty())return;
		
		int num=st.pop();
		solve(st);
		insertInSortedOrder(st,num);
    }
    
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		solve(s);
		return s;
	}
}

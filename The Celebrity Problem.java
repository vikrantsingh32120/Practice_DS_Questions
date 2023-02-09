class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	
    	Stack<Integer> st=new Stack<>();
    // 	push all ele in stack 
    	for(int i=0;i<n;i++)st.push(i);
    	
    	while(st.size()!=1){
    	    int a=st.pop();
    	    int b=st.pop();
    	    
    	   // if a knows b
    	    if(M[a][b]==1)st.push(b);
    	    else st.push(a);
    	}
    	
    // 	verify if celebrityOrNot
    // row check
    int candidate=st.peek();
    boolean rowCheck=true;
    // int zeroCount=0;
    for(int i:M[candidate]){
        if(i==1)rowCheck=false;
        // else zeroCount++;
    }
    
    // column count
    // boolean colCheck=false;
    int oneCount=0;
    for(int i=0;i<n;i++){
        if(M[i][candidate]==1)oneCount++;
    }
    
    if(rowCheck && oneCount==n-1)return candidate;
    else return -1;
    }
}

class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
       Deque<Long> q=new ArrayDeque<>();
        long[] ans=new long[N-K+1];
        for(int i=0;i<K-1;i++) {
        	if(A[i]<0)q.add(A[i]);
        }
        for(int i=K-1;i<N;i++) {
        	if(A[i]<0)q.add(A[i]);
        	if(!q.isEmpty()) {
        		ans[i-K+1]=q.peek();
        		if(q.peek()==A[i-K+1])q.poll();
        	}
        	else ans[i-K+1]=0;
        }
        return ans;
    
    
    }
}

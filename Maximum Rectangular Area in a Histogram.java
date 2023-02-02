Output_Status:
Problem Solved Successfully
You get marks only for the first correct submission if you solve the problem without viewing the full solution.
Test Cases Passed: 
58 /58
Your Total Score: 
410
Total Time Taken: 
1.45
Correct Submission Count: 
3
Attempts No.: 
12

class Solution
{
    public static long[] findPreviousSmaller(long[] arr) {
        int n = arr.length;
        long[] res = new long[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            stack.push(i);
        }
        return res;
    }
    
    
    public static long[] findNextSmaller(long[] arr) {
        int n = arr.length;
        long[] res = new long[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = n;
            } else {
                res[i] = stack.peek();
            }
            stack.push(i);
        }
        return res;
    }
    
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        long ps[]=findPreviousSmaller(hist);
        
        long ns[]=findNextSmaller(hist);
        
        long maxArea = 0;
        for (int i = 0; i < n; i++) {
            long width = ns[i] - ps[i] - 1;
            long area = hist[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
        
}

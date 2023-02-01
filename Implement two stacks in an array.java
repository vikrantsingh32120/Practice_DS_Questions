Output Status : 

Problem Solved Successfully
You get marks only for the first correct submission if you solve the problem without viewing the full solution.
Test Cases Passed: 
100 /100
Your Total Score: 
400
Total Time Taken: 
0.45
Correct Submission Count: 
3
Attempts No.: 
3

/* Structure of the class is
class TwoStack
{

	int size;
	int top1,top2;
	int arr[] = new int[100];

	TwoStack()
	{
		size = 100;
		top1 = -1;
		top2 = size;
	}
}*/

class Stacks
{
    //Function to push an integer into the stack1.
    void push1(int x, TwoStack sq)
    {
        if (sq.top1 + 1 >= sq.top2) {
            // System.out.println("Stack Overflow");
            return;
        } else {
            sq.top1++;
            sq.arr[sq.top1] = x;
        }
    }

    //Function to push an integer into the stack2.
    void push2(int x, TwoStack sq)
    {
        if (sq.top2 - 1 <= sq.top1) {
            // System.out.println("Stack Overflow");
            return;
        } else {
            sq.top2--;
            sq.arr[sq.top2] = x;
        }
    }

    //Function to remove an element from top of the stack1.
    int pop1(TwoStack sq)
    {
        if (sq.top1 < 0) {
            // System.out.println("Stack Underflow");
            return -1;
        } else {
            int x = sq.arr[sq.top1];
            sq.top1--;
            return x;
        }
    }

    //Function to remove an element from top of the stack2.
    int pop2(TwoStack sq)
    {
        if (sq.top2 >= sq.size) {
            // System.out.println("Stack Underflow");
            return -1;
        } else {
            int x = sq.arr[sq.top2];
            sq.top2++;
            return x;
        }
    }
}

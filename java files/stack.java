abstract class Stack {
	private int stackSize;  // max stack size
	private int top;	    // current top of stack
	private int values[]; // item array

	public Stack(int size){
        stackSize = size;
        values = new int [stackSize];
        top = -1;
    };			// constructor
	public boolean isEmpty() { return top == -1; }
	public boolean isFull(){ return top == stackSize-1;}
	public int peek(){
        if (isEmpty()){
            System.out.println("Error: the stack has no  data ");
            return -1;}
            else{
                return values[top];
            }
    };
	public void push(int x){
        if(isFull())
            System.out.println("Error: the stack is full");
        else
            values[++top] = x;
    };
	public int pop(){
        if (isEmpty()){
            System.out.println("Error: the stack has no  data ");
            return -1;
        }
        else{
            return values[top--];
        }
    };
	public void popAll(){
        values = new int[stackSize];
        top = -1;
    };


    public static void main(String[] args) {
        MyMainClass1 s = new MyMainClass1(5);
        s.push(5);
        s.push(6);
        s.push(-3);
        s.push(-8);
        System.out.println("Top " + s.peek());
        s.pop();
        System.out.println("Top" +s.peek());

        while(!s.isEmpty()){
            System.out.println("Next top:" );
        }

      }
}


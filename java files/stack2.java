class stack3 extends Stack{

  public stack3(int size) {
    super(size);
    //TODO Auto-generated constructor stub
  }}


public class stack2 {
      public static void main(String[] args) {
        stack3 s = new stack3(5);
        s.push(5);
        s.push(6);
        s.push(-3);
        s.push(-8);
        System.out.println("Top " + s.peek());
        s.pop();
        System.out.println("Top" +s.peek());

        while(!s.isEmpty()){
            System.out.println("Next top:" + s.pop());
        }

      }
}
public class InnerClass{
    int x = 10;
    class InnerInner{
        int y = 12;
    }

}
class MainClass{
    public static void main(String[] args) {
        InnerClass myInner = new InnerClass();
        InnerClass.InnerInner myInnerInner = myInner.new InnerInner();
        System.out.println(myInner.x + myInnerInner.y);
    }
}
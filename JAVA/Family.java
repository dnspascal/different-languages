public class Family {
    public static void main(String[] args) {
        Parents myParent = new Parents();
        Children myChildren = new Children();
        Relative myRelative = new Relative();
        myParent.tag();
        myParent.names();
        myChildren.names();
        myRelative.names();
    }
}
abstract class Person{
    public abstract void names();
    public void tag(){
        System.out.println("Member of this family are");
    }
}
class Parents extends Person{
    public void names(){
        System.out.println("Parents are Pascal Mgaya and Dalia Mgaya");
    }
}
class Children extends Person{
    public void names(){
        System.out.println("children are\nAdela\nHans\nDenis\nProsper\nJaneth\nDavis");
    }
}
class Relative extends Person{
    public void names(){
        System.out.println("\n\nall friends");
    }
}

import java.util.ArrayList;

public class InsertItem {

  public static void insertItem(int itemToBeAdded) {
    ArrayList<Integer> a = new ArrayList<Integer>();

    a.add(0,1);
    a.add(1,25);
    a.add(2,67);
    a.add(3,11);
    a.add(4,23);
    a.add(2,itemToBeAdded);

    System.out.println(a);
  }

  public static void main(String[] args) {

    insertItem(107);
  }
}

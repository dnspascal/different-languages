import java.util.ArrayList;
import java.util.List;

public class Delete {

  public static void deleteItem() {
    List<String> fruits = new ArrayList<String>();
    fruits.add("Apple");
    fruits.add("peach");
    fruits.add("Orange");
    fruits.add("peas");
    fruits.add("watermelon");
    System.out.println("The array before the removal \n\n " + fruits);

    fruits.remove(2);
    System.out.println("\n\n After the removal  \n\n " + fruits);
  }

  public static void main(String[] args) {
    deleteItem();
  }
}

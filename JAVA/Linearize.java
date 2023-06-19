import java.util.*;

public class Linearize {

  public static void linearize(int[][] a) {
    ArrayList<Integer> b = new ArrayList<Integer>();
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        // if (b.contains(a[i][j])) {
        //   continue;
       // } else {
          b.add(a[i][j]);
       // }
      }
    }
    System.out.println(b);
  }

  public static void main(String[] args) {
    int[][] c = { { 1, 2 }, { 2, 4 }, { 5, 8 } };
    linearize(c);
  }
}

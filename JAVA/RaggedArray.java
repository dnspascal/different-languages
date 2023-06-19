public class RaggedArray {

  public static void isRagged(int[][] array) {
    boolean isRaggedValue = false;
    if (array != null) {
      int lastLength = 0;
      for (int i = 0; i < array.length; i++) {
        if (lastLength == 0) {
          lastLength = array[i].length;
        } else if (lastLength == array[i].length) {
          continue;
        } else {
          isRaggedValue = true;
          break;
        }
      }
    }
    if (isRaggedValue) {
      System.out.println("The array is ragged");
    } else {
      System.out.println("The array is not ragged");
    }
  }

  public static void main(String[] args) {
    int[][] matrix = {
      { 1, 2, 3, 4, 5 },
      { 1, 2, 3, 4, 5 },
      { 1, 2, 3, 4, 5 },
    };

    isRagged(matrix);
  }
}

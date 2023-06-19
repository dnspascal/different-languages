public class EqualArray {
    public static void equals(int [][] a,int [][] b){
      boolean isEqual = false;
      if(a.length==b.length){
          for(int i=0;i<a.length;i++){
              for(int j=0; j<a[i].length;j++)
              if(a[i] == b[i]){
                  continue;
              }else {
                  break;
              }

          }
          isEqual = true;
      }
      System.out.println(isEqual);
    }

    public static void main(String[] args) {
        int [][] c = {{1,2,3},{4,5,6}};
        int [][] d = {{1,2,3},{4,5,6}};
        equals(c, d);
    }
    
}
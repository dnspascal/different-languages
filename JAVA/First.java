public class First{
  private String name;

  public String getName(){
     return name;
 }
  public void setName(String newName){
     this.name = newName;
 }
}

class Lauryn{
    public static void main(String[] args) {
        First obj = new First();
        obj.setName("denis");
        System.out.println(obj.getName());
    }
}
public class Hello{
    int x;
    String icar;

    public Hello(int r, String car) {

        x = r;
        icar = car;
    }

     public static void main(String[] args) {
        Hello myObj = new Hello(1969, "Mustang");
         System.out.println(myObj.icar +" "+ myObj.x);
    }

}
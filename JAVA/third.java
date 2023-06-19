

public class third {
    protected String brand = "ford";
    public void honk(){
        System.out.println("Tout, tout");
    }
}
class Cars extends third{
    final private String modelName = "mustang";

    public static void main(String[] args) {
        Cars myCar = new Cars();
        myCar.honk();
        System.out.println(myCar.brand + " " +myCar.modelName);
    }
}

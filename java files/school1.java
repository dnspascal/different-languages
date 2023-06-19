import java.util.Scanner;
class school1{

    public static int maximum(int a, int b, int c){
            if((a>b) &&(a>c))
            return a;
            else if((b>c)&&(b>a))
            return b;
            else if((c>a)&&(c>b))
            return c;

            return 1;
        }
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("enter no");
                int a = input.nextInt();
                int b = input.nextInt();
                int c = input.nextInt();


                System.out.println( maximum(a,b ,c ));
            }
    }



      
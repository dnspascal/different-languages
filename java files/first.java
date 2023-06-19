import java.util.Scanner;

public class cars{
public static void main(String[] args){
int[] myCars = new int[5];
Scanner myElements = new Scanner(System.in);
for(int i=0; i<myCars.length; i++){
myElements.nextLine();
System.out.println(myCars[i]);
}
}
}
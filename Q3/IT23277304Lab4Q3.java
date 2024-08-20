import java.util.Scanner;
public class IT23277304Lab4Q3{
public static void main(String [] args){
Scanner h=new Scanner(System.in);
System.out.println("enter a number");
int num=h.nextInt();
String result = (num > 0) ? "The number is Positive" 
                        : (num < 0) ? "The number is Negative" 
                        : "The number is Zero";
System.out.println(result);







}
}
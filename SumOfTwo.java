import java.util.Scanner;
class SumOfTwo{
    public static void main(String[] args){
    Scanner Y = new Scanner(System.in);
    int a,b,c = 0;
    System.out.println("Enter Values:");
    a = Y.nextInt();
    b = Y.nextInt();
    c = a + b;
    System.out.println("Sum Of Two Numbers:"+c);
    }  
}
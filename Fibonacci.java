import java.util.*;
public class Fibonacci{
    public static void fibonacci(int n){
        int a=0;
        int b = 1;
        int next = 0;
     
        for(int i = 1;i<=n ;i++){
            System.out.println(next);
            next = a + b;
            a = b;
            b = next;
            

        
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth term: ");
        int n = sc.nextInt();
        fibonacci(n);
    }
}
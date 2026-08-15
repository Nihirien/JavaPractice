import java.util.*;
public  class GCD{
    public static int gcd(int x, int y){
        int gcd = 1;
        
        for(int i=1;i<x;i++){
            if(x%i==0 && y%i==0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find GCD: ");
        int a = sc.nextInt();
          int b = sc.nextInt();
        int gcd = gcd(a,b);
        System.out.println(gcd);
    }

}
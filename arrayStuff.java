import java.util.*;
public class arrayStuff{
   /*  public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of names: ");
        n=sc.nextInt();
        String[] name = new String[n];
        System.out.println("Enter all the names: ");
        for(int i=0;i<n;i++){
            name[i]= sc.next();
        }
        System.out.println("All the names you listed: ");
        for(int i=0;i<n;i++){
            System.out.print(name[i] + ", ");
        }



    }*/
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of elements: ");
        n=sc.nextInt();
        int[] list = new int[n];
        System.out.println("Enter all the elements: ");
        for(int i=0;i<n;i++){
            list[i]= sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(list[i]>list[i+1]){
                System.out.println("Not in ascending order");
                return;
            }
           
                
        }
        System.out.println(" in ascending order");

   }

}
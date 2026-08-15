import java.util.*;
public class Strings{
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number of strings yiu wanna enter: ");
        // int n = sc.nextInt();
        // sc.nextLine();
        // String[] name = new String[n];
        //    System.out.println("Enter strings: ");
        // for(int i=0;i<n;i++){
        //        name[i]= sc.nextLine();
        // }
        // int totalLength=0;
        // for(int i =0;i<n;i++){
        //     totalLength = totalLength + name[i].length();
            
        // }
        // System.out.println(totalLength);
   
    //    Scanner sc = new Scanner (System.in);
    //  String str = sc.next();
    //  String result = "";


    //  for(int i=0; i<str.length(); i++) {
    //    if(str.charAt(i) == 'e') {
    //      result += 'i';
    //    } else {
    //      result += str.charAt(i);
    //    }
    //  }


    //  System.out.println(result);\

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your email: ");
    String email = sc.next();
    int n = 0;
    for(int i=0;i<email.length();i++){
        if(email.charAt(i) == '@'){
            n = i;
        }
    }
    System.out.println(email.substring(0,n));


    }
}
import java.util.*;

// Renamed class to avoid shadowing java.lang.StringBuilder
public class Stringbuilder { 
    public static void main(String args[]) {
               //REVERSE A STRING
        // StringBuilder str = new StringBuilder("Hello World");

        // // Loop only until the halfway mark
        // for (int i = 0; i < str.length() / 2; i++) {
        //     int front = i;
        //     int back = str.length() - 1 - i;

        //     // Fixed variable name (str) and method casing (charAt)
        //     char frontChar = str.charAt(front);
        //     char backChar = str.charAt(back);

        //     str.setCharAt(front, backChar);
        //     str.setCharAt(back, frontChar);
        // }

        // System.out.println(str); // Output: dlroW olleH
              //CUMULATIVE LENGTH OF MANY STRINGS
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter amount of your strings: ");
    //     int n = sc.nextInt();
    //     sc.nextLine();
    //      StringBuilder[] sb = new StringBuilder[n]; 
    //      int totalLength=0;
    //     System.out.println("Enter all your strings: ");
    //     for(int i=0;i<n;i++){
    //          sb[i] = new StringBuilder(sc.nextLine());
    //          totalLength += sb[i].length();
    //     }
      
    // System.out.println(totalLength);
                //REPLACING I WITH E IN A STRING
    Scanner sc = new Scanner(System.in);
    // System.out.print("Enter a string: ");
    // StringBuilder str = new StringBuilder(sc.nextLine());
    // for(int i=0;i<str.length();i++){
    //     if(str.charAt(i) == 'i'){
    //         str.setCharAt(i,'e');
    //     }
    // }
    // System.out.println(str);
                //USERNAME FROM MAIL ACCOUNT
               System.out.print("Enter your email: ");
StringBuilder str = new StringBuilder(sc.next());

// Finds the index of '@' directly (returns -1 if not found)
int n = str.indexOf("@"); 

if (n != -1) {
    System.out.println("Username: " + str.substring(0, n));
} else {
    System.out.println("Invalid email: '@' not found!");
}
                sc.close();
    }
}
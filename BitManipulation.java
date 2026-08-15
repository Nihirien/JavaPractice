import java.util.*;

class BitManipulation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // GET BIT
        // System.out.print("Enter a number");
        //     int n = sc.nextInt();
        //     System.out.print("Enter position of bit you wanna know: ");
        //     int pos = sc.nextInt();
        //     int bitMask = 1<<pos;
        //     int bit = bitMask & n;
        //     System.out.println(bit);
        //        SET BIT
        //  System.out.print("Enter a number: ");
        //     int n = sc.nextInt();
        //     System.out.print("Enter position of bit you wanna set: ");
        //     int pos = sc.nextInt();
        //     int bitMask = 1<<pos;
        //     int bit = bitMask | n;
        //     System.out.println(bit);
                    // CLEAR BIT
            //         System.out.print("Enter a number: ");
            // int n = sc.nextInt();
            // System.out.print("Enter position of bit you wanna clear: ");
            // int pos = sc.nextInt();
            // int bitMask = 1<<pos;
            // int bit = ~bitMask & n;
            // System.out.println(bit);
                //UPDATE BIT
          System.out.print("Enter a number: ");
            int n = sc.nextInt();
            System.out.print("Enter position of bit you wanna update: ");
            int pos = sc.nextInt();
            System.out.print("Enter choice of bit: ");
            int bitc = sc.nextInt();
            if(bitc == 0){
            int bitMask = 1<<pos;
            int bit = ~bitMask & n;
            System.out.println(bit);
            }
            else {
                 int bitMask = 1<<pos;
            int bit = bitMask | n;
            System.out.println(bit);
            }
        
    }
}
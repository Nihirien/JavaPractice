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
        //   System.out.print("Enter a number: ");
        //     int n = sc.nextInt();
        //     System.out.print("Enter position of bit you wanna update: ");
        //     int pos = sc.nextInt();
        //     System.out.print("Enter choice of bit: ");
        //     int bitc = sc.nextInt();
        //     if(bitc == 0){
        //     int bitMask = 1<<pos;
        //     int bit = ~bitMask & n;
        //     System.out.println(bit);
        //     }
        //     else {
        //          int bitMask = 1<<pos;
        //     int bit = bitMask | n;
        //     System.out.println(bit);
        //     }
                //Power of two or not
//                 System.out.print("Enter a number: ");
// int n = sc.nextInt();

// if (n > 0 && (n & (n - 1)) == 0) {
//     System.out.println("Number is power of 2");
// } else {
//     System.out.println("Number is not power of 2");
// }
        //FLIPPING BIT AT POS N
//     System.out.print("Enter a number: ");
// int n = sc.nextInt();
// System.out.print("Enter position to toggle: ");
// int pos = sc.nextInt();

// int result = n ^ (1 << pos);

// System.out.println("Number after toggling bit at position " + pos + " is: " + result);
            //COUNTING 1s
// System.out.print("Enter a number: ");
// int n = sc.nextInt();
// int count = 0;

// while (n != 0) {
//     if ((n & 1) == 1) {
//         count++;
//     }
//     n = n >> 1;
// }

// System.out.println("Number of 1's: " + count);

            //D TO B AND B TO D 
            public static String decimalToBinary(int n) {
    if (n == 0) return "0";
    StringBuilder binary = new StringBuilder();
    while (n > 0) {
        int bit = n % 2;
        binary.insert(0, bit);  // prepend, since we get bits right-to-left
        n = n / 2;
    }
    return binary.toString();
}

public static int binaryToDecimal(String binary) {
    int decimal = 0;
    for (int i = 0; i < binary.length(); i++) {
        int bit = binary.charAt(i) - '0';  // convert char '0'/'1' to int
        decimal = decimal * 2 + bit;
    }
    return decimal;
}
        
    }
}
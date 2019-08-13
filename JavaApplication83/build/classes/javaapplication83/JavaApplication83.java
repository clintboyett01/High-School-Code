package javaapplication83;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

/**
 * @Henderson Computer Science UIL team
 */
public class JavaApplication83 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("data.txt");
        BigInteger bint;
        int x = 10000;
        bint = fact(BigInteger.valueOf(x));
        String str = bint.toString();
        fw.write(str);
        System.out.println("Output was to long. Go check the file data.txt");
    }
    public static BigInteger fact(BigInteger bint) {
        if (bint.bitLength() < 2) {
            int x = bint.intValue();
            if (x <= 1) {
                return BigInteger.ONE;
            }
        }
        return bint.multiply(fact(bint.subtract(BigInteger.ONE)));
    }

}

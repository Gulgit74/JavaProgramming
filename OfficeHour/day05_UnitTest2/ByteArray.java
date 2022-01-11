package day05_UnitTest2;

import java.util.Arrays;

public class ByteArray {
    public static void main(String[] args) {

        byte [] b = new byte[5];

        for (int j = 0; j < b.length; j++) {
            b[j] = (byte)(b[j]*2);
        }

        System.out.println(b);

    }


}



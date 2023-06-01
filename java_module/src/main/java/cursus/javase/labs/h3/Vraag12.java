package cursus.javase.labs.h3;

import java.sql.SQLOutput;

public class Vraag12 {
    public static void main(String[] args) {
        int i = 3;
        int j = i < 3 ? i++ + ++i : ++i >>> 2; // >>> the shift operator verplaatst de binary representatie naar recht of links
        // in dit geval is de binary 00000100 (4), en dat wordt: 00000001 omdat er staat >>> 2, oftewel 2 plekken naar rechts
        System.out.println(j);
        System.out.println(16 >>> 2); // 00010000 (16) wordt 00000100 (4)
        System.out.println(65 >>> 2); // 01000001 (65) wordt 00010000 (16)
        System.out.println(65 >> 2); // 01000001 (65) wordt 00010000 (16)
        System.out.println(-65 >>> 2); // 01000001 (65) wordt 00010000 (16)
        System.out.println(-65 >> 2); // 01000001 (65) wordt 00010000 (16)
    }
}

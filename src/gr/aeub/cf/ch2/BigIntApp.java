package gr.aeub.cf.ch2;

import java.math.BigInteger;

public class BigIntApp {

    public static void main(String[] args) {
        BigInteger bigNum1 =  new BigInteger("1234567892833737");
        BigInteger bigNum2 = new BigInteger("162626263636363");
        BigInteger result ;

        result = bigNum1.add(bigNum2);

        System.out.printf("%,d", result);
    }
}

import java.util.Scanner;

import java.math.BigInteger;
import java.util.Scanner;

public class SecondMaxBigInt {

    private static final String defaultMismatchValueIdentifier = "-1";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            String[] inputArray = new String[n];
            for (int i = 0; i < n; i++) {
                inputArray[i] = s.next();
            }
            System.out.println("SecondMax :" + findSecondMaximum(inputArray));
        }
    }

    private static BigInteger findSecondMaximum(String[] inputArray) {
        if (inputArray == null || inputArray.length <= 1)
            return new BigInteger(defaultMismatchValueIdentifier);

        BigInteger max = new BigInteger(String.valueOf(Long.MIN_VALUE));
        BigInteger secondMax = max;

        for (int i = 0; i < inputArray.length; i++) {
            BigInteger value = new BigInteger(inputArray[i]);
            int maxResponse = value.compareTo(max);
            int secondMaxResponse = value.compareTo(secondMax);

            if (maxResponse == 1) {
                secondMax = max;
                max = value;
            } else if (secondMaxResponse == 1) {
                secondMax = value;
            }
        }

        int diff = secondMax.compareTo(max);
        return diff == 0 ? new BigInteger(defaultMismatchValueIdentifier) : secondMax;
    }
}
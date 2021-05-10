import java.util.Scanner;

public class SecondMax {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            String[] inputArray = new String[n];
            for (int i = 0; i < n; i++) {
                inputArray[i] = s.next();
            }
            long secondMax = findSecondMaximum(inputArray);
            System.out.println("SecondMax :" + secondMax);
        }


    }

    private static long findSecondMaximum(String[] inputArray) {
        if (inputArray == null || inputArray.length <= 1)
            return -1;

        long max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;

        for (int i = 0; i < inputArray.length; i++) {
            long value = Long.parseLong(inputArray[i]);
            if (value > max) {
                secondMax = max;
                max = value;
            } else if (value > secondMax) {
                secondMax = max;
            }
        }

        return secondMax != max ? secondMax : -1;
    }
}
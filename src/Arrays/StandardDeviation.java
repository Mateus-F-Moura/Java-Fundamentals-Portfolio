package Arrays;

import java.util.Scanner;

public class StandardDeviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] values = new double[10];
        double sum = 0.0;

        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextDouble();
            sum += values[i];
        }

        double mean = sum / values.length;
        double sumOfSquares = 0.0;

        for (double value : values) {
            sumOfSquares += Math.pow(value - mean, 2.0);
        }

        double populationStandardDeviation = Math.sqrt(sumOfSquares / values.length);
        double sampleStandardDeviation = Math.sqrt(sumOfSquares / (values.length - 1));

        System.out.printf("Population standard deviation: %.2f%n", populationStandardDeviation);
        System.out.printf("Sample standard deviation: %.2f%n", sampleStandardDeviation);

        sc.close();
    }
}

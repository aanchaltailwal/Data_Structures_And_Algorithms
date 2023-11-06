public class AverageCalculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        // Call the findAvg method to calculate and print the average
        findAvg(num1, num2, num3);
    }

    public static void findAvg(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        System.out.println("Average: " + avg);
    }
}

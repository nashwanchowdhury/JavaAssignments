public class AverageMethod {
    public static void main(String[] args) {
    average(2, 3, 4);
    }
    public static int sum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }
    public static void average(int a, int b, int c) {
        int totalsum = sum(a, b, c);
        int avg = totalsum / 3;
        System.out.println("The average is: " + avg);

    }
}

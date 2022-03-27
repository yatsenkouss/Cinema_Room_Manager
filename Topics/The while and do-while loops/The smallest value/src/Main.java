import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        int counter = 0;
        while (m > 0) {
            counter++;
            m /= counter;
        }
        System.out.println(counter);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum = 20;
        boolean result = a + b == sum || a + c == sum || b + c == sum;
        System.out.println(result);
    }
}
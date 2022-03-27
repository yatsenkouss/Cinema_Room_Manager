import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean run1 = a > 0 && b <= 0 && c <= 0;
        boolean run2 = b > 0 && a <= 0 && c <= 0;
        boolean run3 = c > 0 && b <= 0 && a <= 0;
        boolean result = run1 || run2 || run3;
        System.out.println(result);
    }
}
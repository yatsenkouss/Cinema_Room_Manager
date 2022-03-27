import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int army = scanner.nextInt();
        final int a = 19;
        final int b = 249;
        final int c = 999;
        if (army <= 0) {
            System.out.println("no army");
        } else if (army <= a) {
            System.out.println("pack");
        } else if (army <= b) {
            System.out.println("throng");
        } else if (army <= c) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}
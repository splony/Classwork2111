import java.util.Scanner;

public class New1 {
    private static Object i;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N;
        while (true) {
            System.out.print("Введите число N (1 < N < 50): ");
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                if (N >= 1 && N <= 50) {
                    break;
                } else {
                    System.out.println("Ошибка: число должно быть больше 1 и меньше 50!");
                }
            } else {
                System.out.println("Ошибка: введите целое число!");
                scanner.next();
            }
        }
        long factorial = 1;
        for (long i = 2; i <= N; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа " + N + " = " + factorial);

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int integerVal = scanner.nextInt();

        System.out.print("Введіть число з плаваючою точкою: ");
        double doubleVal = scanner.nextDouble();

        System.out.print("Введіть рядок (строку): ");
        String stringVal = scanner.next();

        System.out.print("Введіть логічне значення (true/false): ");
        boolean booleanVal = scanner.nextBoolean();

        System.out.println("\n--- Результати (10 різних форматів) ---");
        System.out.println("1. " + integerVal + " | " + doubleVal + " | " + stringVal + " | " + booleanVal);


        System.out.println("2. Текст: " + stringVal + ", Булеве: " + booleanVal + ", Int: " + integerVal + ", Double: " + doubleVal);

        System.out.printf("3. Int: %d, Double: %f, String: %s, Bool: %b\n", integerVal, doubleVal, stringVal, booleanVal);

        System.out.printf("4. Число з 2 знаками після коми: %.2f (ціле: %d, рядок: %s)\n", doubleVal, integerVal, stringVal);


        System.out.printf("5. Hex-число: %x, Логічне: %b\n", integerVal, booleanVal);

        System.out.printf("6. Octal-число: %o, Рядок: %s\n", integerVal, stringVal);


        System.out.printf("7. Обрізаний рядок: %.3s, Поле шириною 10: '%10s'\n", stringVal, stringVal);
        System.out.printf("8. Експоненційна форма: %e, Ціле: %d\n", doubleVal, integerVal);


        StringBuilder sb1 = new StringBuilder();
        sb1.append("9. [")
                .append(stringVal.toUpperCase())
                .append("] - [")
                .append(integerVal)
                .append("] - [")
                .append(booleanVal)
                .append("]");
        System.out.println(sb1.toString());
        
        StringBuilder sb2 = new StringBuilder();
        sb2.append("10. Результат -> ").append(doubleVal).append(" *** ").append(stringVal);
        System.out.println(sb2.toString());

        scanner.close();
    }
}
import java.util.Scanner;

public class Lab3_Nekludov_KB21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введи ціле число (наприклад, 42): ");
        int num = Integer.parseInt(scan.nextLine());

        System.out.print("Введи число з крапкою (наприклад, 3.14): ");
        double drob = Double.parseDouble(scan.nextLine());

        System.out.print("Введи будь-який текст (наприклад, твоє ім'я): ");
        String text = scan.nextLine();

        System.out.print("Введи логічне значення (true або false): ");
        boolean bool = Boolean.parseBoolean(scan.nextLine());

        System.out.println("\n--- РЕЗУЛЬТАТИ ВИВЕДЕННЯ (10 ФОРМАТІВ) ---");

        System.out.println("1. [Склеювання] Текст: " + text + ", Число: " + num + ", Дріб: " + drob + ", Логіка: " + bool);

        System.out.printf("2. [printf базовий] %s вибрав число %d, дріб %f і значення %b\n", text, num, drob, bool);

        System.out.printf("3. [printf округлення] Дріб округлено: %.2f\n", drob);

        System.out.printf("4. [printf зі знаком] Число: %+d, Дріб: %+.2f\n", num, drob);

        System.out.printf("5. [printf вирівнювання праворуч] |%15s| |%10d|\n", text, num);

        System.out.printf("6. [printf вирівнювання ліворуч]  |%-15s| |%-10d|\n", text, num);

        System.out.printf("7. [printf з нулями] ID: %05d, Точність: %08.2f\n", num, drob);

        String format8 = String.format("8. [String.format великі літери] %S ТА %B", text, bool);
        System.out.println(format8);

        String format9 = String.format("9. [String.format порядок] Задом наперед: Логіка=%4$b, Дріб=%3$.1f, Ціле=%2$d, Рядок=%1$s",
                text, num, drob, bool);
        System.out.println(format9);

        String format10 = String.format("10. [String.format фінал] === Дані користувача: [%s], Баланс: [%.2f], Статус: [%b] ===",
                text, drob, bool);
        System.out.println(format10);

        scan.close();
    }
}

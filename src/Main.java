import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int[] expensesMonth = {0};
        int sumExpenses = 0;
        for (int i = 0; i < expensesMonth.length; i++) {
            sumExpenses += expensesMonth[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumExpenses + " рублей");
        // Задача 2
        System.out.println("Задача 2");
        int[] expensesWeek = {1, 2, 3, 4, 5};
        if (expensesWeek.length > 0) {
            int minExpensesWeek = expensesWeek[0];
            int maxExpensesWeek = expensesWeek[0];
            for (int i : expensesWeek) {
                if (i > maxExpensesWeek) {
                    maxExpensesWeek = i;
                }
                if (i < minExpensesWeek) {
                    minExpensesWeek = i;
                }
            }
            System.out.println("Минимальная сумма трат за неделю составила " + minExpensesWeek + " рублей. Максимальная сумма трат за неделю составила " + maxExpensesWeek + " рублей.");
        } else {
            System.out.println("Траты и прибыль равны 0");
        }
        // Задача 3
        System.out.println("Задача 3");
        double averageExpenses = (double) sumExpenses / expensesMonth.length;
        if ((double) sumExpenses / expensesMonth.length == 0) {
            System.out.println("Средняя сумма трат за месяц составила 0 рублей");
        } else {
            System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", averageExpenses);
        }
        // Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
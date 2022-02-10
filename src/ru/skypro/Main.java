package ru.skypro;

public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] data = generateRandomArray();

        int monthSpending = 0;
        int maximumDaySpending = 100_000;
        int minimumDaySpending = 200_000;

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
            monthSpending += data[i];
            if (data[i] >= maximumDaySpending) {
                maximumDaySpending = data[i];
            }
            if (data[i] <= minimumDaySpending) {
                minimumDaySpending = data[i];
            }
        }
        // Задание 1
        System.out.println();
        System.out.println( "Сумма трат за месяц составила " + monthSpending + " рублей");
        // Задание 2
        System.out.println("Минимальная сумма трат за день составила " + minimumDaySpending + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maximumDaySpending + " рублей");
        // Задание 3
        float averageMonthSpending = (float) monthSpending / data.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageMonthSpending + " рублей");

        // Задание 4
        char[] reversFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reversFullName.length - 1; i >= 0; i--) {
            System.out.print(reversFullName[i]);
        }
    }
}

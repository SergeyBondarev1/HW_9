public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("сумма трат за месяц составляет " + sum + " рублей.");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int minSalary = 200001;
        int maxSalary = 99999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSalary) {
                minSalary = arr[i];
            }
        }
        System.out.println("минимальная зарплата "+minSalary+" рублей.");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSalary) {
                maxSalary = arr[i];
            }
        }
        System.out.println("максимальная зарплата "+maxSalary+" рублей.");
    }
    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]/30;
        }
        System.out.println("средняя сумма трат за месяц составляет " + sum + " рублей.");
    }
    public static void task4() {
        char [] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1;i>=0; i--) {
            System.out.print(reverseFullName[i]);
    }
}
}

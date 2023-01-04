public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1 () {
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
    }

    public static void task2 () {
        System.out.println("\nTask 2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task3 () {
        System.out.println("\nTask 3");
        for (int i = 2; i <= 17; i = i + 2) {
            System.out.println(i);
        }

    }

    public static void task4 () {
        System.out.println("\nTask 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task5 () {
        System.out.println("\nTask 5");
        for (int i = 1904; i <= 20104; i = i + 4) {
            if (i%4 == 0 && i%100 != 0 || i%400 == 0) {
                System.out.println(i + " is a leap year");
            }
        }
    }

    public static void task6 () {
        System.out.println("\nTask 6");
        for (int i = 7; i <= 99; i = i + 7) {
            System.out.print(i + " ");
        }
    }

    public static void task7 () {
        System.out.println("\n\nTask 7");
        for (int i = 1; i <= 513; i = i*2) {
            System.out.print(i + " ");
        }
    }

    public static void task8 () {
        System.out.println("\n\nTask 8");
        int salary = 29_000; //roubles
        int total = 0;
        for (int i = 1; i <= 12; i = i + 1) {
            total = total + salary;
            System.out.println("On the month #" + i + " savings are " + total + " roubles");
        }
    }

    public static void task9 () {
        System.out.println("\nTask 9");
        int salary = 29_000; //roubles
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += total/100;
            total += salary;
            System.out.println("On the month #" + i + " savings are " + total + " roubles");
        }
    }

    public static void task10 () {
        System.out.println("\nTask 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + i*2);
        }
    }
}
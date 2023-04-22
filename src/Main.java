import javax.sql.rowset.serial.SQLOutputImpl;

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

    public static void task1() {
        System.out.println("Задача1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("Итерация цикла" + i);
        }
    }

    public static void task2() {
        System.out.println("Задача2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println("Итерация цикла" + i);
        }
    }

    public static void task3() {
        System.out.println("Задача3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Итерация цикла" + i);
        }
    }

    public static void task4() {
        System.out.println("Задача4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println("Итерация цикла" + i);
        }
    }

    public static void task5() {
        System.out.println("Задача5");
        for (int a = 1904; a <= 2096; a = a + 4) {
            System.out.println(a + "год является високосным");
        }
    }

    public static void task6() {
        System.out.println("Задача6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("Задача7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("Задача8");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i = i + 1) {
            total = total + salary;
            System.out.println("месяц" + i + "сумма накоплений равна" + total);
        }
        System.out.println(total);

    }

    public static void task9() {
        System.out.println("Задача9");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i = i + 1) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("месяц" + i + "сумма накоплений равна" + total);
        }
        System.out.println(total);

    }

    public static void task10() {
        System.out.println("Задача10");
        int a = 2;
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(a + "*" + i + "=" + a * i);
        }
    }
}




public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        byte a = 127;
        short b = -32768;
        int c = 2147483647;
        long d = -9223372036854775808L;
        float e = 3.14f;
        double pi = 3.141592653589793;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(pi);
    }
    public static void task2() {
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
    }
    public static void task3() {
        byte ludmilaPavlovnaStudentCount = 23;
        byte annaSergeevnaStudentCount = 27;
        byte ekaterinaAndreevnaStudentCount = 30;
        short totalPaperSheets = 480;
        int totalStudents = ludmilaPavlovnaStudentCount + annaSergeevnaStudentCount + ekaterinaAndreevnaStudentCount;
        int paperPerStudent = totalPaperSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");
    }
    public static void task4() {
        byte bottlesPer2Minutes = 16; // Производительность за 2 минуты
        byte timeIncrement = 2; // Шаг времени (в минутах)
        int bottlesPer1Minutes = bottlesPer2Minutes / timeIncrement; // Производительность за 1 минуту
        int bottlesPer20Minutes = 20 * bottlesPer1Minutes; // Производительность за 20 минут
        int minutesInDay = 60 * 24; // Количество минут в сутках
        int bottlesPerDay = minutesInDay * bottlesPer1Minutes; // Производительность за 1 сутки
        int bottlesPer3Days = 3 * bottlesPerDay; // Производительность за 3 дня
        int daysInMonth = 30; // Количество дней в месяце
        int bottlesPerMonth = daysInMonth * bottlesPerDay; // Производителность за месяц
        System.out.println("За 20 минут машина произвела " + bottlesPer20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesPerMonth + " штук бутылок");

    }
}

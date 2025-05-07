public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
}

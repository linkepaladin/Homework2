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
    public static void task5() {
        int totalPaintCans = 120; // Всего банок краски
        int whitePaintPerClass = 2; // Количество банок белой краски на класс
        int brownPaintPerClass = 4; // Количество банок коричневой краски на класс
        int totalClasses = totalPaintCans / (whitePaintPerClass + brownPaintPerClass); // Рассчитываем количество классов
        int totalWhitePaint = totalClasses * whitePaintPerClass; // Количество купленной белой краски
        int totalBrownPaint = totalClasses * brownPaintPerClass; // Количество купленной коричневой краски
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
    }
    public static void task6() {
        int bananaWeightGrams = 80; // Вес 1 банана
        int milkWeightPer100Ml = 105; // Вес 100 мл молока
        int iceCreamWeightPerUnit = 100; // Вес 1 брикета мороженого
        int eggWeightGrams = 70; // Вес 1 яйца
        int bananasCount = 5; // Количество бананов
        int milkVolumeMl = 200; // Объем молока в мл
        int iceCreamUnits = 2; // Количество брикетов мороженого
        int eggsCount = 4; // Количество яиц
        int milkWeightGrams = (milkVolumeMl / 100) * milkWeightPer100Ml; // Пересчет мл в граммы
        int totalWeightGrams = (bananaWeightGrams * bananasCount) + milkWeightGrams + (iceCreamWeightPerUnit * iceCreamUnits) + (eggWeightGrams * eggsCount);
        double totalWeightKg = totalWeightGrams / 1000.0;
        System.out.println("Вес завтрака спортсмена составляет " + totalWeightKg + " килограмм");
        System.out.println("Вес завтрака спортсмена составляет " + totalWeightGrams + " грамм");
    }
    public static void task7() {
        int weightToLoseKg = 7; // Вес, который нужно сбросить (в кг)
        int minDailyLossGrams = 250; // Минимальная потеря веса в день (в граммах)
        int maxDailyLossGrams = 500; // Максимальная потеря веса в день (в граммах)
        int weightToLoseGrams = weightToLoseKg * 1000; // Переводим кг в граммы
        int daysForMinLoss = weightToLoseGrams / minDailyLossGrams; // Дней при потере 250 г/день
        int daysForMaxLoss = weightToLoseGrams / maxDailyLossGrams; // Дней при потере 500 г/день
        int avgDaysNeeded = (daysForMinLoss + daysForMaxLoss) / 2; // Среднее количество дней
        System.out.println("Если спортсменн будет терять каждый день по 250 грамм, то ему потребуется " + daysForMinLoss + " дней");
        System.out.println("Если спортсменн будет терять каждый день по 500 грамм, то ему потребуется " + daysForMaxLoss + " дней");
        System.out.println("В среднем спортсмену потребуется " + avgDaysNeeded + " дней, чтобы добиться результата");
    }
    public static void task8() {
        int mashasSalary = 67760; // Зарплата Маши
        int denisSalary = 83690; // Зарплата Дениса
        int kristinaSalary = 76230; // Зарплата Кристины
        double raisePercentage = 0.1; // 10% повышение
        int monthInYear = 12; // Месяцев в году
        double mashasRaise = mashasSalary * raisePercentage; // Размер повышения
        double mashasNewSalary = mashasSalary + mashasRaise; // Новая зарплата
        int mashasOldAnnual = mashasSalary * monthInYear; // Годовой доход ДО
        double mashasNewAnnual = mashasNewSalary * monthInYear; // Годовой доход ПОСЛЕ
        double mashasAnnualDifference = mashasNewAnnual - mashasOldAnnual; // Разница
        System.out.println("Маша теперь получает " + mashasNewSalary + " рублей. Годовой доход вырос на " + mashasAnnualDifference + " рублей");
        double denisRaise = denisSalary * raisePercentage;
        double denisNewSalary = denisSalary + denisRaise;
        int denisOldAnnual = denisSalary * monthInYear;
        double denisNewAnnual = denisNewSalary * monthInYear;
        double denisAnnualDifference = denisNewAnnual - denisOldAnnual;
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisAnnualDifference + " рублей");
        double kristinaRaise = kristinaSalary * raisePercentage;
        double kristinaNewSalary = kristinaSalary + kristinaRaise;
        int kristinaOldAnnual = kristinaSalary * monthInYear;
        double kristinaNewAnnual = kristinaNewSalary * monthInYear;
        double kristinaAnnualDifference = kristinaNewAnnual - kristinaOldAnnual;
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaAnnualDifference + " рублей");
    }
}

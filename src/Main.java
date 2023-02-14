public class Main {
    public static void main(String[] args) {
        var allWorkTime = 640;
        var workTime = 8;
        var workers = allWorkTime / workTime;
        System.out.println("Всего работников в компании " + workers + " человек");
        workers = workers + 94;
        workTime = allWorkTime / workers;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + workTime +
                            " часа работы может быть поделено между сотрудниками");
    }
}
public class Main {
    public static void main(String[] args) {
        var fighterWeight1 = 78.2;
        var fighterWeight2 = 82.7;
        var difWeight1 = fighterWeight2 - fighterWeight1;
        System.out.println("Разница в весе составляет " + difWeight1 + " кг");
        var difWeight2 = fighterWeight2 % fighterWeight1;
        System.out.println("Разница в весе составляет " + difWeight2 + " кг");
    }
}
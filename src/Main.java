public class Main {
    public static void main(String[] args) {
        int misha = 67760;
        System.out.println("Миша получает " + misha + " р / мес");
        int mishasAnnualSalaryBefore = misha * 12;
        System.out.println(mishasAnnualSalaryBefore + " р / год");
        double mishasSalaryNow = misha * 0.1 + misha;
        System.out.println(mishasSalaryNow + " р / мес после повышения");
        double mishasAnnulSalaryNow = mishasSalaryNow * 12;
        System.out.println(mishasAnnulSalaryNow + " р / год");
        double mishasDifference = mishasAnnulSalaryNow - mishasAnnualSalaryBefore;
        System.out.println("Миша теперь получает " + mishasSalaryNow + " рублей. "+ "Годовой доход вырос на " + mishasDifference + " рублей");
        int denis = 83690;
        System.out.println("Денис получает " + denis + " р");
        int denisAnnualSalaryBefore = denis * 12;
        System.out.println(denisAnnualSalaryBefore + " р / год");
        double denisSalaryNow = denis * 0.1 + denis;
        System.out.println(denisSalaryNow + " р / мес после повышения");
        double denisAnnulSalaryNow = denisSalaryNow * 12;
        System.out.println(denisAnnulSalaryNow + " р / год");
        double denisDifference = denisAnnulSalaryNow - denisAnnualSalaryBefore;
        System.out.println("Денис теперь получает " + denisSalaryNow + " рублей. "+ "Годовой доход вырос на " + denisDifference + " рублей");
        int kristina = 76230;
        System.out.println("Кристина получает " + kristina + " р");
        int kristinasAnnualSalaryBefore = kristina * 12;
        System.out.println(kristinasAnnualSalaryBefore + " р / год");
        double kristinasSalaryNow = kristina * 0.1 + kristina;
        System.out.println(kristinasSalaryNow + " р / мес после повышения");
        double kristinasAnnulSalaryNow = kristinasSalaryNow * 12;
        System.out.println(kristinasAnnulSalaryNow + " р / год");
        double kristinasDifference = kristinasAnnulSalaryNow - kristinasAnnualSalaryBefore;
        System.out.println("Кристина теперь получает " + kristinasSalaryNow + " рублей. "+ "Годовой доход вырос на " + kristinasDifference + " рублей");










    }
}
public class Main {
    public static void main(String[] args) {
        int bottle = 16;
        System.out.println(bottle);
        int time = 2;
        System.out.println(time);
        int productivity = bottle / time;
        System.out.println("продуктивность в минуту составляет " + productivity + " бутылок");
        int min20 = productivity * 20;
        System.out.println("за " + "20 минут" + " машины произвела бутылок " + min20 + " штук");
        int day = productivity * 1440;
        System.out.println("за " + "сутки" + " машины произвела бутылок " + day + " штук");
        int days3 = day * 3;
        System.out.println("за " + "3 дня" + " машины произвела бутылок " + days3 + " штук");
        int days30 = days3 * 10;
        System.out.println("за " + "30 дней" + " машины произвела бутылок " + days30 + " штук");





    }
}
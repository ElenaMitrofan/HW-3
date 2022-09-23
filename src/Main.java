public class Main {
    public static void main(String[] args) {
        int qtBananas = 5;
        System.out.println(qtBananas + " шт");
        int weightAllBananas = qtBananas * 80;
        System.out.println(weightAllBananas + " гр");
        int qtMilk = 200;
        System.out.println(qtMilk + "мл");
        int PortionOfMilk = qtMilk / 100;
        System.out.println(PortionOfMilk);
        int weightAllMilk = 105 * PortionOfMilk;
        System.out.println(weightAllMilk + " гр");
        int iceCream = 2;
        System.out.println(iceCream + " брикета");
        int weightAllIceCream = iceCream * 100;
        System.out.println(weightAllIceCream + " гр");
        int eggs = 4;
        System.out.println(eggs);
        int weightAllEggs = eggs * 70;
        System.out.println(weightAllEggs + " гр");
        int weightOfDiet = weightAllBananas + weightAllMilk + weightAllIceCream + weightAllEggs;
        System.out.println(weightOfDiet + " гр");




    }
}
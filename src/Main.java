public class Main {
    public static void main(String[] args) {
        byte sumOfCans = 120;
        System.out.println(sumOfCans);
        byte brownPaintIn1class = 4;
        System.out.println(brownPaintIn1class);
        byte whitePaintIn1Class = 2;
        System.out.println(whitePaintIn1Class);
        int sumOfCansIn1Class = brownPaintIn1class + whitePaintIn1Class;
        System.out.println(sumOfCansIn1Class);
        int sumOfClasses = sumOfCans / sumOfCansIn1Class;
        System.out.println(sumOfClasses);
        int brownPaintAll = sumOfClasses * brownPaintIn1class;
        System.out.println(brownPaintAll);
        int whitePaintAll = sumOfClasses * whitePaintIn1Class;
        System.out.println(whitePaintAll);
        System.out.println("В школе, где " + sumOfClasses + " классов, нужно " + whitePaintAll + " банок белой краски и " + brownPaintAll + " банок коричневой краски");


    }
}
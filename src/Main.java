public class Main {
    public static void main(String[] args) {
        int goal = 7;
        System.out.println(goal + " кг");
        int goalGr = goal * 1000;
        System.out.println(goalGr + " гр");
        int goalIn1Day1 = 250;
        System.out.println(goalIn1Day1 + " гр");
        int daysToGoal1 = goalGr / goalIn1Day1;
        System.out.println("для похудения потребуется " + daysToGoal1 + " дней");
        int goalIn1Day2 = 500;
        System.out.println(goalIn1Day2 + " гр");
        int daysToGoal2 = goalGr / goalIn1Day2;
        System.out.println("для похудения потребуется " + daysToGoal2 + " дней");







    }
}
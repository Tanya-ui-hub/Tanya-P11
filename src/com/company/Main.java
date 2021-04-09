public class Main {
    public static void main(String[] args) {
        int cash = 100;
        int arrive = 1100;
        int bonus = 0;
        if (arrive > 1000) {
            bonus = arrive / 100;
        }
        cash = cash + arrive + bonus;
        System.out.println("Бонус: " + bonus);
        System.out.println("Общая сумма: " + cash);
    }
}
public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int income = 1100;
        int bonus = 0;
        if (income > 1000) {
            bonus = income / 100;
        }
        balance = balance + income + bonus;
        System.out.println("Бонус: " + bonus);
        System.out.println("Общая сумма: " + balance);
    }
}
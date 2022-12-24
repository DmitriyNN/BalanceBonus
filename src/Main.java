public class Main {
    public static void main(String[] args) {
        int balance = 100; // первоначачальный баланс
        int plusBalance = 1237; // сумма пополнения
        int bonus; // бонус
        if (plusBalance > 1000) {
            bonus = plusBalance / 100;
        } else {
            bonus = 0;
        }
        int result = bonus + plusBalance + balance;
        System.out.println("Сумма начисленных бонус составит:" + bonus);
        System.out.println("Итоговый баланс с учетом начисленных бонусов составит:" + result);

    }
}
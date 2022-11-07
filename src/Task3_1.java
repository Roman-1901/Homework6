public class Task3_1 {
    public static void main(String[] args) {
        int money = 29000;
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum = sum + money;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + sum + " рублей");
        }
    }
}

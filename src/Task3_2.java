public class Task3_2 {
    public static void main(String[] args) {
        int money = 29000;
        double sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum += money + (sum + money) * 0.01;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + String.format("%.2f", sum) + " рублей");
        }
    }
}


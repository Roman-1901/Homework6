public class Task3_2 {
    public static void main(String[] args) {
        int money = 29000;
        double sum = 0;
        double monthlyProfit;
        for (int i = 1; i <= 12; i++) {
            if (i == 1) {
                monthlyProfit = money * 0.01;
                sum = monthlyProfit + money;
            } else {
                monthlyProfit = sum * 0.01;
                sum += monthlyProfit + money;
            }
            System.out.println("Месяц " + i + " , сумма накоплений равна " + String.format("%.2f", sum) + " рублей");
        }
    }
}


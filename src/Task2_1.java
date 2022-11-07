public class Task2_1 {
    //    public static void main(String[] args) {
//        for (int i = 1904; i <= 2096; i = i + 4) {
//            System.out.println(i + " год является високосным");
//        }
//    }
    // -----------Первый вариант с параметром i = i + 4 годится только потому, что 1904 год является високосным, во втором варианте представлен вариант решения, где можно задать люой диапазон
    public static void main(String[] args) {
        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0) {
                System.out.println(i + " год является високосным");
            }
        }
    }
}
